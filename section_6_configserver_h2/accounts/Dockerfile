#starts with  a base image containing Java Runtime
FROM openjdk:21-jdk-slim

#Information around who maintains the image
MAINTAINER eazybytes.com

RUN apt-get update &&\
   apt-get install -y curl

# Add the application's jar to the image
COPY target/accounts-0.0.1-SNAPSHOT.jar accounts-0.0.1-SNAPSHOT.jar

#execute the application
ENTRYPOINT ["java","-jar","accounts-0.0.1-SNAPSHOT.jar"]