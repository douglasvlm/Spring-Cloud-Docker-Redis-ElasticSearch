## Projeto com arquitetura baseada em microsserviços usando Spring Cloud
### Docker compose
```` shell
sudo docker-compose up -d
````
### Actuator healthcheck (Teste server)
```` 
http://localhost:8081/actuator/health
http://localhost:8082/actuator/health
http://localhost:8088/actuator/health
http://localhost:8888/product-catalog/default
http://localhost:8888/shopping-cart/default
````
## Eureka Server
http://localhost:9000/
