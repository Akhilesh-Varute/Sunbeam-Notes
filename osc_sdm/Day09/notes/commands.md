# docker

## images

### building custom images

- install the following extension in VS code

  - https://marketplace.visualstudio.com/items?itemName=ms-azuretools.vscode-docker

- create a file named Dockerfile
- use following instructions to customize the image
  - FROM:
    - used to decide a base image
    - you can create your image only from one base image
  - COPY:
    - used to copy the files to the docker image
    - syntax: COPY <local path> <image path>
  - WORKDIR:
    - used to set the present working directory of imag
  - CMD:
    - used to execute a command inside the container
    - every Dockerfile must container one and one CMD command
    - by default every container can execute one and only one command (specified in CMD instruction)
    - for any reason if the command mentioned in CMD stops, the container gets exited
    - the CMD instruction must be present at the end of the Dockerfile
  - EXPOSE:
    - expose a port for external consumption (used for port forwarding)

```bash

# build the image
# image name: name of the image to be built
# tag: more info like version
# context: the docker builds the image by reading the settings/files from this context (the path where the Dockerfile exists)
# > docker image build -t <image name:tag> <image context>
> docker image build -t mywebsite .


```

## container

```bash

# read the logs generated the container
# > docker container logs <container name or id>

# run a container with required environment variable
# > docker container run -itd --name <container name> -p <local port>:<container port> -e <variable name>=<variable value> <image name>
> docker container run -itd --name mysql -p 3307:3306 -e MYSQL_ROOT_PASSWORD=root mysql

# run a container with volume attached
# > docker container run -itd --name <container name> -p <local port>:<container port> -e <variable name>=<variable value> -v <volume name>:<container path> <image name>
> docker container run -itd --name mysql -p 3307:3006 -e MYSQL_ROOT_PASSWORD=root -v mysql-volume:/var/lib/mysql mysql


```

## volume

```bash

# get the list of volumes
> docker volume ls

# remove a volume
> docker volume rm <volume name>

# remove dangling volumes
> docker volume prune

# create a new volume
# > docker volume create <volume name>
> docker volume create mysql-volume

# get the details of selected volume
# > docker volume inspect <volume name>
> docker volume inspect mysql-volume
```
