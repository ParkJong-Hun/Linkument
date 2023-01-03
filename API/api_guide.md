### API

#### Convention when contributing

<!-- TODO -->

### DB

#### Connect to DB on terminal

Local

- `mysql -u {user_name} -p`

External

- `mysql -h {IP} -P {port} -u {user_name} -p`

External specific DataBase

- `mysql -h {IP} -P {port} -u {user_name} -p {DB_name}`

#### use specific DB on terminal

Create Database

- `create database {DB_name};`

Show Databases

- `show databases;`

Use a database

- `use {DB_name};`

##### fix the timezone error

- `set gloval time_zone='{Your time zone}'`
    - ex) `set gloval time_zone='Asia/Tokyo'`