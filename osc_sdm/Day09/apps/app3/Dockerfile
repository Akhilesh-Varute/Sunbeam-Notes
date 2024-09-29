FROM node

# check if /src exists
# create the directory if it does not exist
# set the /src as working directory
WORKDIR /src

# copy everything from (local) current directory to /src of image
COPY . .

# expose the port for external consumption (port forwarding)
EXPOSE 4000

# execute this command when container starts
CMD node index.js