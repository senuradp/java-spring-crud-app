## Java Springboot 3.2.4 CRUD Application with MYSQL and JPA & MAVEN with jdk 21

- http://localhost:8080/get-users
- http://localhost:8080/save-user
- http://localhost:8080/update-user/{id}
- http://localhost:8080/delete-user/{id}

1. Get cURL
- curl --location 'http://localhost:8080/get-users'

2. Save cURL
- curl --location 'http://localhost:8080/save-user' \
--header 'Content-Type: application/json' \
--data '{
    "firstName": "John",
    "lastName": "Doe",
    "age": 25,
    "occupation": "Software Engineer"
}'

3. Update cURL
- curl --location --request PUT 'http://localhost:8080/update-user/1' \
  --header 'Content-Type: application/json' \
  --data '{
  "firstName": "John",
  "lastName": "Doe",
  "age": 25,
  "occupation": "Senior Software Engineer"
  }'

4. Delete cURL
- curl --location --request DELETE 'http://localhost:8080/delete-user/1'

