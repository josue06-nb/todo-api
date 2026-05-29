\# Todo API



Uma API REST para gerenciamento de tarefas que desenvolvi para praticar

Java e Spring Boot. O projeto cobre o ciclo completo de um CRUD,

desde a modelagem da entidade até os endpoints testados no Postman.



\## Tecnologias utilizadas

\- Java 21

\- Spring Boot 4.0.6

\- Spring Data JPA + Hibernate

\- Banco de dados H2 (em memória)

\- Lombok



\## Como rodar localmente



1\. Clone o repositório

2\. Abra a pasta no IntelliJ IDEA

3\. Aguarde o Maven baixar as dependências

4\. Rode a classe `TodoapiApplication.java`

5\. A API sobe em `http://localhost:8080`



\## Endpoints disponíveis



| Método | URL | O que faz |

|--------|-----|-----------|

| GET | /tasks | Retorna todas as tarefas |

| POST | /tasks | Cria uma nova tarefa |

| PUT | /tasks/{id} | Atualiza uma tarefa existente |

| DELETE | /tasks/{id} | Remove uma tarefa |



\## Exemplo de uso



Criando uma tarefa via POST:



\\`\\`\\`json

{

&#x20;   "titulo": "Estudar Spring Boot",

&#x20;   "concluida": false

}

\\`\\`\\`



Resposta:



\\`\\`\\`json

{

&#x20;   "id": 1,

&#x20;   "titulo": "Estudar Spring Boot",

&#x20;   "concluida": false

}

\\`\\`\\`

