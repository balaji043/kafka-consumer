# Kafka Consumer Example

Requirements : 
* Java JDK and JRE - required for running Zookeeper
* Zookeeper - required for running Kafka
* Kafka

## Kafka : ##
Apache Kafka is an open-source stream-processing software platform developed by LinkedIn and donated to the Apache Software Foundation,
written in Scala and Java. The project aims to provide a unified, high-throughput, low-latency platform for handling real-time data
feeds.

## Zookeeper : ##
Apache ZooKeeper is a software project of the Apache Software Foundation. It is essentially a service for distributed 
systems offering a hierarchical key-value store, which is used to provide a distributed configuration service,
synchronization service, and naming registry for large distributed systems.


### Steps to run Zookeeper : ###

* Download apache-zookeeper-3.5.6-bin.tar from http://zookeeper.apache.org/releases.html
* Extract the files.
* Rename the file "zoo_sample.config" to "zoo.config" %LOCATION%\apache-zookeeper-3.5.6-bin\config
* Open zoo.config file.
* Change dataDir=%LOCATION%\apache-zookeeper-3.5.6-bin\bin
* Open Environment Variables and add variable.
    ZOOKEEPER=%LOCATION%\apache-zookeeper-3.5.6-bin
* Add new variable in PATH
    %ZOOKEEPER%/bin
* Open Command prompt and run command zkserver.

### Steps to run Kafka : ###

* Download  kafka_2.11-2.3.1.tgz from http://kafka.apache.org/downloads.html
* Extract the files.
* Open server.properties file in %LOCATION%\kafka_2.11-2.3.1\config
  change log.dirs=%LOCATION%\kafka_2.11-2.3.1
* PATH=%LOCATION%\kafka_2.11-2.3.1\bin\windows
* To start the kafka server
    %PATH%>.\bin\windows\kafka-server-start.bat .\config\server.properties
* To publish or create a new topic  
    %PATH%>kafka-topics.bat --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic test
* To run a producer
    %PATH%>kafka-console-producer.bat --broker-list localhost:9092 --topic test
* To run a consumer  
    %PATH%>kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic KafkaExample --from-beginning
