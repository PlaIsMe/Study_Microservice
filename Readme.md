to build all of docker images: mvn clean compile jib:build

to run docker-compose: docker-compose --env-file .env up