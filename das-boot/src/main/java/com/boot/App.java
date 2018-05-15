package com.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App 
{
    public static void main(String[] args)
    {
        SpringApplication.run(App.class, args);
    }
}

/* curl start.spring.io
  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
:: Spring Initializr ::  https://start.spring.io

This service generates quickstart projects that can be easily customized.
Possible customizations include a project's dependencies, Java version, and
build system or build structure. See below for further details.

The services uses a HAL based hypermedia format to expose a set of resources
to interact with. If you access this root resource requesting application/json
as media type the response will contain the following links:
+-----------------+-----------------------------------------+
| Rel             | Description                             |
+-----------------+-----------------------------------------+
| gradle-build    | Generate a Gradle build file            |
| gradle-project  | Generate a Gradle based project archive |
| maven-build     | Generate a Maven pom.xml                |
| maven-project * | Generate a Maven based project archive  |
+-----------------+-----------------------------------------+


The URI templates take a set of parameters to customize the result of a request
to the linked resource.
+-----------------+------------------------------------------+------------------------------+
| Parameter       | Description                              | Default value                |
+-----------------+------------------------------------------+------------------------------+
| applicationName | application name                         | DemoApplication              |
| artifactId      | project coordinates (infer archive name) | demo                         |
| baseDir         | base directory to create in the archive  | no base dir                  |
| bootVersion     | spring boot version                      | 2.0.2.RELEASE                |
| dependencies    | dependency identifiers (comma-separated) | none                         |
| description     | project description                      | Demo project for Spring Boot |
| groupId         | project coordinates                      | com.example                  |
| javaVersion     | language level                           | 1.8                          |
| language        | programming language                     | java                         |
| name            | project name (infer application name)    | demo                         |
| packageName     | root package                             | com.example.demo             |
| packaging       | project packaging                        | jar                          |
| type            | project type                             | maven-project                |
| version         | project version                          | 0.0.1-SNAPSHOT               |
+-----------------+------------------------------------------+------------------------------+


The following section has a list of supported identifiers for the comma-separated
list of "dependencies".
+--------------------------------------+------------------------------------------------------------------------------------------------------------------------------------------------+-------------------------------+
| Id                                   | Description                                                                                                                                    | Required version              |
+--------------------------------------+------------------------------------------------------------------------------------------------------------------------------------------------+-------------------------------+
| activemq                             | Java Message Service API via Apache ActiveMQ                                                                                                   | >=1.4.0.RC1                   |
| actuator                             | Production ready features to help you monitor and manage your application                                                                      |                               |
| actuator-docs                        | API documentation for the Actuator endpoints                                                                                                   | >=1.3.0.RELEASE and <2.0.0.M1 |
| amqp                                 | Advanced Message Queuing Protocol via spring-rabbit                                                                                            |                               |
| aop                                  | Create your own Aspects using Spring AOP and AspectJ                                                                                           |                               |
| artemis                              | Java Message Service API via Apache Artemis                                                                                                    | >=1.3.0.RELEASE               |
| azure-active-directory               | Spring Security integration with Azure Active Directory for authentication                                                                     | >=1.5.4.RELEASE               |
| azure-keyvault-secrets               | Spring value annotation integration with Azure Key Vault Secrets                                                                               | >=1.5.4.RELEASE               |
| azure-storage                        | Azure Storage service integration                                                                                                              | >=1.5.4.RELEASE               |
| azure-support                        | Auto-configuration for Azure Services (service bus, storage, active directory, cosmos DB, key vault and more)                                  | >=1.5.4.RELEASE               |
| batch                                | Spring Batch support                                                                                                                           |                               |
| cache                                | Spring's Cache abstraction                                                                                                                     | >=1.3.0.RELEASE               |
| camel                                | Integration using Apache Camel                                                                                                                 | >=1.4.0.RELEASE and <2.0.0.M1 |
| cloud-aws                            | AWS native services from spring-cloud-aws                                                                                                      | >=1.2.3.RELEASE               |
| cloud-aws-jdbc                       | Relational databases on AWS with RDS and spring-cloud-aws-jdbc                                                                                 | >=1.2.3.RELEASE               |
| cloud-aws-messaging                  | Messaging on AWS with SQS and spring-cloud-aws-messaging                                                                                       | >=1.2.3.RELEASE               |
| cloud-bus                            | A simple control bus using Spring Cloud Stream (requires a binder, e.g. Kafka or RabbitMQ)                                                     | >=1.2.3.RELEASE               |
| cloud-cloudfoundry-discovery         | Service discovery with Cloud Foundry                                                                                                           | >=1.3.0.RELEASE               |
| cloud-config-client                  | spring-cloud-config Client                                                                                                                     | >=1.2.3.RELEASE               |
| cloud-config-server                  | Central management for configuration via a git or svn backend                                                                                  | >=1.2.3.RELEASE               |
| cloud-connectors                     | Simplifies connecting to services in cloud platforms, including spring-cloud-connector and spring-cloud-cloudfoundry-connector                 | >=1.2.0.RELEASE               |
| cloud-contract-stub-runner           | Stub Runner for HTTP/Messaging based communication. Allows creating WireMock stubs from RestDocs tests                                         | >=1.4.0.RC1                   |
| cloud-contract-verifier              | Test dependencies required for autogenerated tests                                                                                             | >=1.4.0.RC1                   |
| cloud-eureka                         | Service discovery using spring-cloud-netflix and Eureka                                                                                        | >=1.2.3.RELEASE               |
| cloud-eureka-server                  | spring-cloud-netflix Eureka Server                                                                                                             | >=1.2.3.RELEASE               |
| cloud-feign                          | Declarative REST clients with spring-cloud-netflix Feign                                                                                       | >=1.2.3.RELEASE               |
| cloud-gateway                        | Intelligent and programmable routing with the reactive Spring Cloud Gateway                                                                    | >=2.0.0.M5                    |
| cloud-gcp                            | Support for Google Cloud Platform services                                                                                                     | >=2.0.0.RELEASE               |
| cloud-gcp-pubsub                     | Publish to and subcribe from Google Cloud Pub/Sub topics                                                                                       | >=2.0.0.RELEASE               |
| cloud-gcp-storage                    | Access Google Cloud Storage objects                                                                                                            | >=2.0.0.RELEASE               |
| cloud-hystrix                        | Circuit breaker with spring-cloud-netflix Hystrix                                                                                              | >=1.2.3.RELEASE               |
| cloud-hystrix-dashboard              | Circuit breaker dashboard with spring-cloud-netflix Hystrix                                                                                    | >=1.2.3.RELEASE               |
| cloud-oauth2                         | OAuth2 and distributed application patterns with spring-cloud-security                                                                         | >=1.2.3.RELEASE               |
| cloud-ribbon                         | Client side load balancing with spring-cloud-netflix and Ribbon                                                                                | >=1.2.3.RELEASE               |
| cloud-security                       | Secure load balancing and routing with spring-cloud-security                                                                                   | >=1.2.3.RELEASE               |
| cloud-starter                        | spring-cloud-context (e.g. Bootstrap context and @RefreshScope)                                                                                | >=1.2.3.RELEASE               |
| cloud-starter-consul-config          | Configuration management with Hashicorp Consul                                                                                                 | >=1.3.0.RELEASE               |
| cloud-starter-consul-discovery       | Service discovery with Hashicorp Consul                                                                                                        | >=1.3.0.RELEASE               |
| cloud-starter-sleuth                 | Distributed tracing via logs with spring-cloud-sleuth                                                                                          | >=1.3.0.RELEASE               |
| cloud-starter-vault-config           | Configuration management with HashiCorp Vault                                                                                                  | >=1.5.3.RELEASE               |
| cloud-starter-zipkin                 | Distributed tracing with an existing Zipkin installation and spring-cloud-sleuth-zipkin. Alternatively, consider Sleuth Stream.                | >=1.3.0.RELEASE               |
| cloud-starter-zookeeper-config       | Configuration management with Zookeeper and spring-cloud-zookeeper-config                                                                      | >=1.3.0.RELEASE               |
| cloud-starter-zookeeper-discovery    | Service discovery with Zookeeper and spring-cloud-zookeeper-discovery                                                                          | >=1.3.0.RELEASE               |
| cloud-stream                         | Messaging microservices with Spring Cloud Stream (requires a binder, e.g. Kafka or RabbitMQ)                                                   | >=1.3.0.RELEASE               |
| cloud-task                           | Task result tracking and integration with Spring Batch                                                                                         | >=1.3.0.RELEASE               |
| cloud-turbine                        | Circuit breaker metric aggregation using spring-cloud-netflix with Turbine and server-sent events                                              | >=1.2.3.RELEASE               |
| cloud-turbine-stream                 | Circuit breaker metric aggregation using spring-cloud-netflix with Turbine and Spring Cloud Stream (requires a binder, e.g. Kafka or RabbitMQ) | >=1.3.0.RELEASE               |
| cloud-zuul                           | Intelligent and programmable routing with spring-cloud-netflix Zuul                                                                            | >=1.2.3.RELEASE               |
| codecentric-spring-boot-admin-client | Register your application with a Spring Boot Admin instance                                                                                    | >=1.5.9.RELEASE and <2.0.0.M1 |
| codecentric-spring-boot-admin-server | An admin interface for Spring Boot applications                                                                                                | >=1.5.9.RELEASE and <2.0.0.M1 |
| configuration-processor              | Generate metadata for your custom configuration keys                                                                                           | >=1.2.0.RELEASE               |
| cxf-jaxrs                            | RESTful Web Services framework with support of JAX-RS                                                                                          | >=1.4.0.RELEASE and <2.0.0.M1 |
| data-cassandra                       | Cassandra NoSQL Database, including spring-data-cassandra                                                                                      | >=1.3.0.RC1                   |
| data-cassandra-reactive              | Cassandra NoSQL Database, including spring-data-cassandra and the reactive driver                                                              | >=2.0.0.M1                    |
| data-couchbase                       | Couchbase NoSQL database, including spring-data-couchbase                                                                                      | >=1.4.0.RELEASE               |
| data-couchbase-reactive              | Couchbase NoSQL database, including spring-data-couchbase and the reactive driver                                                              | >=2.0.0.M7                    |
| data-elasticsearch                   | Elasticsearch search and analytics engine including spring-data-elasticsearch                                                                  |                               |
| data-gemfire                         | GemFire distributed data store including spring-data-gemfire                                                                                   | >=1.1.0.RELEASE and <2.0.0.M1 |
| data-jpa                             | Java Persistence API including spring-data-jpa, spring-orm and Hibernate                                                                       |                               |
| data-jpa                             | Java Persistence API including spring-data-jpa, spring-orm and Hibernate                                                                       |                               |
| data-ldap                            | LDAP support, including spring-data-ldap                                                                                                       | >=1.5.0.RC1                   |
| data-mongodb                         | MongoDB NoSQL Database, including spring-data-mongodb                                                                                          |                               |
| data-mongodb-reactive                | MongoDB NoSQL Database, including spring-data-mongodb and the reactive driver                                                                  | >=2.0.0.M1                    |
| data-neo4j                           | Neo4j NoSQL graph database, including spring-data-neo4j                                                                                        | >=1.4.0.RELEASE               |
| data-redis                           | Redis key-value data store, including spring-data-redis                                                                                        |                               |
| data-redis                           | Redis key-value data store, including spring-data-redis                                                                                        |                               |
| data-redis-reactive                  | Redis key-value data store, including spring-data-redis                                                                                        | >=2.0.0.M7                    |
| data-rest                            | Exposing Spring Data repositories over REST via spring-data-rest-webmvc                                                                        |                               |
| data-rest-hal                        | Browsing Spring Data REST repositories in your browser                                                                                         | >=1.3.0.RELEASE               |
| data-solr                            | Apache Solr search platform, including spring-data-solr                                                                                        |                               |
| derby                                | Apache Derby database (with embedded support)                                                                                                  | >=1.2.2.RELEASE               |
| devtools                             | Spring Boot Development Tools                                                                                                                  | >=1.3.0.RELEASE               |
| flapdoodle-mongo                     | Embedded MongoDB for testing                                                                                                                   | >=1.3.0.RELEASE               |
| flyway                               | Flyway Database Migrations library                                                                                                             |                               |
| freemarker                           | FreeMarker templating engine                                                                                                                   |                               |
| groovy-templates                     | Groovy templating engine                                                                                                                       |                               |
| h2                                   | H2 database (with embedded support)                                                                                                            |                               |
| hateoas                              | HATEOAS-based RESTful services                                                                                                                 | >=1.2.2.RELEASE               |
| hsql                                 | HSQLDB database (with embedded support)                                                                                                        |                               |
| integration                          | Common spring-integration modules                                                                                                              |                               |
| jdbc                                 | JDBC databases                                                                                                                                 |                               |
| jersey                               | RESTful Web Services framework with support of JAX-RS                                                                                          | >=1.2.0.RELEASE               |
| jooq                                 | Persistence support using Java Object Oriented Querying                                                                                        | >=1.3.0.RELEASE               |
| jta-atomikos                         | JTA distributed transactions via Atomikos                                                                                                      | >=1.2.0.RELEASE               |
| jta-bitronix                         | JTA distributed transactions via Bitronix                                                                                                      | >=1.2.0.RELEASE               |
| jta-narayana                         | JTA distributed transactions via Narayana                                                                                                      | >=1.4.0.RELEASE               |
| kafka                                | Kafka messaging support using Spring Kafka                                                                                                     | >=1.5.0.RC1                   |
| kafka-streams                        | Support for building stream processing applications with Apache Kafka Streams                                                                  | >=2.0.0.RELEASE               |
| keycloak                             | Keycloak integration, an open source Identity and Access Management solution.                                                                  | >=1.5.3.RELEASE and <2.0.0.M1 |
| liquibase                            | Liquibase Database Migrations library                                                                                                          |                               |
| lombok                               | Java annotation library which helps to reduce boilerplate code and code faster                                                                 |                               |
| mail                                 | Send email using Java Mail and Spring Framework's JavaMailSender                                                                               | >=1.2.0.RC1                   |
| mobile                               | Simplify the development of mobile web applications with spring-mobile                                                                         | >=1.0.0.RELEASE and <2.0.0.M1 |
| mustache                             | Mustache templating engine                                                                                                                     | >=1.2.2.RELEASE               |
| mybatis                              | Persistence support using MyBatis                                                                                                              |                               |
| mysql                                | MySQL JDBC driver                                                                                                                              |                               |
| postgresql                           | PostgreSQL JDBC driver                                                                                                                         |                               |
| quartz                               | Schedule jobs using Quartz                                                                                                                     | >=2.0.0.M2                    |
| ratpack                              | Spring Boot integration for the Ratpack framework                                                                                              | >=1.2.0.RELEASE and <2.0.0.M1 |
| reactive-cloud-stream                | Reactive messaging microservices with Spring Cloud Stream (requires a binder, e.g. Kafka or RabbitMQ)                                          | >=2.0.0.RC2                   |
| restdocs                             | Document RESTful services by combining hand-written and auto-generated documentation                                                           |                               |
| retry                                | Provide declarative retry support via spring-retry                                                                                             | >=1.3.0.RELEASE               |
| scs-circuit-breaker                  | Hystrix circuit breaker on Pivotal Cloud Foundry                                                                                               | >=1.3.0.RELEASE               |
| scs-config-client                    | Config client on Pivotal Cloud Foundry                                                                                                         | >=1.3.0.RELEASE               |
| scs-service-registry                 | Eureka service discovery on Pivotal Cloud Foundry                                                                                              | >=1.3.0.RELEASE               |
| security                             | Secure your application via spring-security                                                                                                    |                               |
| session                              | API and implementations for managing a user’s session information                                                                              | >=1.3.0.RELEASE               |
| spring-shell                         | Build shell-based clients                                                                                                                      | >=1.5.0.RELEASE               |
| sqlserver                            | Microsoft SQL Server JDBC driver                                                                                                               | >=1.5.0.RC1                   |
| statemachine                         | Build applications using state machine concepts                                                                                                | >=2.0.0.RC1                   |
| thymeleaf                            | Thymeleaf templating engine                                                                                                                    |                               |
| vaadin                               | Vaadin java web application framework                                                                                                          | >=1.2.0.RELEASE               |
| validation                           | JSR-303 validation infrastructure (already included with web)                                                                                  | >=1.3.0.RELEASE               |
| web                                  | Full-stack web development with Tomcat and Spring MVC                                                                                          |                               |
| web-services                         | Contract-first SOAP service development with Spring Web Services                                                                               |                               |
| web-services                         | Contract-first SOAP service development with Spring Web Services                                                                               |                               |
| webflux                              | Reactive web development with Netty and Spring WebFlux                                                                                         | >=2.0.0.M1                    |
| websocket                            | Websocket development with SockJS and STOMP                                                                                                    |                               |
+--------------------------------------+------------------------------------------------------------------------------------------------------------------------------------------------+-------------------------------+

Examples:

To create a default demo.zip:
	$ curl https://start.spring.io/starter.zip -o demo.zip

To create a web project using Java 7:
	$ curl https://start.spring.io/starter.zip -d dependencies=web -d javaVersion=1.7 -o demo.zip

To create a web/data-jpa gradle project unpacked:
	$ curl https://start.spring.io/starter.tgz -d dependencies=web,data-jpa -d type=gradle-project -d baseDir=my-dir | tar -xzvf -

To generate a Maven POM with war packaging:
	$ curl https://start.spring.io/pom.xml -d packaging=war -o pom.xml


*/
