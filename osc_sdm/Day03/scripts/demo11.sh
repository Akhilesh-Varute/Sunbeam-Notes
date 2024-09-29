#!/bin/bash

# file conditinals
#	-e $path	:	true if path exist
#	-f $file	:	true if file is regular file
#	-d $file	:	true if file is directory file

#	-r $file	: true if file has read permissions
#	-w $file	: true if file has write permissions
#	-x $file	: true if file has execute permissions


count=0

for entry in `ls`
do
	if [ -f $entry ]
	then
		count=`expr $count + 1`
	fi
done

echo "File count = $count"






