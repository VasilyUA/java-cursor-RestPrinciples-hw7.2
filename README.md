# Cursor current Task:

```agsl
2. Опційно. Завантажити tomcat, та реалізувати сервлет. Він буде
приймати два параметри ім’я, настрій людини та хедер “place”
і буде повертати повідомлення “Hi + name from + place, you are felling +
настрій” .
```

For run servlet use command:

```bash
./gradlew build
```

```bash
docker-compose build 

docker-compose up
```
Open url: http://localhost:8080/servlet?name=Ivan&place=Kiev

If use ultimate ide run file: `servlet-api.http` 