README:

Compile: maven clean install -> this will spill out docker images
Run: docker-compose up -d
Process: docker-compose ps
Logs: docker-compose logs -f
Down: docker-compose down

Docker: 
it first starts up discovery server then config-server then all the other services
this is done otherwise if all services started in parallel, they fail during startup as
config-server not up and running yet, which is uncessary clutter

turbine: http://localhost:8070/turbine.stream
hystrix: http://85c3c3b33343:9050/actuator/hystrix.stream

turbine internally points to sentence-service uri stream mentioned in hystrix above

App URL: http://localhost:9050/sentence?serverInfo=true


COnsuming services : REST API, Declaritivly
Configuration Properties Server
Circuit Breaker
Monitoring of services
Distirbuted Tracing

Eureka: Service Discovery
COnfig: Configuration Properties
Feign: Declarative Consumption of services
Hystrix: Circuit Breaker
Turbine: Monitoring
Zipkin/Slueth: Distributed Tracing


sentence: subject verb adjective article noun

dockerized
docker-compose

docker pull vikrambindal/learn-english-microservice:discovery-server


docker tag discovery-server vikrambindal/learn-english-microservice:discovery-server
docker push vikrambindal/learn-english-microservice:discovery-server

docker tag adjective-service vikrambindal/learn-english-microservice:adjective-service
docker tag article-service vikrambindal/learn-english-microservice:article-service
docker tag noun-service vikrambindal/learn-english-microservice:noun-service
docker tag verb-service vikrambindal/learn-english-microservice:verb-service
docker tag subject-service vikrambindal/learn-english-microservice:subject-service

docker tag sentence-service vikrambindal/learn-english-microservice:sentence-service

docker push vikrambindal/learn-english-microservice:adjective-service
docker push vikrambindal/learn-english-microservice:article-service
docker push vikrambindal/learn-english-microservice:noun-service
docker push vikrambindal/learn-english-microservice:verb-service
docker push vikrambindal/learn-english-microservice:subject-service

docker push vikrambindal/learn-english-microservice:sentence-service