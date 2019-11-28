FROM openjdk:8-jdk-alpine

MAINTAINER PRASHANT
LABEL description="Post Microservice"
ADD  ./target/post-0.0.1-SNAPSHOT.jar /app/service.jar
EXPOSE 7112
CMD ["java", "-Xmx1024m", "-jar", "/app/service.jar"]
