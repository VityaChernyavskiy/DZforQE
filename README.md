# Dz (GET/POST/PUT)

Этот репозиторий содержит примеры кода для выполнения операций GET, POST и PUT с использованием Spring Boot.

## Описание

1) в заглушку приходит json в виде POST/PUT запроса;
2) json парсится в джава объект;
3) генерируется json объект ответа на запрос;
4) в ответе в одном поле данные из поля входящего запроса.
json пример
{
    "name": "Kirov",
    "age": "30"
}
Также в коде реализован метод GET. Запросы получают два поля, возвращают два поля. Запрос Post в ответе выдает "Привет, " + "name" + "!", и добавляет к age +100

## Установка

1) Загрузите проект в формате zip. Разархивируйте его.
2) С помощью bash команд перейдите в папку out/artifacts и введите команду java -jar demo-0.0.1-SNAPSHOT.jar
3) Для удобства пользования можно установить API Platform - Postman

## Использование

1) GET http://localhost:8080/api/person
2) POST http://localhost:8080/api/person
3) PUT http://localhost:8080/api/person/{name}