# Readme к дипломной работе

Master: [![Codeship Status for BrSeal/blog-engine](https://app.codeship.com/projects/641ee480-2804-402b-ab7e-303e4bc348ad/status?branch=master)](https://app.codeship.com/projects/458476)

Dev:[![Codeship Status for BrSeal/blog-engine](https://app.codeship.com/projects/641ee480-2804-402b-ab7e-303e4bc348ad/status?branch=dev)](https://app.codeship.com/projects/458476)

---

## Запуск
1. Склонировать репозиторий
2. Поднять локальный сервер mySql 8.0
3. Создать на сервере новую схему
4. Скопировать файл application.properties.sample в ту же папку и переименовать новый файл в application.properties
5. Заполнить параметры в application.properties 
   * ***spring.datasource.url*** - поменять **test** на имя локальной схемы
   * ***spring.datasource.username*** ,***spring.datasource.password*** - сменить на локальное имя юзера и пароль
   * ***server.port*** - порт на котором будет работать приложение
6. Запустить приложение
7. Выполнить **init.sql** скрипт на созданной схеме
