#!/bin/bash

# case $var in
# 1)
#	...
# 	;;
# 2)
#	...
#	;;
# *)
#	...
#	;;
# esac

echo "1. Add"
echo "2. Sub"
echo -n "Enter your choice : "
read choice

echo -n "Enter two operands : "
read num1 num2

case $choice in
1)
	res=`expr $num1 + $num2`
	;;
2)
	res=`expr $num1 - $num2`
	;;
*)
	echo "Invalid choice"
	;;
esac

echo "result = $res"
	











