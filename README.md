# Project Title
## Overview
This is a sample project or 

### Project Technical Overview:
1. Business Rules
   1. zhang3
   1. li4
1. Development Approaches
   1. zhang3
   2. li4
   
## Configure Local Environment
### Setup Local Database
Refer to postgres docker [image](https://hub.docker.com/_/postgres) for environment option.
```
docker run --name training-db -e POSTGRES_USER=${username} -e POSTGRES_PASSWORD=${password} -e POSTGRES_DB=${databaseName} -p 5433:5432 -d postgres
```
### Migrate Database Schema
Refer to flyway setup [documentation](https://flywaydb.org/documentation/migrations) find all [migration schema] (src/main/resources/db/migrate)
```
mvn clean compile flyway:migrate
```

