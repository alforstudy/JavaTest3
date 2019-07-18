#!bin/bash
mvn clean package
cp ./target/exam1-0.0.1-SNAPSHOT.jar ./docker/java
docker-compose up
