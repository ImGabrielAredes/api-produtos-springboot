## 🌱 Estrutura principal (`src/main`)

- **`java/`**

Onde fica todo o **código-fonte Java** da aplicação.

É aqui que você cria:

- **controller** – classes que recebem as requisições HTTP (ex.: `HomeController`).
- **service** – regras de negócio e lógica da aplicação.
- **repository** – interfaces que fazem a persistência de dados (normalmente com Spring Data JPA).
- **model ou domain** – classes de domínio ou entidades (mapeadas para o banco com `@Entity`).
- **config** – classes de configuração (por exemplo, CORS, segurança, beans específicos).
- **exception / handler** – tratamento centralizado de erros e exceções.
- **dto**: **Transportar dados** entre camadas da aplicação (por exemplo, entre o controller e o service, ou entre o backend e o frontend).

> O pacote raiz geralmente segue o nome do projeto, por exemplo:
>
>
> `com.exemplo.app`
>
> e dentro dele você cria subpacotes: `controller`, `service`, `repository`, etc.
>

## Comandos Úteis

```bash
./mvnw spring-boot:run
./mvnw test
```
