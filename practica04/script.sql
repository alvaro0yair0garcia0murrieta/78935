CREATE DATABASE IF NOT exists saludos;
USE saludos;
CREATE USER 'mapache'@'localhost' IDENTIFIED BY '123456';
CREATE USER 'mapache'@'127.0.0.1' IDENTIFIED BY '123456';
GRANT ALL privileges ON saludos.* to 'mapache'@'127.0.01';
GRANT ALL privileges ON saludos.* to 'mapache'@'localhost';