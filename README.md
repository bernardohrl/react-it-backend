## Rodadando a Aplicação

#### 1. Instale o Maven e o Postman

#### 2. Entre na pasta do projeto e execute os seguintes comandos
```
mvn clean install
java -jar target/reactit-backend-1.0.0-SNAPSHOT.jar
```

#### 3. Utilize o Postman para fazer as requisições em http://localhost:8080/



<br><br>

## Rotas

#### Usuários

* **GET /users**: Retorna lista com todos os usuários e suas informações.
* **POST /users**: Cadastra um novo usuário.
* **GET /getUser/{id}**: Retornas as informações de um único usuário.
* **PUT /users/{id}**: Atualiza dados dos usuários.
* **DELETE /users/{id}**: Remove um Usuário.

#### Papéis

* **GET /users**: Retorna lista com todos os papéis e suas permissões.
* **POST /users**: Cadastra um novo papel.
* **GET /getUser/{id}**: Retornas as informações de um único papel.
* **PUT /users/{id}**: Atualiza as permissões de um papel.
* **DELETE /users/{id}**: Remove um papel (haverá erro se algum usuário estiver cadastrado com esse papel).  

#### Autenticação

* **POST /authenticate**: Verifica se o usuário está cadastrado no sistema.

<br>

O arquivo **ReactIt.postman_collection.json** pode ser importado pelo Postman, e usado para testar a API.



