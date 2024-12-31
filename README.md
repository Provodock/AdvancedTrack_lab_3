# SQL Generator. Annotation Processors

## Автор: Коваль Костянтин, ІО-25

## Опис проєкту

Цей проєкт демонструє реалізацію автоматичної генерації SQL-запитів на основі Java-анотацій. Основна ідея полягає у створенні мапінгу між полями Java-об'єктів та колонками таблиць бази даних, що дозволяє автоматизувати створення SQL-запитів для операцій створення (`CREATE`), вставки (`INSERT`), вибірки (`SELECT`), оновлення (`UPDATE`) та видалення (`DELETE`).

## Анотації для мапінгу:

- `Tablycya` - Анотація класу, яка визначає відповідність між класом Java та таблицею в базі даних. Приймає
  параметр `nazva`, що задає назву таблиці.

- `Stovpec` - Анотація для полів класу, що визначає відповідність між полем Java-об'єкта та колонкою в таблиці
  бази даних. Приймає параметр `nazva`, який задає назву колонки.

- `Klyuch` - Анотація для полів класу, що визначає первинний ключ таблиці бази даних.

## Класи-моделі:
- `Avtomobil` - сутність автомобіля
- `Povidomlennya` - сутність повідомлення
- `Student` - сутність студента

## Генерація SQL-запитів:

- За допомогою процесора анотацій (`SQLAnnotationProcessor`) автоматично створюються класи-генератори для кожної сутності.
- Генеруються наступні SQL-запити:
  - `CREATE TABLE`
  - `INSERT INTO`
  - `UPDATE`
  - `DELETE`
  - `SELECT`

## Приклад використання:

- У головному класі Main демонструється робота з генераторами SQL-запитів:
  - Створення об'єктів сутностей (`Avtomobil`, `Povidomlennya`, `Student`).
  - Виклик методів генерації SQL-запитів через класи-генератори (`AvtomobilSQLGenerator`, `PovidomlennyaSQLGenerator`, `StudentSQLGenerator`).
  - Виведення SQL-запитів у консоль.

## Збірка та запуск:

- Вимоги
  - Apache Maven 4.0.0 або вище
  - JDK 17

- Клонуйте репозиторій собі на комп'ютер:

```bash 
git clone https://github.com/Provodock/AdvancedTrack_lab_3
```


### Збірка проєкту:
- зкомпілювати клас SQLAnnotationProcessor
```bash
javac -d target/classes -sourcepath src/main/java src/main/java/org/example/processors/SQLAnnotationProcessor.java
```
- Наступна команда використовує процесор анотацій SQLAnnotationProcessor під час компіляції Java-класів із пакета org.example.examples

 ```bash
 javac -d target/classes -cp target/classes -processor org.example.processors.SQLAnnotationProcessor -sourcepath src/main/java src/main/java/org/example/pryklady/*.java
 ```

- Запустіть головний клас Main.



