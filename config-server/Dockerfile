FROM openjdk:jre-alpine
VOLUME /tmp
ARG JAR_FILE

RUN apk add --update \
    curl \
    && rm -rf /var/cache/apk/*

ENV _JAVA_OPTIONS "-Xms512m -Xmx512m"
EXPOSE 8761 8888
COPY ${JAR_FILE} /opt/app.jar

WORKDIR /opt
ENTRYPOINT ["java", "-jar", "/opt/app.jar"]