#  API de Clientes - Spring Boot + MongoDB

Este projeto consiste no desenvolvimento de uma API REST para gerenciamento de clientes, utilizando **Spring Boot** e **MongoDB**.
A aplicação permite realizar operações completas de CRUD (Create, Read, Update e Delete), seguindo boas práticas de arquitetura em camadas.

---

##  Objetivo

Desenvolver uma API para cadastro e gerenciamento de clientes, aplicando conceitos de:

* Arquitetura em camadas (Controller, Service, Model)
* Integração com banco de dados NoSQL (MongoDB)
* Criação de endpoints RESTful

---

##  Tecnologias Utilizadas

* Java 17+
* Spring Boot
* Spring Web
* Spring Data MongoDB
* Lombok
* MongoDB

---

##  Estrutura do Projeto

```bash
src/main/java/com/example/cliente
│
├── controller     # Responsável por receber as requisições HTTP
├── service        # Contém as regras de negócio
├── model          # Representação dos dados (Cliente, Endereco)
└── ClienteApplication.java  # Classe principal
```

---

## Funcionalidades

✔️ Cadastro de cliente
✔️ Listagem de clientes
✔️ Busca por ID
✔️ Atualização de dados
✔️ Remoção de cliente

---

##  Endpoints da API

###  Criar Cliente

POST /cliente

```json
{
  "nome": "Maria Silva",
  "dataNascimento": "2000-05-10",
  "endereco": {
    "rua": "Rua A",
    "cidade": "São Paulo",
    "estado": "SP"
  }
}
```

---

###  Listar Clientes

<img width="916" height="837" alt="get-cliente" src="https://github.com/user-attachments/assets/4e73fdf7-3e5c-41d5-89b7-857119dd087a" />

---


###  Atualizar Cliente

<img width="895" height="753" alt="Captura de tela 2026-04-24 put-cliente" src="https://github.com/user-attachments/assets/15f447e0-8f35-4ce5-a0ca-06840de171fa" />

---

###  Deletar Cliente

<img width="987" height="606" alt="delete-cliente" src="https://github.com/user-attachments/assets/7b522dd5-ff67-46d6-815b-9b29f0b75ad8" />

---

###  Cadastro de Cliente

*(adicione aqui a imagem do POST no Postman)*

<img width="923" height="783" alt="post-cliente" src="https://github.com/user-attachments/assets/35a5105e-b5a4-41ed-858c-992f27e4b79e" />

---


##  Observações

* O projeto utiliza MongoDB como banco NoSQL
* O ID dos clientes é gerado automaticamente
* A aplicação segue padrão REST

---

##  Autoras

Projeto desenvolvido por:

* **Yasmin Oliveira**
* **Letícia Borges**

---

## Contexto Acadêmico

Este projeto foi desenvolvido como **atividade avaliativa**, contemplando a construção de uma arquitetura baseada em microsserviços, dividida em diferentes módulos:

* 🧑‍💼 **Cliente** → gerenciamento de clientes
* 🔐 **Login** → autenticação de usuários
* 📦 **Produto** → controle de produtos
* 🌐 **Gateway** → centralização das requisições e roteamento entre serviços

---

## Arquitetura do Projeto

A aplicação segue o padrão de microsserviços, onde cada módulo possui sua responsabilidade específica, promovendo:

* Separação de responsabilidades
* Escalabilidade
* Organização do código
* Facilidade de manutenção

O **Gateway** atua como ponto de entrada único, direcionando as requisições para os serviços correspondentes.

---

##  Considerações Finais

Este projeto teve como objetivo aplicar, na prática, conceitos de desenvolvimento backend com **Spring Boot**, além de explorar a comunicação entre serviços e a organização de sistemas distribuídos.
