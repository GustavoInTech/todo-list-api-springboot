# 📝 To-Do List API — Spring Boot

### Gerencie suas tarefas de forma simples, rápida e eficiente
[![License](https://img.shields.io/github/license/Naereen/StrapDown.js.svg)](https://github.com/GustavoInTech/todo-list-api-springboot/blob/main/LICENSE)


---

# 📚 Visão Geral

A **To-Do List API** é um projeto desenvolvido com **Java + Spring Boot**, seguindo a arquitetura MVC (Model–Repository–Service–Controller).  
O objetivo do projeto é permitir o gerenciamento completo de tarefas, incluindo:

- ✔ Cadastro
- ✔ Edição
- ✔ Exclusão
- ✔ Listagem
- ✔ Marcar como concluída

Esta API foi criada como parte dos meus estudos em Java e desenvolvimento backend com Spring Boot.

---

# ⚙️ Funcionalidades

- 🆕 **Criar tarefa**
- 📄 **Listar todas as tarefas**
- 🔍 **Buscar tarefa por ID**
- ✏️ **Atualizar tarefa**
- ❌ **Excluir tarefa**
- ✅ **Marcar tarefa como concluída**
- 🗂 **Arquitetura MVC organizada**

---

# 🏗 Arquitetura do Projeto

A arquitetura segue o padrão **MVC**, com separação clara entre camadas:
controller/
service/
repository/
model/

### 🧩 Explicação das camadas:

- **Model** → Representa a entidade `Task` com seus atributos
- **Repository** → Comunicação com o banco de dados (JPA)
- **Service** → Regras de negócios (ex.: marcar como concluída)
- **Controller** → Endpoints REST acessados pelo cliente

---

# 🗂 Modelo Conceitual

A aplicação possui uma entidade principal: **Task (Tarefa)**.  
Ela contém:

- id
- título
- descrição
- data de criação
- data de conclusão
- status (pendente/concluída)

### 📸 Imagem do Modelo Conceitual

_(Simples, só para demonstrar a estrutura)_

![Modelo Conceitual](link-da-imagem-que-você-vai-colocar-aqui)

---

# 💻 Tecnologias Utilizadas

- ☕ **Java 17**
- 🌱 **Spring Boot**
- 🏛 **Spring Data JPA**
- 🗄 H2 Database (para testes)
- 📦 Maven
- 🧪 JUnit (opcional)
- 🛠 Insomnia/Postman para testes de API

---

# ▶ Como Rodar o Projeto

### 1️⃣ Clonar o repositório

```bash
git clone https://github.com/seuusuario/seuprojeto.git
```

### 2️⃣ Entrar na pasta

```bash
cd backend
```

### 3️⃣ Executar o projeto

```bash
mvn spring-boot:run
```

### 4️⃣ Acessar o H2 (caso esteja usando)

```bash
http://localhost:8080/h2-console
```
