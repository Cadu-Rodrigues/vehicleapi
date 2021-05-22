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
    Year VARCHAR(250),
    Value VARCHAR(250),
    Owner_id INT
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
    Vehicles (Brand, Model, Year, Value, Owner_id)
VALUES
    (
        'Ford',
        'Fiesta 1.6 16V Flex Aut. 5p',
        '2016 Gasolina',
        '10000',
        1
    );

INSERT INTO
    Vehicles (Brand, Model, Year, Value, Owner_id)
VALUES
    (
        'Ford',
        'Fusion 2.5L I-VCT Flex Aut.',
        '2016 Gasolina',
        '20000',
        2
    );

INSERT INTO
    Vehicles (Brand, Model, Year, Value, Owner_id)
VALUES
    (
        'Ford',
        'Ka 1.0 8V/1.0 8V ST Flex 3p',
        '2013 Gasolina',
        '30000',
        1
    );