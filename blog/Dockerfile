FROM openjdk:8-jdk-alpine

MAINTAINER PRASHANT
LABEL description="Blog Microservice"
ADD  ./target/blog-0.0.1-SNAPSHOT.jar /app/service.jar
EXPOSE 7111
CMD ["java", "-Xmx1024m", "-jar", "/app/service.jar"]
