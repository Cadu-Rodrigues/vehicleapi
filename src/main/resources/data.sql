DROP TABLE IF EXISTS Users CASCADE;

DROP TABLE IF EXISTS Vehicles CASCADE;

CREATE TABLE Users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    Name VARCHAR(250),
    Email VARCHAR(250),
    CPF INT(11),
    Birthdate Date
);

CREATE TABLE Vehicles (
    id INT AUTO_INCREMENT PRIMARY KEY,
    Brand VARCHAR(250),
    Model VARCHAR(250),
    Year INT(4),
    Value DECIMAL,
    Ownerid INT
);

INSERT INTO
    Users (Name, Email, CPF, Birthdate)
VALUES
    (
        'Carlos',
        'CarlosEmail@email.com',
        1234,
        '1988-05-05'
    );

INSERT INTO
    Users (Name, Email, CPF, Birthdate)
VALUES
    (
        'Amadeu',
        'AmadeuEmail@email.com',
        4321,
        '1989-05-05'
    );

INSERT INTO
    Users (Name, Email, CPF, Birthdate)
VALUES
    (
        'Robson',
        'RobsonEmail@email.com',
        3333,
        '1964-05-05'
    );

INSERT INTO
    Vehicles (Brand, Model, Year, Value, Ownerid)
VALUES
    ('Ford', 'Fiesta', 2009, 10000, 1);

INSERT INTO
    Vehicles (Brand, Model, Year, Value, Ownerid)
VALUES
    ('Ford', 'Fusion', 2009, 20000, 2);

INSERT INTO
    Vehicles (Brand, Model, Year, Value, Ownerid)
VALUES
    ('Ford', 'Ka', 2009, 30000, 1);