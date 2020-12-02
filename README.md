# RabbitMQ-Project

### This is a RabbitMQ project.

### Tech Stack
  - Java 11
  - Spring Boot
  - RabbitMQ
  - Docker
  - Maven
  - Lombok
  
### Requirements

For building and running the application you need:
- [JDK 11](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) or newer . 
- [Maven 3](https://maven.apache.org)
- [Docker](https://www.docker.com/)
- [Lombok](https://projectlombok.org)

### Build & Run 

```
  docker-compose -f "FILE_LOCATION/docker-compose.yml" up -d 
```

```
  mvn clean install && mvn --projects project_name spring-boot:run
```

### Port
```
  http://localhost:8080
```

### RabbitMQ port ,username and password
```
  http://localhost:15672
  username:yusufyucedag
  password:ysfycd
  
```

![RabbitMQ]()
