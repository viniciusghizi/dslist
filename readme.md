# DS List

> Backend DS List, The project list all games, all games by type and your positions. You can edit the game position too. 

### Features

The project is finished. I want to active Elasticsearch for Logs searching. This app is hosted on Railway Cloud Service in this URL: https ://dslist-production-b6ca.up.railway.app

This project has been executed with the Dev Superior na semana do intensivão schedule

![aula](./.images/aula1.jpeg)

## 💻 Pré-requisitos

* You need to install `JAVA 17`.
* You need to install  `Docker`.

## 🚀 Installing <DS List>

To install the <DS List>, follow this steps:

docker compose up -d

and run the application

## ☕ Using <DS List>

After start the backend, you can use this endpoints:
Note: in Test profile, the project use H2 Database but in HOMOLOG or PRODUCTION you can use Postgre

`GET http://localhost:8080/lists` - Return a list of game Category

`GET http://localhost:8080/games` - Return all games

`GET http://localhost:8080/lists/{listId}/games` - Return all game of a category

`GET http://localhost:8080/games/{gameId}` - Return a specific game

`POST http://localhost:8080/lists/{listId}/replacement`  -- data `{"sourceIndex": 4,"destinationIndex": 1}` Update a game position on a list.
