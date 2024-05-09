FROM eclipse-temurin:17
RUN mkdir /opt/app
COPY build/libs/inventory-service-0.0.1-SNAPSHOT.jar /opt/app
WORKDIR /opt/app
CMD ["java", "-jar", "inventory-service-0.0.1-SNAPSHOT.jar"]