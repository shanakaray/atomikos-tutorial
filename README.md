# Atomikos Tutorial
<img src="https://github.com/atomikos/transactions-essentials/blob/master/.github/Atomikos_Logo_Background.png" width="80" height="80"> Spring Framework  <img src="https://github.com/atomikos/transactions-essentials/blob/master/.github/Atomikos_Logo_Background.png" width="80" height="80" > Atomikos

### [Atomikos](https://www.atomikos.com) tutorial and test eventual data consistency with micro-services.

### Prerequisites 
- Openjdk version "11.0.9" 2020-10-20 or higher.
- Maven 3.6.2 or higher. 
- Docker 20.10.2 or higher.

### Instructions

- "To build jar file" `mvn clean install`
- "To build docker image" `mvn spring-boot:build-image docker` default image name `docker.io/mybank-api:0.0.1-SNAPSHOT:0.0.1-SNAPSHOT`
- `cd /docker/` and execute `% docker-compose up -d`
