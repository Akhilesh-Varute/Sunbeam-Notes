# git

## commands

- types
  - plumbing commands
    - used by users/developers
    - e.g. git add, git init, git commit
  - porcelain commands
    - internal commands
    - used by git internally when user uses plumbing command
    - e.g. git write-object, git cat-file

## git plumbing commands

```bash

# get the status of a file
> git status -s

# ??: untracked
# A : added to staging area
#  M: modified in working directory
# M : modified and added to staging area
#  D: deleted from working directory
# D : deleted from working directory and the change is added to staging area
# UU: conflicted file

```

## git internals

- git init will initialize an empty repository
- the .git contains
  - hooks
    - hooks to handle the git events
    - e.g. pre-push, commit
  - objects
    - contains objects
    - every object is identified with an object id (file name)
    - object id is of 40 characters
    - first 2 characters are used to create a directory inside objects directory and remaining 38 characters are used to create a file name
    - types
      - blob
        - as soon as you add a change in a file, git internally creates a blob object
        - file which contains the contents of the file in encrypted format which gets added to the staging area
      - tree
        - contains the mapping of the blob object(s) and the file names
        - contains
          - entry type
            - 100644: file
            - 100755: directory
          - object type
            - blob
            - stash
          - object id
          - file name
      - commit
        - used to store the commit information
          - author name and email
          - committer name and email
          - commit date and time stamp
          - commit message
          - tree object id
          - parent object id
            - the first commit does not contain any parent object id

```bash

# read the contents of an object
> git cat-file -p <object id>

# garbage collect all the unneccessary objects
# note: this will compact the history
> git gc

# get hash of a file
> git hash-object <file name>

```

## branch commands

```bash

# get the list of branches
> git branch

# create a new branch
# > git branch <new branch name>
> git branch b1

# get the current branch
# - the current branch in the list will have a * prefix
> git branch
# - this commands shows the current branch
> git status

# switch to another branch
> git checkout <branch name>

# create a new branch and checkout immediately
> git checkout -b <mew branch name>

# merge a branch to another
# note: first checkout the branch in which you want to merge the current branch
# to merge branch b2 into main, first checkout main branch
> git checkout main
# merge b2 into main
> git merge b2

# delete a selected branch
> git branch -d <branch name>

```

## branch internals

- branch: latest commit id
- when a branch is created, git creates a new file with branch name under .git/refs/heads which contains the latest commit id
- by default git used ort (ours and then theirs) strategy

## shared or remote repository

```bash

# check if the local repo is connected with remote repo
> git remote -v

# add a remote repository to the local repository
# > git remote add <alias> <remote repository path>
> git remote add origin https://github.com/pythoncpp/dac-kard-sept-2023.git

# push the changes from local to remote repo
> git push <alias> <branch>

```
