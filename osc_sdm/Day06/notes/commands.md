# git

## git installation

```bash

# debian based linux (ubuntu)
> sudo apt-get install git

# RH based linux (fedora or centos)
> sudo yum install git

# windows: download gitscm from git-scm.org

# macOS
> brew install git

```

## one time configuration

```bash

# get the list of global attributes
> git config --global --list

# set the user name
# > git config --global --user.name <user name>
> git config --global --user.name "Amit"

# set the user email
# > git config --global --user.email <user email>
> git config --global --user.email "amit.kulkarni@sunbeaminfo.com"

```

## basic workflow

```bash

# initialize an empty git repository
> git init

# this command create a subdirectory named .git, which contains
# files
# - HEAD: name of present branch
# - config: local configuration of repository
# - description: description of repository
# directories
# - hooks: contains the hooks which will be called on different events
# - info: contains information about repository
# - objects: *** the versions are stored
# - refs: stores the branch information

# get current status of working directory
> git status

# get current status in one line of working directory
> git status -s

# status
# - two characters status
#   - first: status of the file against the staging area
#   - second: status of the file against the working directory
# ??: the file is untracked (once)
# A : the changes to the file are added to the staging area
#  M: the file is modified (in working directory) but the changes are not yet added to the staging area
# M : the file is modified and present in the staging area
#

# add the changes to the staging area
> git add <file name>

# add the changes in the current directory to staging area
> git add .

# commit the changes to the repository
> git commit -m <message>

# get the difference between the current version (the one in working directory) and the last one (the one in the repository)
> dit diff

# get list of all the commits
> git log
# every entry in the log contains
# - commit id (40 character long id which identifies every commit uniquely)
# - author
# - date time stamp
# - message

# get the list of commits with
# --oneline: one line information
# --color: show color while showing output
# --graph: show the commit graph while showing output
> git log --oneline --graph --color


# get the last version from repository and replace in working directory
# note: you will loose all the changes
> git checkout <file name>

# remove the changes from staging area (soft reset)
> git reset

# remove the changes from staging are as well as from working directory (hard reset)
# WARNING: EXECUTE THIS COMMAND ON YOUR OWN RISK
> git reset --hard

```
