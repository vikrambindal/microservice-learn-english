README:

- Compile: maven clean install -> this will spill out docker images

# Docker 
it first starts up discovery server then config-server then all the other services
this is done otherwise if all services started in parallel, they fail during startup as
config-server not up and running yet, which is uncessary clutter

# Docker Compose
- Run: docker-compose up -d
- Process: docker-compose ps
- Logs: docker-compose logs -f
- Down: docker-compose down

# Tagging Images
docker tag discovery-server vikrambindal/learn-english-microservice:discovery-server
docker tag adjective-service vikrambindal/learn-english-microservice:adjective-service
docker tag article-service vikrambindal/learn-english-microservice:article-service
docker tag noun-service vikrambindal/learn-english-microservice:noun-service
docker tag verb-service vikrambindal/learn-english-microservice:verb-service
docker tag subject-service vikrambindal/learn-english-microservice:subject-service
docker tag sentence-service vikrambindal/learn-english-microservice:sentence-service

# Pushing Images
docker push vikrambindal/learn-english-microservice:adjective-service
docker push vikrambindal/learn-english-microservice:article-service
docker push vikrambindal/learn-english-microservice:noun-service
docker push vikrambindal/learn-english-microservice:verb-service
docker push vikrambindal/learn-english-microservice:subject-service
docker push vikrambindal/learn-english-microservice:sentence-service
docker push vikrambindal/learn-english-microservice:discovery-server
