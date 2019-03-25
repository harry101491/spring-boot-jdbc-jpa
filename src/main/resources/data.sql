CREATE TABLE person (
    id INTEGER NOT NULL,
    name VARCHAR(255) NOT NULL,
    location VARCHAR(255),
    birth_date TIMESTAMP,
    PRIMARY KEY(id)
);

INSERT  INTO person (ID, Name, Location, Birth_date) VALUES (10001, 'Harshit', 'LA', sysdate());
INSERT  INTO person (ID, Name, Location, Birth_date) VALUES (10002, 'John', 'New York', sysdate());
INSERT  INTO person (ID, Name, Location, Birth_date) VALUES (10003, 'Peter', 'Cerritos', sysdate());
INSERT  INTO person (ID, Name, Location, Birth_date) VALUES (10004, 'Ajinkya', 'Glandale', sysdate());