# kubernetes

## YAML extensions

- general yaml syntax
  - https://marketplace.visualstudio.com/items?itemName=redhat.vscode-yaml
- kubernetes extension
  - https://marketplace.visualstudio.com/items?itemName=ms-kubernetes-tools.vscode-kubernetes-tools

## installation

```bash

# download minikube
> curl -LO https://storage.googleapis.com/minikube/releases/latest/minikube-linux-amd64

# copy the minikube to local bin
> sudo install minikube-linux-amdt64 /usr/local/bin/minikube

# create an alias for kubectl
> vim ~/.bashrc
# add the following line in your bashrc
> alias kubectl="minikube kubectl --"
# reload the bashrc settings
> source ~/.bashrc

```

### minikube configuration

```bash

# get the status of cluster
> minikube status

# start the cluster
> minikube start

# stop the cluster
> minikube stop

# get the cluster dashboard (UI)
> minikube dashboard

# destroy the cluster
> minikube destroy

# go inside the cluster (connect to the cluster using ssh)
> minikube ssh

# expose the service for outside access
> minikube service <service name>

```

### pods

```bash

# get the list of pods
> kubectl get pods
> kubectl get pod
> kubectl get po

# get the list of pods with basic information
> kubectl get pods -o wide


# get the details of a selected pod
# > kubectl describe pod <pod name>
> kubectl describe pod pod1

# delete a pod
# > kubectl delete pod <pod name>
> kubectl delete pod pod1

# create a pod using yaml file
# > kubectl create -f <yaml file name>
> kubectl create -f pod1.yaml

```

### service

```bash

# get list of services
> kubectl get services
> kubectl get svc

# delete a selected service
> kubectl delete service <service name>

```
