#!/bin/bash

# init
# while [ condition ]
# do
#	...
#	modification
# done

# init
# until [ condition ]
# do
#	...
#	modification
# done

num=5

i=1
# while [ $i -le 10 ]
until [ $i -eq 11 ]
do
	res=`expr $num \* $i`
	echo $res
	i=`expr $i + 1`
done








