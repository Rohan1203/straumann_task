# A Simple CRUD application

A simple CRUD application with SpringBoot and MySQL (With ORM).

Steps to run the project in your local

1. Clone the project into your local directory
2. Create a database in your MySQL server (May be local or remote).
5. Provide the mysql configuration in application.properties (url, username, password)
4. Start your SpringBoot server

The APIs exposed are:
1. /health
2. /items (method=GET)
3. /item (method=POST => {data})
4. /item (method=UPDATE => {data})
5. /item/:id (method=DELETE)
6. /item/:id (method=GET)

Test in the postman by appending the lost to the prefix of the endpoints
eg. http://<your host>:<port>/health
