# Spring Boot - Hello World Service
Hello World micro-service used in [AlexDevBlog's](https://alexdevblog.com/) video series, ["Deploy Spring Boot micro-service on AWS"](https://www.youtube.com/watch?v=xul1EQgvXkc&list=PLCl9m6jQF0CIwyrSNxhN2Wlv0nIun5EX3).

This app was bootstrapped with [Spring Initializr](https://start.spring.io/) and [Spring's official Getting Started Guide](https://spring.io/guides/gs/spring-boot/).

# Example Usage
* GET `/helloworld` returns `{ id: 1, content: "Hello, World! }`
* GET `/helloworld?name=john` returns `{ id: 1, content: "Hello, John! }`
* Each request at GET `/helloworld?name=john` increments `id` by 1.
    * For example, the second request at `/helloworld?name=john` returns `{ id: 2, content: "Hello, John! }`

# Run the app
## Use Docker (Recommended)
Work in progress...
## Run manually
1. Install **Java 11**
1. Clone the repo locally with `git clone`
1. Navigate to the root directory
1. Run `./mvnw spring-boot:run`
1. You should see the service up and running at `http://localhost:8080`

# Deploy on Lambda
Work in progress...

# Deploy on ECR
Work in progress...

# Deploy on EC2
Work in progress...
