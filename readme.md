# DS List



> Backend DS List, listando tipos de Games, games e suas posições. Também será possivel editar a posição de cada Game. 

### Ajustes e melhorias

O projeto está finalizado. Falta adicionar Elasticsearch com os logs do projeto.

Projeto foi executado seguindo o cronograma do Dev Superior na semana do intensivão

![aula](./.images/aula1.jpeg)

## 💻 Pré-requisitos

Antes de começar, verifique se você atendeu aos seguintes requisitos:

* Você instalou a versão mais recente de `JAVA 17`
* Você tem uma máquina  com  `Docker`.

## 🚀 Instalando <DS List>

Para instalar o <DS List>, siga estas etapas:

Basta subir o Docker-compose e rodar a aplicação

## ☕ Usando <DS List>

Após subir o backend você terá os seguintes endpoints:

`GET http://localhost:8080/lists` - Return a list of game Category

`GET http://localhost:8080/games` - Return all games

`GET http://localhost:8080/lists/{listId}/games` - Return all game of a category

`GET http://localhost:8080/games/{gameId}` - Return a specific game

`POST http://localhost:8080/lists/{listId}/replacement`  -- data `{"sourceIndex": 4,"destinationIndex": 1}`


## 📝 Licença

Esse projeto está sob licença. Veja o arquivo [LICENÇA](LICENSE.md) para mais detalhes.

[⬆ Voltar ao topo](#nome-do-projeto)<br>