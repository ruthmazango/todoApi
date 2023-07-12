**Welcome to my todo API**

It contains olny 1 database named todo, 1 table named todo and contains 3 fields; id, title and description.

The api has five RESTful endpoints:

1. Create a todo

  curl --location 'http://localhost:8080/api/v1/todo/create-todo' \
--header 'Content-Type: application/json' \
--data '{
"title": "Exercise",
"description": "Engage in physical activity for at least 30 minutes"
}'

2. Get all todos

   curl --location 'http://localhost:8080/api/v1/todo/'

3. Get todo by id

   curl --location 'http://localhost:8080/api/v1/todo/1'

4. Update todo

   curl --location --request PUT 'http://localhost:8080/api/v1/todo/17' \
--header 'Content-Type: application/json' \
--data '{
"id": 17,
"title": "Exercise",
"description": "Engage in physical activity for at least once a week"

}'

5. Delete todo

   curl --location --request DELETE 'http://localhost:8080/api/v1/todo/17'

