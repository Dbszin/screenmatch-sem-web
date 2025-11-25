# ScreenMatch - Consulta de Séries via OMDb API

Este projeto é uma aplicação Spring Boot para buscar informações de séries utilizando a [OMDb API](https://www.omdbapi.com/). O usuário informa o nome da série e recebe dados detalhados sobre temporadas e episódios.

## Funcionalidades

- Busca de séries por nome
- Exibição de informações gerais da série (título, número de temporadas, avaliação IMDb)
- Listagem das temporadas e episódios, incluindo título, número, avaliação e data de lançamento

## Requisitos

- Java 22+
- Maven
- Chave de API da OMDb ([obtenha aqui](https://www.omdbapi.com/apikey.aspx))

## Como executar

1. Clone o repositório:
   ```sh
   git clone https://github.com/Dbszin/screenmatch-sem-web.git
   cd screenmatch-sem-web
   ```

2. Adicione sua chave da OMDb API:
   - Edite o arquivo [`Principal.java`](src/main/java/SpringBootApi/SpringSemWeb/Principal/Principal.java) e insira sua chave em `API_KEY` e o endpoint em `ENDERECO`:
     ```java
     private final String ENDERECO = "https://www.omdbapi.com/?t=";
     private final String API_KEY = "&apikey=SUACHAVE";
     ```

3. Compile e execute:
   ```sh
   ./mvnw spring-boot:run
   ```

4. Siga as instruções no terminal para buscar séries.

## Estrutura do Projeto

- [`ScreenmatchApplication.java`](src/main/java/SpringBootApi/SpringSemWeb/ScreenmatchApplication.java): Classe principal Spring Boot
- [`Principal.java`](src/main/java/SpringBootApi/SpringSemWeb/Principal/Principal.java): Lógica de interação com o usuário e chamada à API
- [`ConsumoApi.java`](src/main/java/SpringBootApi/SpringSemWeb/service/ConsumoApi.java): Consumo HTTP da OMDb API
- [`ConverteDados.java`](src/main/java/SpringBootApi/SpringSemWeb/service/ConverteDados.java): Conversão de JSON para objetos Java
- [`DadosSerie.java`](src/main/java/SpringBootApi/SpringSemWeb/model/DadosSerie.java): Modelo de dados da série
- [`DadosTemporada.java`](src/main/java/SpringBootApi/SpringSemWeb/model/DadosTemporada.java): Modelo de dados da temporada
- [`DadosEpisodio.java`](src/main/java/SpringBootApi/SpringSemWeb/model/DadosEpisodio.java): Modelo de dados do episódio

## Exemplo de Uso

```
Digite o nome da série para busca
Breaking Bad
Dados da série: Breaking Bad, Temporadas: 5, Avaliação: 9.5
Temporada 1: Episódios...
Temporada 2: Episódios...
...
```

## Licença

Este projeto está sob a licença Apache 2.0.

---

![image](https://github.com/Dbszin/screenmatch-sem-web/assets/156479720/b98ba6d2-e313-4953-add5-1d029f50ca19)
