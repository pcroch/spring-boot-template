[![Coverage](.github/badges/jacoco.svg)](https://github.com/pcroch/spring-security/actions/workflows/jacoco_badge.yml) [![Coverage](.github/badges/branches.svg)](https://github.com/pcroch/spring-security/actions/workflows/jacoco_badge.yml)

[![.github/workflows/maven.yml](https://github.com/pcroch/spring-security/actions/workflows/build.yml/badge.svg)](https://github.com/pcroch/spring-security/actions/workflows/build.yml)

# Description

This is a default project to have a fast start when I want to develop something on spring boot

Postgres is the db that is run locally in addition with flyway. To run the pipeline, h2 is used

# Initial Set-up

## Postgres

*If not installed check : https://wiki.archlinux.org/title/PostgreSQL*

## Log to postgres:

    sudo -i -u postgres

## Create admin user name admin:

    createuser --interactive 

## Create a db in Postgres with the following command:
    
    createdb db-template

## Check db:

    psql -d db-template

### Spring Boot

## Build the app **

    mvn clean install

## Run the app **

    mvn spring-boot:run

## Changing the port **

In case of conflict with a port you can change the default port 8080 to the desire one in the respecting yml file

### How to fetch:

## Dummy Endpoint: **

    curl http://localhost:8080/v1/pingController/ping

## Should respond: **

    pingController Ping

# Others

### Getting the application tree

*with depth limit and with files*

    tree -L 5 /path-to-project/IdeaProjects/spring-boot-template/src

*without depth limit and without files*

    tree -d  /path-to-project/IdeaProjects/spring-boot-template/src

## with <u>tree -d</u> we  will have

```
├── main
│   ├── java
│   │   └── api
│   │       ├── mywebapp
│   │       │   ├── commun
│   │       │   │   ├── package-info.java
│   │       │   │   └── shared things-like-data-interfaces-definitions
│   │       │   ├── config
│   │       │   │   ├── application-wide-configurations 
│   │       │   │   └── package-info.java
│   │       │   ├── controller
│   │       │   │   ├── for-controller.txt
│   │       │   │   ├── package-info.java
│   │       │   │   ├── template
│   │       │   │   │   ├── v1
│   │       │   │   │   └── v2
│   │       │   │   └── template2
│   │       │   │       ├── v1
│   │       │   │       └── v2
│   │       │   ├── domain
│   │       │   │   ├── entity-should-be-here.txt
│   │       │   │   └── package-info.java
│   │       │   ├── dto
│   │       │   │   ├── for-dto.txt
│   │       │   │   ├── package-info.java
│   │       │   │   ├── template
│   │       │   │   │   ├── v1
│   │       │   │   │   └── v2
│   │       │   │   └── template2
│   │       │   │       ├── v1
│   │       │   │       └── v2
│   │       │   ├── exception
│   │       │   │   ├── \011 custom_exceptions_and_global_error_handling 
│   │       │   │   └── package-info.java
│   │       │   ├── mapper
│   │       │   │   └── package-info.java
│   │       │   ├── repository
│   │       │   │   ├── package-info.java
│   │       │   │   └── repository-or-dao-should-be-here.txt
│   │       │   ├── service
│   │       │   │   ├── impl
│   │       │   │   │   └── PingServiceImpl.java
│   │       │   │   ├── package-info.java
│   │       │   │   └── PingService.java
│   │       │   └── utils
│   │       │       ├── package-info.java
│   │       │       └── shared-actions-helper-methods-technical-operations
│   │       └── SpringBootTemplateApplication.java
│   └── resources
│       ├── application.properties
│       ├── application-test.yml
│       ├── application.yml
│       └── db 
│           └── migration
│               └── add_your-sql_file_here.txt
└── test
    └── java
        └── api
            ├── mywebapp
            │   ├── commun
            │   │   └── package-info.java
            │   ├── config
            │   │   └── package-info.java
            │   ├── controller
            │   │   ├── package-info.java
            │   │   ├── template
            │   │   │   ├── v1
            │   │   │   └── v2
            │   │   └── template2
            │   │       ├── v1
            │   │       └── v2
            │   ├── domain
            │   │   └── package-info.java
            │   ├── dto
            │   │   ├── package-info.java
            │   │   ├── template
            │   │   │   ├── v1
            │   │   │   └── v2
            │   │   └── template2
            │   │       ├── v1
            │   │       └── v2
            │   ├── exception
            │   │   └── package-info.java
            │   ├── mapper
            │   │   └── package-info.java
            │   ├── repository
            │   │   └── package-info.java
            │   ├── service
            │   │   ├── impl
            │   │   │   └── PingServiceImplTest.java
            │   │   ├── package-info.java
            │   │   └── PingService.java
            │   └── utils
            │       └── package-info.java
            └── SpringBootTemplateApplicationTests.java

58 directories, 38 files
➜  src git:(main) tree -d  /home/pierre/IdeaProjects/spring-boot-template/src
/home/pierre/IdeaProjects/spring-boot-template/src
├── main
│   ├── java
│   │   └── api
│   │       └── mywebapp
│   │           ├── commun
│   │           ├── config
│   │           ├── controller
│   │           │   ├── template
│   │           │   │   ├── v1
│   │           │   │   └── v2
│   │           │   └── template2
│   │           │       ├── v1
│   │           │       └── v2
│   │           ├── domain
│   │           ├── dto
│   │           │   ├── template
│   │           │   │   ├── v1
│   │           │   │   └── v2
│   │           │   └── template2
│   │           │       ├── v1
│   │           │       └── v2
│   │           ├── exception
│   │           ├── mapper
│   │           ├── repository
│   │           ├── service
│   │           │   └── impl
│   │           └── utils
│   └── resources
│       └── db 
│           └── migration
└── test
    └── java
        └── api
            └── mywebapp
                ├── commun
                ├── config
                ├── controller
                │   ├── template
                │   │   ├── v1
                │   │   └── v2
                │   └── template2
                │       ├── v1
                │       └── v2
                ├── domain
                ├── dto
                │   ├── template
                │   │   ├── v1
                │   │   └── v2
                │   └── template2
                │       ├── v1
                │       └── v2
                ├── exception
                ├── mapper
                ├── repository
                ├── service
                │   └── impl
                └── utils


```
