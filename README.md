# User Service. Test task for Comparus-UA


## Local Url
http://localhost:8080


## Local swagger Url
http://localhost:8080/swagger-ui/index.html#/

# Description
The goal of the service is to aggregate user data from different databases using Aggregator pattern. In scope of this task, I've demonstrated the basic implementation of this pattern to achieve our goal, without real DB connection, using the data mocks. Of course, there should be a lot of refactoring like not to use database name as comparator to choose which one DB should be connected. But the skeleton should be like that. Aggregator service has to be kind of load balancer and has to trigger the specific repository depending on configs provided.   



