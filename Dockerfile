FROM openjdk:21-ea-19-jdk
COPY ./target/*.jar /app/application.jar
EXPOSE 8000
ENTRYPOINT ["java","-jar","/app/application.jar"]