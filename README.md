# 🚀 System Inventory API

Uma API RESTful desenvolvida em **Java** e **Spring Boot** para gerenciamento de inventário de produtos, integrada ao banco NoSQL **MongoDB** e totalmente containerizada com **Docker**.

---

## 🛠️ Tecnologias Utilizadas

*   **Java 21**
*   **Spring Boot 3.x**
    *   Spring Web (Construção da API REST)
    *   Spring Data MongoDB (Persistência NoSQL)
    *   Spring Validation (Validação de dados de entrada)
*   **MongoDB** (Banco de dados de documentos)
*   **Docker & Docker Compose** (Containerização do banco)
*   **Lombok** (Produtividade e eliminação de código Boilerplate)

---

## 📐 Arquitetura do Projeto

O projeto segue uma arquitetura corporativa em camadas bem definida, garantindo baixo acoplamento e separação de responsabilidades:

1.  **Controller**: Porta de entrada da aplicação, responsável por expor os endpoints HTTP e validar as requisições.
2.  **Service**: Camada de negócio onde ficam as regras, validações e orquestração dos dados.
3.  **Repository**: Interface que herda do `MongoRepository` para comunicação direta com o MongoDB.
4.  **Model**: Entidades que mapeiam os documentos do banco de dados.
5.  **DTO (Data Transfer Object)**: Uso de *Java Records* para tráfego seguro e limpo de dados entre as camadas.

---

## 🚀 Como Executar o Projeto

### Pré-requisitos
*   Java 21 instalado.
*   Docker Desktop rodando na máquina.

### Passos para execução
1. Clone o repositório:
   ```bash
   git clone [https://github.com/heliolevi/System-inventory.git](https://github.com/heliolevi/System-inventory.git)
Na raiz do projeto, suba o container do MongoDB utilizando o Docker Compose:

Bash
docker compose up -d
Execute a aplicação Spring Boot através da sua IDE de preferência rodando a classe:

Plaintext
InventarioApplication.java
A API estará disponível em: http://localhost:8080

🔀 Endpoints da API
1. Cadastrar Produto
Mapeamento: POST /api/products

Corpo da Requisição (JSON):

```JSON
{
  "code": "PROD-001",
  "name": "Teclado Mecânico RGB",
  "price": 249.90,
  "quantityInStock": 15
}
```

2. ## Listar Todos os Produtos
Mapeamento: GET /api/products

Resposta: Retorna uma lista com todos os documentos salvos no MongoDB.


``` JSON
  {
    "id": "653e7a...",
    "code": "PROD-001",
    "name": "Teclado Mecânico RGB",
    "price": 249.90,
    "quantityInStock": 15
  }
```
💻 ## Como subir esse README para o GitHub agora?
* Abra o terminal do seu IntelliJ e execute os seguintes comandos para salvar e enviar as alterações para a sua branch:

'''PowerShell
git add README.md
git commit -m "docs: adicionar arquivo README explicativo do projeto"
git push
'''
