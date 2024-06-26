FROM bitnami/java:17

EXPOSE 8080

WORKDIR /app

COPY /build/libs/demo-cloud-run-app-0.0.1-SNAPSHOT.jar /app/demo-cloud-run-app-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java", "-jar", "./demo-cloud-run-app-0.0.1-SNAPSHOT.jar"]