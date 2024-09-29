# docker

## swarm

- also known as a docker cluster
- cluster: group of machines

```bash

# check if machine is a part of any swarm
# inactive: machine is not part of any swarm
# active: machine is a part of a swarm
> docker info | grep Swarm

# initialize the swarm (cluster)
> docker swarm init

# add a node
# note: the token decides whether the node will be added as a worker or a manager
> docker swarm join --token <token>

# generate a token for adding a node as a worker
> docker swarm join-token worker

# generate a token for adding a node as a manager
> docker swarm join-token manager

# remove the current node (Worker) from the swarm
> docker swarm leave

# remove the current node (manager) from the swarm
> docker swarm leave --force

```

## node

- this is a machine running docker as container runtime
- also known as a host

```bash

# get the list of nodes
> docker node ls

# get details of a selected node
> docker node inspect <node id>

# promote a worker as a manager
> docker node promote <node id>

# demote a manager as a worker
> docker node demote <node id>

# when the leader manager is not available, the election is conducted to elect of the managers as a leader using and algorithm known as Raft consensus

```

## service

```bash

# get the list of services
> docker service ls

# create a service
# > docker service create --name <service name> <image name>
> docker service create --name myservice httpd

# create a service to run an application with 5 containers
# > docker service create --name <service name> --replicas <desired count> <image name>
> docker service create --name myservice --replicas 5 httpd

# create a service to forward the port no 9090 to 80
> docker service create --name myservice --replicas 1 -p 9090:80 httpd

# get the list of containers started by the service
# > docker service ps <service name>
> docker service ps myservice

# remove a selected service
# > docker service rm <service name>
> docker service rm myservice

# horizontally scale the service
# > docker service scale <service name>=<new desire count>
> docker service scale myservice=5

```
