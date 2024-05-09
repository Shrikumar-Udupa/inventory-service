FROM eclipse-temurin:17
COPY build/libs/inventory-service-0.0.1-SNAPSHOT.jar /opt/app/
WORKDIR /opt/app
EXPOSE 8092
CMD ["java", "-jar", "inventory-service-0.0.1-SNAPSHOT.jar"]