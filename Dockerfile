FROM openjdk:11-jre-slim
EXPOSE 8080
ARG JAR_FILE=target/kubernates.jar
COPY  ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]