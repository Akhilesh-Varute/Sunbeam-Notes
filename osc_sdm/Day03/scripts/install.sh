#!/bin/bash

pkgs=("vim" "gcc" "ncal" "valgrind")

echo "Updating package list....."
sudo apt-get update
if [ $? -ne 0 ]
then
	echo "Unable to update package list"
	exit
fi

echo "Installing packages...."
for pkg in ${pkgs[*]}
do
	sudo apt-get install $pkg
	if [ $? -ne 0 ]
	then
		echo "$pkg is not installed"
	fi
done











