# Kafka Consumer Demo

## Project Description
This project demonstrates a Kafka Consumer built using Spring Boot. The consumer listens to messages from a Kafka topic and processes them.

### Technologies Used
- Java 22.0.1 (JDK 22)
- Spring Boot 3.x
- Apache Kafka
- Docker (for Kafka and Zookeeper)

## Setup Instructions

### Pre-Requisites
- Install Docker Desktop.
- Install Git for version control.
- Kafka and Zookeeper running locally.

### Run Kafka and Zookeeper
Start Zookeeper:
```bash
docker run -d --name zookeeper -p 2181:2181 zookeeper
```

Start Kafka:
```bash
docker run -d --name kafka -p 9092:9092 --link zookeeper:zookeeper     -e KAFKA_ZOOKEEPER_CONNECT=zookeeper:2181     -e KAFKA_ADVERTISED_LISTENERS=PLAINTEXT://localhost:9092     -e KAFKA_OFFSETS_TOPIC_REPLICATION_FACTOR=1     confluentinc/cp-kafka
```

### Run the Consumer Application
1. Clone the repository.
2. Open the project in an IDE (IntelliJ or Eclipse).
3. Run the application.

### How to Test
1. Send messages to the Kafka topic:
   ```bash
   docker exec kafka kafka-console-producer --broker-list localhost:9092 --topic test-topic
   > Hello Kafka Consumer!
   ```
2. Verify the consumer logs:
   ```
   Received Message: Hello Kafka Consumer!
   ```

## Project Structure
- **KafkaConsumerConfig:** Configures the Kafka consumer properties.
- **KafkaMessageListener:** Listens to messages from Kafka topics.
- **application.yml:** Contains Kafka configurations.

---

This setup completes Assignment 2.