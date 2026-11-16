# Controle de Estoque

Sistema simples de controle de estoque em Java, feito para a atividade da UC
**Gestão e Qualidade de Software** (UNA, profa. Rafaela Moreira).

Uma loja registra **entradas** e **saídas** de produtos e consulta o **saldo**.
Uma retirada maior que o saldo disponível é **recusada** e a quantidade não muda.

## Integrantes

| Nome | GitHub | Parte no trabalho |
|---|---|---|
| Lavínia Oliveira Silva | @laviniaoliveira4 | Criação do repositório, classe `Produto` e testes unitários JUnit 5 |
| Marcos Gabriel Dutra | @MvrcosDutra | Estrutura do projeto (`pom.xml`, README, Codespace) e menu do sistema (`App`) |
| Isabella Castro Garcia | @IsaGarcia02 | Cenários BDD (Cucumber/Gherkin) |

## Tecnologias

- Java 17
- Maven
- JUnit 5 (testes unitários)
- Cucumber 7 com Gherkin em português (testes BDD)
- GitHub Codespaces (ambiente de desenvolvimento)

## Como executar

**No GitHub Codespaces (recomendado):** botão **Code → Codespaces → Create codespace on main**.
O ambiente já vem com Java 17 e Maven (configuração em `.devcontainer/devcontainer.json`).

**No computador:** é preciso ter **JDK 17** e **Maven** instalados.

Rodar todos os testes (JUnit + BDD):

```bash
mvn test
```

Rodar o sistema (menu no console):

```bash
mvn -q compile exec:java
```

## Estrutura

```
src/main/java/br/com/estoque/Produto.java        regra de negócio
src/main/java/br/com/estoque/App.java            menu no console
src/test/java/br/com/estoque/ProdutoTest.java    testes unitários (JUnit 5)
src/test/resources/features/estoque.feature      cenários BDD (Gherkin)
src/test/java/br/com/estoque/bdd/                passos e executor do Cucumber
.devcontainer/devcontainer.json                  ambiente do Codespace
```
