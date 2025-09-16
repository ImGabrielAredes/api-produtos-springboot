## Estrutura Principal

-*controller*: classes que recebem as requisições HTTP
-*services*: regras de negócio e lógica de aplicação
-*repository*: interfaces que fazem a persistência de dados
(Geralmente com Spring Data JPA)
-*model* ou *domain*: classes de domínio
-*config*: classes de configuração(ex.: CORS, segurança...)
-*dto*: objetos simples (POJO) criado para transportar dados.

## Comandos Importantes


### Executar a Aplicação
bash

./mvnw spring-boot: run

### Testar a Aplicação
bash

./mvnw test
