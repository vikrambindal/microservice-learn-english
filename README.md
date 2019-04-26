# microservice-learn-english

## About
This ia very simple yet illustrative application that demonstrates the user of various libraries in Spring Cloud eco-system along with integrating Devops using container and orchestration technologies like Docker and Kubernetes. 

The application constructs a sentence using a combination of subject, noun, article, verb, adjective with each of these entities picking a word at random from their own properties file that aids in forming a sentence. 

## Stack

| Code Base          | Application                         | Cloud Stack         |
| ------------------ |:-----------------------------------:| -------------------:|
| discovery-server   | discovery-server                    | Eureka              |
| config-server      | config-server                       | Config              |
| entity-service     | adjective,noun,verb,subject,article | REST                |
| sentence-service   | sentence                            | REST, Ribbon,Feign  |
| sentence-dashboard | monitoring                          | Hystrix, Turbine    | 
| devops-k8s         | devops                              | docker, kubernetes  |

## Getting Started
 - Clone the Repo
 - Run mvn install on the various projects. This will also create docker images for each project
 - Alternativly download docker images from [DockerHub](https://hub.docker.com/r/vikrambindal/learn-english-microservice)
 - Individual entities are avaialable on http://localhost:{port}/word
 - Sentence formed using a combination is available on http://localhost:{port}/sentence
 - To see client side load balancing, run multiple instances of entities and invoke http://localhost:{port}/sentence?serverInfo=true . This will show different ports for each instance. 
 - Turbine: http://localhost:{port}/turbine.stream
 - Hystrix: http://localhost:{port}/actuator/hystrix.stream

 - Devops:
   - To run the application with docker: docker-compose up -d. This will start the application in order of the dependencies
   - To run the application with Kubernetes: kubectl create -f {name}-deployment.yml and kubectl create -f {name}-service.yml
   
| Code Base          | Port (docker-compose) | Port (k8s) | End-point |
| ------------------ |:---------------------:|:----------:|----------:|
| discovery-server   | 8888                  | 30000      |           |
| config-server      | 8761                  | 30001      |           |
| entity-service     |                       |            |           |
| - adjective        | 9020                  | 30003      | /word     |
| - noun             | 9040                  | 30005      | /word     |
| - verb             | 9000                  | 30007      | /word     |
| - article          | 9030                  | 30004      | /word     |
| sentence-service   | 9050                  | 30010      | /sentence |
| sentence-dashboard |                       |            |           | 

   - NOTE: The above assumes you have kubernetes, docker installed on your machine. 
