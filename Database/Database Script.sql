-- CREATE DATABASE SoftwareConstructionAndDevelopment;

-- USE SoftwareConstructionAndDevelopment;

/*CREATE TABLE Mafoul
(
     رقم int PRIMARY KEY AUTO_INCREMENT,
    مشكول varchar(50) null,
    بغیر_اعراب_مشکول varchar(50) null,
    صنف varchar(50) null,
    أصل varchar(50) null,
    بغیر_اعراب_أصل varchar(50) null,
    جنس varchar(50) null,
    عدد varchar(50) null
);*/

/*CREATE TABLE Faeel
(
     رقم int PRIMARY KEY AUTO_INCREMENT,
    مشكول varchar(50) null,
    بغیر_اعراب_مشکول varchar(50) null,
    صنف varchar(50) null,
    أصل varchar(50) null,
    بغیر_اعراب_أصل varchar(50) null,
    جنس varchar(50) null,
    عدد varchar(50) null
);*/

/*CREATE TABLE Masdar
(
     رقم int PRIMARY KEY AUTO_INCREMENT,
    مشكول varchar(50),
    بغیر_اعراب_مشکول varchar(50),
    صنف varchar(50),
    أصل varchar(50),
    بغیر_اعراب_أصل varchar(50),
    جنس varchar(50),
    عدد varchar(50)
);*/
/*
create table Relation
(
    id int PRIMARY KEY,
    faeelfk int,
    mafoulfk int,
    masdarfk int,
    FOREIGN KEY(faeelfk) REFERENCES faeel(رقم),
    FOREIGN KEY(mafoulfk) REFERENCES mafoul(رقم),
     FOREIGN KEY(masdarfk) REFERENCES masdar(رقم)
);*/
