# Metric Converter Spring boot Service

## Table Of Contents

- [Overview](#overview)
- [Requirements](#requirements)
- [Getting Started](#getting-started)
- [Running in Docker](#docker)
- [Testing](#testing)
- [Run in postman](#postman)
## Overview
This service performs area, length, temperature, volume and weight conversion

Service Basepath
- /api

## Requirements
For building and running the application you need:
- [JDK 1.8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
- [MAVEN 3](https://maven.apache.org)

## Getting Started

### Install Dependencies
```shell
mvn clean install
```
### Run Project
```shell
mvn spring-boot:run 
```

### API ENDPOINTS

- METRIC CONVERSION

```http
GET /convert/{type}/{toUnit}/{value}
```

## Running in Docker
docker pull smtandabuzo/metric-conversion:latest

docker run -p 8080:8080 smtandabuzo/metric-conversion

## Testing

API takes 3 inputs as Path Parameters.
1. Conversion Type (length, weight, area, volume, temperature)
2. To Conversion System (metric or imperial)
3. Value

Endpoint
```
/metric/convert/{type}/{toSystem}/{value}
```

Example:
Convert 10 Mile to KMs
```
curl localhost:8080/metric/convert/length/metric/10
```

Click on the button below to get the Postman Collection for Conversion Calculator.

[![Run in Postman](https://run.pstmn.io/button.svg)](https://app.getpostman.com/run-collection/c162bdb0accbdddbf8d0)
