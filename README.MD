# Checkpoint 2

Checkpoint 2 da disciplicna Microservice and Web Engineering

## Pré-requisitos

- Java 17+
- Docker
- Acesso a internet
- Acesso ao Docker Hub

## Instalação

#### Clone

```
git clone https://github.com/FrnndzFiap/fiap-checkpoint2.git
```

## Execução

#### Docker Hub

Repositório: frnndzfiap/fiap-checkpoint2

https://hub.docker.com/r/frnndzfiap/fiap-checkpoint2

#### Docker

* Executar container

spring.profiles.active=dev

```
docker run -d -p 8080:8080 -e PROFILE=dev frnndzfiap/fiap-checkpoint2
```

spring.profiles.active=stg

```
docker run -d -p 8080:8080 -e PROFILE=stg frnndzfiap/fiap-checkpoint2
```

spring.profiles.active=prd

```
docker run -d -p 8080:8080 -e PROFILE=prd frnndzfiap/fiap-checkpoint2
```

#### Navegação

- Base

http://localhost:8080

- Endpoint que retorna a listagem de pacientes

http://localhost:8080/pacientes/listar

- Endpoint que retorna a listagem de profissionais

http://localhost:8080/profissionais/listar

- Endpoint que retorna a listagem de consultas

http://localhost:8080/consultas/listar


## Features (Funcionalidades)

- Múltiplos profiles
- Banco de dados
- Visualização WEB

## Contatos

- Gustavo Fernandez - rm94382
