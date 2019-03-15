# microservice-learn-english

## About
This ia very simple yet illustrative application that demonstrates the user of various libraries in Spring Cloud eco-system along with integrating Devops using container and orchestration technologies like Docker and Kubernetes. 

The application constructs a sentence using a combination of subject, noun, article, verb, adjective with each of these entities picking a word at random from their own properties file that aids in forming a sentence. 

## Stack
Spring Cloud:
 - Eureka: Service Discovery
 - Config-Server: Distributed Configuration
 - Ribbon: Client Side Load Balancing
 - Feign: Declarative Endpoint invocation
 - Hystrix: Circuit Breaker
 - Turbine: Service Monitoring
 
Devops:
 - Docker
 - Docker Compose
 - Kubernetes
 
Codebase:

| Code Base        | Application                         | Cloud Stack                |
| ---------------- |:-----------------------------------:| --------------------------:|
| discovery-server | discovery-server                    | Eureka                     |
| config-server    | config-server                       | Config                     |
| entity-service   | adjective,noun,verb,subject,article | REST                       |
| sentence-service | sentence                            | REST, Ribbon,Feign,Hystrix |

## Getting Started
 - Clone the Repo
 - Run mvn install on the various projects. This will also create docker images for each project
 - Alternativly download docker images from [DockerHub](https://hub.docker.com/r/vikrambindal/learn-english-microservice)
 - Individual entities are avaialable on http://localhost:{port}/word
 - Sentence formed using a combination is available on http://localhost:{port}/sentence
 - To see client side load balancing, run multiple instances of entities and invoke http://localhost:{port}/sentence?serverInfo=true . This will show different ports for each instance. 
 - Devops:
   - To run the application with docker: docker-compose up -d. This will start the application in order of the dependencies
   - To run the application with Kubernetes: kubectl create -f {name}-deployment.yml and kubectl create -f {name}-service.yml
   - The above assumes you have kubernetes, docker installed on your machine. 
