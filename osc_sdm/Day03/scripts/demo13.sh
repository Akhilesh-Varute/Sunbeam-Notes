#!/bin/bash

print_msg()
{
	echo "This is my first function"
}

print_number()
{
	# arguments are accessed like $1, $2, $3 ,....
	echo "number = $1"
}

addition()
{
	# arg1 = $1
	# arg2 = $2
	res=`expr $1 + $2`
	echo $res
}



print_msg
print_number 100
sum=`addition 10 20`
echo "sum = $sum"





