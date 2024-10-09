# Buscador de Informações de Jogos na Steam

Este projeto é uma aplicação web que permite buscar informações sobre jogos na Steam usando a API pública da Steam. 
A aplicação responde a requisições HTTP.

# Executando a Aplicação

# Pré-requisitos

Antes de executar a aplicação, você precisa ter o Java (JDK 11 ou superior) e o Maven instalados em sua máquina.

# Rodando Localmente

# Compile e execute a aplicação usando o código (A aplicação será executada na porta 8080 por padrão):
mvn spring-boot:run

# Método: GET -> URL: http://localhost:8080/steam/game/{name}
Exemplo: http://localhost:8080/steam/game/The Witcher 3: Wild Hunt

Resposta: https://prnt.sc/w7UOENfdtIMu (não ficou o ideal que eu gostaria, pelo menos tá fazendo o que eu planejei kkk)

# Informações do Projeto
http://localhost:8080/steam/sobre


Sobre o Dockerfile, o nome não está fazendo tanto sentido com o projeto.
Pois meu objetivo inicial era fazer um Quiz, mas deu tudo errado só que como o Dockerfile
Foi algo que baixei no meu computador e queria usar, foi uma das primeiras coisas que eu fiz