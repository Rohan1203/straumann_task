#base image
FROM openjdk:8-alpine
ADD target/StraumannAPIs-0.0.1.jar StraumannAPIs-0.0.1.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","StraumannAPIs-0.0.1.jar"]