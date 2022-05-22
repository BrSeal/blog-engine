# Readme к дипломной работе

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
