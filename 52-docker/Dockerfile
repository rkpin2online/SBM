FROM openjdk:8
VOLUME /temp
EXPOSE 9090
ADD target/52-docker-1.0.jar 52-docker-1.0.jar
ENTRYPOINT ["java","-jar","/52-docker-1.0.jar"]