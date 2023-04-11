FROM openjdk:17-jdk
VOLUME /tmp
COPY target/demo-0.0.1-SNAPSHOT.jar app.jar
ENV JAVA_OPTS=""
ENTRYPOINT exec java -jar /app.jar