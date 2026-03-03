# 🎓 SENAI - Sistema Aluno (Backend)

Este é o repositório backend do **Sistema Aluno**, uma API RESTful desenvolvida como parte das atividades do SENAI para fornecer os dados e as regras de negócio para o gerenciamento de alunos. Esta aplicação serve como base para o projeto frontend complementar.

## 💻 Sobre o Projeto

O projeto é uma aplicação backend construída em **Java 17** utilizando o framework **Spring Boot** (versão 4.0.3). A API expõe endpoints para controle de acesso (login) e para a manutenção dos registros dos alunos.

## ⚙️ Funcionalidades Principais

A arquitetura do projeto está dividida para atender as seguintes funcionalidades baseadas em seus modelos de dados:
* **Autenticação (`LoginController`):** Validação e acesso de usuários ao sistema.
* **Gestão de Alunos (`AlunoController`):** Endpoints para listagem, criação, atualização e exclusão de registros de estudantes.

## 🛠 Tecnologias e Dependências

As principais tecnologias configuradas via Maven incluem:
* **Java 17**
* **Spring Boot (4.0.3)**
* **Spring WebMVC** (para construção de APIs REST)
* **Maven** (Gerenciamento de dependências através do Maven Wrapper incluso)

## 🔗 Repositório Frontend (SPA)

Para visualizar e interagir com os dados desta API de forma amigável, utilize a aplicação frontend construída em React.
* **Repositório do Frontend:** [samuelcmoreira/senai-sistema-aluno-frontend](https://github.com/samuelcmoreira/senai-sistema-aluno-frontend)

## 📂 Estrutura do Projeto

```text
📦 src/main/java/br/com/senai/projeto
 ┣ 📂 controller
 ┃ ┣ 📜 AlunoController.java    # Controladores da API de Alunos
 ┃ ┗ 📜 LoginController.java    # Controladores da API de Login
 ┣ 📂 model
 ┃ ┣ 📜 Aluno.java              # Entidade/Modelo de Aluno
 ┃ ┗ 📜 Login.java              # Entidade/Modelo de Login
 ┗ 📜 ProjetoApplication.java   # Ponto de entrada (Main) da aplicação Spring Boot
 ```

 ## 🚀 Como executar o projeto localmente

### Pré-requisitos
* Java Development Kit (JDK) 17 instalado e configurado nas variáveis de ambiente.
* Conexão com a internet (para o Maven baixar as dependências iniciais).

### Passo a passo

**1. Clone este repositório**
```bash
git clone [https://github.com/samuelcmoreira/senai-sistema-aluno-backend.git](https://github.com/samuelcmoreira/senai-sistema-aluno-backend.git)
```

**2. Acesse a pasta do projeto**
```bash
cd senai-sistema-aluno-backend
```

**3. Execute a aplicação (via Maven Wrapper)**

No Windows:
```DOS
mvnw.cmd spring-boot:run
```
No Linux/Mac:
```bash
./mvnw spring-boot:run
```

(Nota: O Spring Boot inicializará o servidor web embutido, geralmente rodando na porta 8080).

## 🤝 Como Contribuir

1. Faça um *fork* do projeto.
2. Crie uma nova *branch* com as suas alterações: `git switch -c feat/minha-feature`
3. Salve as alterações e crie uma mensagem de commit: `git commit -m "feat: adiciona novo endpoint X"`
4. Envie as suas alterações: `git push -u origin feat/minha-feature`
5. Abra um *Pull Request* detalhando as mudanças realizadas.
