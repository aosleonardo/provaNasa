# Mars robô Marciano

O sistema foi desenvolvido para ajudar o robô Mars a se movimentar em Marte.

Ele aceita, através de uma API Rest, comandos para andar e virar.

Ao final da trajetória, o Mars informa sua posição final dentro do terreno.

## Configuração

Mars sempre começa na posição (0,0,N) e o terreno foi programado com o tamanho default de 5 x 5.

## Comandos
- M - Andar;
- R - Virar 90° a Direita;
- L - Virar 90° a Esquerda;

Para informar os camandos basta enviar uma requisição **GET** para a url: **http://localhost:8080/rest/mars/{comando}**, como no exemplo.

- http://localhost:8080/rest/mars/mml

## Documentação

Para acessar a documentação da API basta acessar o link: **http://localhost:8080/swagger-ui.html**

[![Build Status](https://travis-ci.org/aosleonardo/provaNasa.svg?branch=master)](https://travis-ci.org/aosleonardo/provaNasa)
