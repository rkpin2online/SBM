FROM openjdk:8
VOLUME /temp
EXPOSE 8080
ADD target/ 51-RS-SBM-Docker-Test-1.0.war 51-RS-SBM-Docker-Test.war
ENTRYPOINT ["java","-jar","/51-RS-SBM-Docker-Test-1.0.war"]