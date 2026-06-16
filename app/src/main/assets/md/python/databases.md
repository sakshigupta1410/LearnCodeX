# 🗄️ **Working with Databases in Python**

---

## 🔍 **What is a Database?**

A **database** is a place to store and organize data so you can easily retrieve, update, and manage it.

Common types include:

- **Relational databases** (like SQLite, MySQL, PostgreSQL)
- **NoSQL databases** (like MongoDB)

---

## 🐍 **Using SQLite with Python**

SQLite is a **lightweight, serverless** database included with Python.

Use the built-in `sqlite3` module to interact with SQLite databases.

---

## ⚙️ **Connecting to a Database**
<br>

```python
import sqlite3

conn = sqlite3.connect('example.db')  # Connect or create database file
cursor = conn.cursor()
```

## 🧱 **Creating a Table**
<br>

```
cursor.execute('''
CREATE TABLE IF NOT EXISTS users (
id INTEGER PRIMARY KEY,
name TEXT NOT NULL,
age INTEGER
)
''')
conn.commit()
```

## ** Inserting Data**
<br>

```
cursor.execute("INSERT INTO users (name, age) VALUES (?, ?)", ("Alice", 25))
conn.commit()
```

## **🔍 Querying Data**
<br>

```
cursor.execute("SELECT * FROM users")
rows = cursor.fetchall()

for row in rows:
print(row)
```

## **✏️ Updating Data**
<br>

```
cursor.execute("UPDATE users SET age = ? WHERE name = ?", (26, "Alice"))
conn.commit()
```

## **❌ Deleting Data**
<br>

```
cursor.execute("DELETE FROM users WHERE name = ?", ("Alice",))
conn.commit()
```

## **🛑 Closing the Connection**
<br>

```
conn.close()
```

## **💡 Using Other Databases**

For other databases like **MySQL**, **PostgreSQL**, or **MongoDB**, you need external libraries such as:

- `mysql-connector-python` or `PyMySQL` for MySQL

- `psycopg2` or `asyncpg` for PostgreSQL

- `pymongo` for MongoDB

## 🧪 **Practice Challenge**

* Create a database called library.db.
 
* Make a table books with columns: id, title, author, and year.
 
* Insert a few books.

* Query and print all book titles and authors.

## ✅ **Summary**

* Use **sqlite3** for easy-to-use relational databases.
 
* Always commit after changes.
 
* Use **placeholders** **(?)** to safely insert data and avoid SQL injection.
 
* Close connections when done.