FROM openjdk:jre-alpine
VOLUME /tmp
ARG JAR_FILE

ENV _JAVA_OPTIONS "-Xms512m -Xmx512m"

COPY ${JAR_FILE} /opt/app.jar

WORKDIR /opt
ENTRYPOINT ["java", "-jar", "/opt/app.jar", "--spring.application.name=sentence-dashboard"]