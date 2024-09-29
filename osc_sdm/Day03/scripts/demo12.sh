#!/bin/bash

# Logical operators : -a, -o, !

echo -n "Enter file name : "
read file

if [ -e $file ]
then
	if [ -f $file -a -x $file ]
	then
		echo "file is regular file with execute permissions"
	else
		echo "file is either directory or do not have execute permissions"
	fi
else
	echo "file does not exist"
fi



