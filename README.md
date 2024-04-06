## Java Springboot 3.2.4 CRUD Application with MYSQL and JPA & MAVEN with jdk 21

- http://localhost:8080/get-users
- http://localhost:8080/save-user

1. Get cURL
curl --location 'http://localhost:8080/get-users'

2. Save cURL
curl --location 'http://localhost:8080/save-user' \
--header 'Content-Type: application/json' \
--data '{
    "firstName": "John",
    "lastName": "Doe",
    "age": 25,
    "occupation": "Software Engineer"
}'

