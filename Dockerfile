#base image
FROM openjdk:8-alpine
ADD target/StraumannAPIs-0.0.1.jar StraumannAPIs-0.0.1.jar
COPY .env .
EXPOSE 8080
CMD [ "export $(cat .env | xargs)" ]
ENTRYPOINT ["java","-jar","StraumannAPIs-0.0.1.jar"]