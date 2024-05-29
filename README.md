# Projeto PicPay Backend Challenge

Este projeto é baseado no [desafio de backend do PicPay](https://github.com/PicPay/picpay-desafio-backend) e tem como objetivo aprimorar minhas habilidades básicas de desenvolvimento de projetos backend. O sistema desenvolvido é uma plataforma simplificada de pagamentos, permitindo a realização de depósitos e transferências entre usuários. 

## Funcionalidades

- **Cadastro de Usuários e Lojistas:** Permite o registro de usuários comuns e lojistas, com validação de informações pessoais (CPF/CNPJ, e-mail, etc.).
- **Depósitos:** Funcionalidade para adicionar saldo à carteira do usuário.
- **Transferências:** Permite transferir saldo entre carteiras de usuários e lojistas, com validação de saldo e autorização externa.
- **Notificações:** Envio de notificações via e-mail e SMS para confirmação de transações.

## Tecnologias Utilizadas

- **Java 21**
- **Spring Boot**
- **Maven 3.2.5**
- **JPA (Java Persistence API)**
- **PostgreSQL**
- **OpenFeign**
- **Lombok**

## Objetivos

- **Aprimorar habilidades de desenvolvimento backend:** Praticar a criação de APIs RESTful, integração com banco de dados, validações e transações seguras.
- **Aplicar boas práticas:** Utilização de injeção de dependências, separação de camadas (Controller, Service, Repository) e mapeamento de entidades.
- **Explorar tecnologias:** Familiarizar-se com o uso de tecnologias populares no desenvolvimento backend, como Spring Boot e JPA.

## Como Executar

1. **Clone o repositório:**
   ```bash
   git clone https://github.com/seu-usuario/seu-repositorio.git
   cd seu-repositorio
   ```

2. **Configuração do Banco de Dados:**
   - Certifique-se de que você tem um banco de dados PostgreSQL rodando.
   - Configure as credenciais do banco de dados no `application.properties`.

3. **Execute a aplicação:**
   ```bash
   mvn spring-boot:run
   ```

4. **Testar Endpoints:**
   - Utilize ferramentas como Postman ou Insomnia para testar os endpoints da API.

## Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues e pull requests.
