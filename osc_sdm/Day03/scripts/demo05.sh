#!/bin/bash

echo -n "Enter radius : "
read r

area=`echo "3.142 * $r * $r" | bc`

echo "area = $area"
