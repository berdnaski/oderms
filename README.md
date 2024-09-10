# Desafio BTG Pactual Orderms

## Sobre

**Aplicação backend do BTG Pactual**, com intuito de fornece total controle sobre pedidos, incluindo:
- Cálculo do valor total do pedido.
- Quantificação de pedidos por cliente.
- Listagem detalhada de todos os pedidos realizados.

## ⚒️ Ferramentas

- [Spring Boot](https://spring.io/projects/spring-boot)
- [RabbitMQ](https://www.rabbitmq.com/)
- [Spring Data MongoDB](https://spring.io/projects/spring-data-mongodb)
- [Docker](https://www.docker.com/)

## 🚀 How to Run

````bash
# Clone the project
$ git clone https://github.com/seu-usuario/desafio-btg-pactual-orderms.git
cd desafio-btg-pactual-orderms
````

````bash
# Execute docker compose
$ docker-compose up -d
````

````bash
# Execute Spring Boot
$ ./mvnw spring-boot:run
````

## 📚 Endpoints

- **Get /customers/{codigoCliente}/orders:** Retorna uma lista de todos os pedidos.

