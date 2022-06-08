FROM openjdk:12-alpine

MAINTAINER xpq

ENV SPRING_OUTPUT_ANSI_ENABLED=ALWAYS \
    JAVA_OPTS="" \
    PORT=80


ADD /target/*.jar /app.jar

ENTRYPOINT ["sh", "-c", "java $JAVA_OPTS -jar /app.jar "]

EXPOSE $PORT
