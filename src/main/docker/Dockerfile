FROM frolvlad/alpine-oraclejdk8
VOLUME /tmp
ADD spring-boot-docker-harbor-1.0.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]