FROM eclipse-temurin:17
RUN mkdir /opt/app
COPY inventory-service-0.0.1-SNAPSHOT.jar /app
WORKDIR /app
CMD ["java", "-jar", "inventory-service-0.0.1-SNAPSHOT.jar"]