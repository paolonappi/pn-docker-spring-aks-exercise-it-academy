
Simple exercise for new Docker & Kubernetes on Azure trainee of the IT Learning & Training Academy

Exercise goals

Distribute a Docker image on an Azure registry

Deploy workloads and services on a Kubernetes cluster 

Preconditions

1. Docker is installed on your machine

2. You have access to an Azure Subscription, someone created for your the AKS Kubernetes cluster and ECR Docker registry 

Exercise Steps

1. Donwload the code

Use the git command line or manually using the web console

2. Build the polybe Docker image

docker build -t polybe:latest . 

3. Run the Docker polybe image as Container and check it works

docker run -d -p 8080:8080 polybe:latest

4. Execute login to the AKS cluster (replace RESOURCE_GROUP_NAME, CLUSTER_NAME)

az aks get-credentials --resource-group RESOURCE_GROUP_NAME --name CLUSTER_NAME

5. Execute login to the ECR registry 

az acr login --name REG_NAME.azurecr.io

6. Tag and push the polybe Docker image on the Azure registry (replace REG_NAME)

docker tag polybe:latest REG_NAME.azurecr.io/polybe

docker push REG_NAME.azurecr.io/polybe

7. Create a namespace for development enviroment, fell free to create testing and production too

kubectl create -f development-namespace.yaml  

8. Create a deployment (workloads) for the polybe Docker image 

kubectl create -f deployment_dev.yaml

9. Create a service as an external load balancer for your application

kubectl create -f service_dev.yaml
