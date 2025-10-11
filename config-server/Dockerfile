# Sıfır bir makinede (FreeDOS) bu projeyi nasıl kurarım?
# işletim sistemi -> java -> maven -> proje -> run

# işletim sistemi -> java -> maven ✅
FROM maven:3.9-eclipse-temurin-21

# -> proje -> run
WORKDIR /app

COPY . .

RUN mvn clean package -DskipTests

ENTRYPOINT ["java","-jar","target/config-server-0.0.1-SNAPSHOT.jar"]
