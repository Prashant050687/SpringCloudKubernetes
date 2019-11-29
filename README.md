# SpringCloudKubernetes
Setting up a spring cloud microservice using spring cloud kubernetes library

# Build
Ensure that projects are build in the following order before creating docker images\

spring-cloud-kubernetes-common(clean install)\
blog(clean install)\
post(clean install)

# Docker image build
docker image -t blog .\
docker image -t post .

