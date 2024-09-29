# docker

## installation

```bash

# update apt source
sudo apt-get update

# install dependencies
> sudo apt-get install ca-certificates curl gnupg
> sudo install -m 0755 -d /etc/apt/keyrings
> curl -fsSL https://download.docker.com/linux/ubuntu/gpg | sudo gpg --dearmor -o /etc/apt/keyrings/docker.gpg

# install docker gpg key
> sudo chmod a+r /etc/apt/keyrings/docker.gpg

# Add the repository to Apt sources:
> echo \
  "deb [arch=$(dpkg --print-architecture) signed-by=/etc/apt/keyrings/docker.gpg] https://download.docker.com/linux/ubuntu \
  $(. /etc/os-release && echo "$VERSION_CODENAME") stable" | \
  sudo tee /etc/apt/sources.list.d/docker.list > /dev/null

# update apt-source
> sudo apt-get update

# install docker
> sudo apt-get install docker-ce docker-ce-cli containerd.io docker-buildx-plugin docker-compose-plugin

# add your current user to docker group so that you wont need to use sudo for all the docker commands
> sudo usermod -aG docker $USER

# reboot the machine
> sudo reboot

# check the status of docker daemon
> sudo systemctl status docker

# start the docker daemon
> sudo systemctl start docker

# enable the docker to start after revery boot
> sudo systemctl enable docker

```

## docker images

```bash

# get the list of images downloaded on local machine
> docker image ls

# pull or download an image from registry to the local machine
# > docker image pull <image name>

# to pull httpd image from docker hub (public registry)
> docker image pull httpd

# to pull httpd image from private register
> docker image pull 192.168.1.50:5000/httpd

# get information of selected image
# > docker image inspect <image name>
> docker image inspect httpd

# remove an image from local machine
# > docker image rm <image name>
> docker image rm hello-world

```

## docker container

- every container can be uniquely identified using its id or name
- you can not create multiple containers using same name

```bash

# get the list of running (Up) containers
> docker container ls

# get the list of all (Created, Up, Exited) containers
> docker container ls -a

# create a new container
# > docker container create --name <container name> <image name>
> docker container create --name mycontainer httpd

# start a (exited or created) container
# > docker container start <container name or id>
> docker container start mycontainer

# stop a running (Up) container
# > docker container stop <container name or id>
> docker container stop mycontainer

# remove a stopped (exited) or created container
# Note: you can not remove a running container
# > docker container rm <container name or id>
> docker container rm mycontainer

# remove a running container
> docker container rm --force mycontainer

# run (create and start) a container in attached mode
# > docker container run --name <container name> <image name>
> docker container run --name mycontainer httpd

# run a container in detached mode
# > docker container run -d --name <container name> <image name>
> docker container run -d --name mycontainer httpd

# run a container in detached mode using interactive and teletype parameters
# -i: interactive communication with container
# -t: get a terminal out of the container (when needed)
# > docker container run -i -t -d --name <container name> <image name>
> docker container run -i -t -d --name mycontainer httpd
> docker container run -itd --name mycontainer httpd

# execute a command inside a selected container
# > docker container exec <container name> <command>
> docker container exec mycontainer date

# get the shell of container
# > docker container exec -it <container name> <bash/sh>
> docker container exec -it mycontainer bash

# run a container with port forwarding
# > docker container run -itd --name <container name> -p <local port>:<container port> <image name>
> docker container run -itd --name mycontainer -p 9090:80 httpd

```
