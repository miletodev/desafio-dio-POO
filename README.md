# Bootcamp de Java Orientado a Objetos

Este projeto é um sistema de Bootcamp desenvolvido em Java, que simula a estrutura de um programa de capacitação técnica para desenvolvedores, como um bootcamp. O sistema permite gerenciar cursos, mentorias e desenvolvedores (devs) inscritos no bootcamp. 

## Índice

- [Introdução](#introdução)
- [Funcionalidades](#funcionalidades)
- [Tecnologias](#tecnologias)
- [Configuração](#configuração)
- [Uso](#uso)
- [Contribuição](#contribuição)
- [Licença](#licença)

## Introdução

O projeto Bootcamp Java Developer é projetado para gerenciar e acompanhar o progresso dos desenvolvedores através de vários cursos e mentorias. Inclui funcionalidades para inscrição em bootcamps, progresso através dos conteúdos e cálculo de pontos de experiência (XP).

## Funcionalidades

- Criar e gerenciar cursos e mentorias
- Inscrever desenvolvedores em bootcamps
- Acompanhar o progresso dos desenvolvedores e conteúdos concluídos
- Calcular e exibir o total de XP ganho pelos desenvolvedores

## Tecnologias

- Java
- Maven

## Configuração

Para configurar o projeto localmente, siga estes passos:

1. Clone o repositório:
    ```sh
    git clone https://github.com/miletodev/desafio-dio-POO.git
    ```
2. Navegue até o diretório do projeto:
    ```sh
    cd desafio-dio-POO
    ```
3. Construa o projeto usando Maven:
    ```sh
    mvn clean install
    ```
## Contribuição

Contribuições são bem-vindas! Por favor, siga estes passos para contribuir:  

1. Faça um fork do repositório.
2. Crie uma nova branch
```sh
git checkout -b feature/sua-feature
```
3. Commit suas mudanças
```sh
git commit -m 'Adicione uma nova feature'
```
4. Push para a branch
```sh
git push origin feature/sua-feature
```
5. Abra um Pull Request.

## Licença
Este projeto está licenciado sob a Licença MIT. Veja o arquivo LICENSE para mais detalhes

## Uso

Para executar o projeto, execute a classe `Main`. Isso demonstrará a funcionalidade das classes Bootcamp, Curso, Dev e Mentoria.

```sh
mvn exec:java -Dexec.mainClass="br.com.dio.desafio.dominio.Main"
