[![Coverage](.github/badges/jacoco.svg)](https://github.com/pcroch/spring-security/actions/workflows/jacoco_badge.yml) [![Coverage](.github/badges/branches.svg)](https://github.com/pcroch/spring-security/actions/workflows/jacoco_badge.yml)

[![.github/workflows/maven.yml](https://github.com/pcroch/spring-security/actions/workflows/build.yml/badge.svg)](https://github.com/pcroch/spring-security/actions/workflows/build.yml)

### Initial Set-up

** Postgres **

If not installed check : https://wiki.archlinux.org/title/PostgreSQL

Log to postgres:

    sudo -i -u postgres

Create admin user name admin:

    createuser --interactive 

Create a db in Postgres with the following command:
    
    createdb db-template

Check db:

    psql -d db-template

** Build the app **

    mvn clean install

** Run the app **

    mvn spring-boot:run

** Changing the port **

In case of conflict with a port you can change the default port 8080 to the desire one in the respecting yml file

### How to fetch:

** Dummy Endpoint: **

curl http://localhost:8080/pingController/ping

** Should respond: **

pingController Ping

