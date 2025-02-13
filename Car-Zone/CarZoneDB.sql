
Drop database CarZone;
CREATE DATABASE CarZone;
USE CarZone;

CREATE TABLE brand ( bid int DEFAULT NULL, bname varchar(50) DEFAULT NULL );

INSERT INTO brand VALUES (1,'Fiat'),(2,'Volkswagen '),(3,'Audi'),(4,'Mercedes-Benz'),(5,'BMW'),(6,'Porsche'),(7,'Ferrari '),(8,'Tesla'),(9,'Jeep'),(10,'Alfa Romeo') ;

CREATE TABLE cart ( Name varchar(100) DEFAULT NULL, bname varchar(50) DEFAULT NULL, cname varchar(50) DEFAULT NULL, carname varchar(50) DEFAULT NULL, carprice int DEFAULT NULL, carquantity int DEFAULT NULL, carimage varchar(200) DEFAULT NULL );

CREATE TABLE category ( cid int DEFAULT NULL, cname varchar(50) DEFAULT NULL );

INSERT INTO category VALUES (1,'Berlina'),(2,'Suv'),(3,'Elettrica'),(4,'Di Lusso');



CREATE TABLE contactus ( id int NOT NULL AUTO_INCREMENT, Name varchar(100) DEFAULT NULL, Email_Id varchar(100) DEFAULT NULL, Contact_Number varchar(15) DEFAULT NULL, Message varchar(8000) DEFAULT NULL, PRIMARY KEY (id) );

CREATE TABLE customer ( Name varchar(100) DEFAULT NULL, Password varchar(20) DEFAULT NULL, Email_Id varchar(100) DEFAULT NULL, Contact_Number varchar(15) DEFAULT NULL );

CREATE TABLE login ( username varchar(100) DEFAULT NULL, password varchar(100) DEFAULT NULL );

INSERT INTO login VALUES ('admin','admin');

CREATE TABLE order_details ( Date varchar(100) DEFAULT NULL, Name varchar(100) DEFAULT NULL, bname varchar(50) DEFAULT NULL, cname varchar(50) DEFAULT NULL, carname varchar(50) DEFAULT NULL, carprice int DEFAULT NULL, carquantity int DEFAULT NULL, carimage varchar(200) DEFAULT NULL );

CREATE TABLE orders ( Order_Id int NOT NULL AUTO_INCREMENT, Customer_Name varchar(100) DEFAULT NULL, Customer_City varchar(45) DEFAULT NULL, Date varchar(100) DEFAULT NULL, Total_Price int DEFAULT NULL, Status varchar(45) DEFAULT NULL, PRIMARY KEY (Order_Id) );


CREATE TABLE car ( carid int NOT NULL AUTO_INCREMENT, carname varchar(50) DEFAULT NULL, carprice int DEFAULT NULL, carquantity int DEFAULT NULL, carimage varchar(200) DEFAULT NULL,description varchar(1000) DEFAULT NULL, bid int DEFAULT NULL, cid int DEFAULT NULL, PRIMARY KEY (carid) );



CREATE VIEW viewlist AS 
SELECT 
    brand.bname AS bname,
    category.cname AS cname,
    car.carname AS carname,
    car.carprice AS carprice,
    car.carquantity AS carquantity,
    car.carimage AS carimage,
    car.description AS description
FROM 
    brand
JOIN 
    car ON brand.bid = car.bid
JOIN 
    category ON car.cid = category.cid;

CREATE VIEW berlina AS 
SELECT 
    brand.bname AS bname,
    category.cname AS cname,
    car.carname AS carname,
    car.carprice AS carprice,
    car.carquantity AS carquantity,
    car.carimage AS carimage,
    car.description AS description
FROM 
    brand
JOIN 
    car ON brand.bid = car.bid
JOIN 
    category ON car.cid = category.cid
WHERE 
    category.cid = 1;


CREATE VIEW suv AS 
SELECT 
    brand.bname AS bname,
    category.cname AS cname,
    car.carname AS carname,
    car.carprice AS carprice,
    car.carquantity AS carquantity,
    car.carimage AS carimage,
    car.description AS description
FROM 
    brand
JOIN 
    car ON brand.bid = car.bid
JOIN 
    category ON car.cid = category.cid
WHERE 
    category.cid = 2;

CREATE VIEW elettrica AS 
SELECT 
    brand.bname AS bname,
    category.cname AS cname,
    car.carname AS carname,
    car.carprice AS carprice,
    car.carquantity AS carquantity,
    car.carimage AS carimage,
    car.description AS description
FROM 
    brand
JOIN 
    car ON brand.bid = car.bid
JOIN 
    category ON car.cid = category.cid
WHERE 
    category.cid = 3;

CREATE VIEW dilusso AS 
SELECT 
    brand.bname AS bname,
    category.cname AS cname,
    car.carname AS carname,
    car.carprice AS carprice,
    car.carquantity AS carquantity,
    car.carimage AS carimage,
    car.description AS description
FROM 
    brand
JOIN 
    car ON brand.bid = car.bid
JOIN 
    category ON car.cid = category.cid
WHERE 
    category.cid = 4;

CREATE TABLE usermaster ( Name varchar(100) DEFAULT NULL, Password varchar(20) DEFAULT NULL );

INSERT INTO usermaster VALUES ('admin','admin');
INSERT INTO car (carname, carprice, carquantity, carimage, description, bid, cid) VALUES
('Alfa Romeo Mito', 22000, 1, 'alfamito.jpeg', 'Compatta sportiva con motore turbo da 1.4L da 155 CV, design aggressivo e interni raffinati. Ottima per la guida urbana e dinamica.', 10, 1),
('Alfa Romeo Stelvio', 45000, 1, 'alfastelvio.jpg', 'SUV sportivo con trazione integrale Q4, motore 2.2L diesel da 210 CV o 2.0L benzina da 280 CV, interni in pelle e tecnologia avanzata.', 10, 2),
('Audi A6', 55000, 1, 'audia6.jpg', 'Berlina di lusso con motore 2.0L TFSI da 265 CV, sistema MMI Touch Response, interni premium in pelle e illuminazione ambientale personalizzabile.', 3, 1),
('Audi Q8', 78000, 1, 'audiQ8.jpg', 'SUV coupé premium con motore 3.0L V6 TFSI da 340 CV, trazione quattro, sospensioni pneumatiche adattive e un abitacolo high-tech con display digitali.', 3, 2),
('BMW M', 90000, 1, 'bmw-m.jpg', 'Versione sportiva ad alte prestazioni con motore 3.0L TwinPower Turbo da 510 CV, trazione posteriore o integrale xDrive, e modalità di guida personalizzabili.', 5, 4),
('BMW X', 65000, 1, 'bmw-x.jpg', 'SUV di lusso con linee aerodinamiche, motore 3.0L da 382 CV, trazione integrale intelligente xDrive, interni in pelle Vernasca e tecnologia BMW iDrive 8.', 5, 2),
('Ferrari', 250000, 1, 'ferrari.jpg', 'Supercar con prestazioni da pista, motore V8 da oltre 700 CV, telaio in fibra di carbonio, aerodinamica attiva e interni lussuosi in Alcantara.', 7, 4),
('Ferrari F8', 320000, 1, 'ferrarif8.jpg', 'Supercar con motore V8 biturbo da 720 CV, accelerazione 0-100 km/h in 2,9 secondi, peso ridotto e tecnologia derivata dalla Formula 1.', 7, 4),
('Fiat 500', 18000, 1, 'fiat500.png', 'City car iconica con motore 1.0L mild hybrid da 70 CV, design retrò con tocchi moderni, infotainment Uconnect e consumi ridotti.', 1, 2),
('Fiat Panda', 16000, 1, 'fiatPanda.jpg', 'Utilitaria spaziosa e versatile con motore 1.0L FireFly Hybrid da 70 CV, trazione 4x4 opzionale, e sistema Uconnect con Apple CarPlay.',1, 1),
('Jeep Compass', 38000, 1, 'jeepCompass.jpg', 'SUV robusto con motore 1.3L Turbo da 150 CV, trazione integrale Active Drive, sistema infotainment Uconnect 10.1” e design moderno.', 9, 2),
('Jeep Renegade', 32000, 1, 'jeepRenegade.jpg', 'SUV compatto con motore 1.3L Turbo da 130 CV, trazione 4x4 Trailhawk per il fuoristrada, e sistemi di assistenza alla guida avanzati.', 9, 2),
('Mercedes-Benz', 70000, 1, 'mercedes-benz.jpg', 'Berlina elegante e confortevole con motore 2.0L turbo da 265 CV, interni con illuminazione ambientale a 64 colori e sistema MBUX di ultima generazione.', 4, 1),
('Mercedes-Benz Classe G', 150000, 1, 'mercedesG.jpg', 'Fuoristrada di lusso con motore V8 biturbo da 585 CV, trazione integrale 4MATIC, design iconico e interni ultra-premium in pelle Nappa.', 4, 2),
('Porsche', 100000, 1, 'porsche.jpg', 'Auto sportiva con motore boxer da 385 CV, cambio PDK a doppia frizione, sospensioni attive PASM e interni minimalisti con comandi digitali.', 6, 4),
('Porsche Cayenne', 85000, 1, 'porscheCayenne.jpg', 'SUV sportivo con motore V6 da 340 CV, trazione integrale, modalità di guida selezionabili e interni di lusso con display touchscreen da 12 pollici.', 6, 2),
('Tesla Model 3', 50000, 1, 'testlaModel3.jpg', 'Berlina elettrica con autonomia fino a 600 km, accelerazione 0-100 km/h in 3,1 secondi (versione Performance) e sistema Autopilot avanzato.', 8, 3),
('Tesla Roadster', 200000, 1, 'teslaRoadster.jpg', 'Supercar elettrica con oltre 1000 CV, velocità massima superiore a 400 km/h, e un’accelerazione 0-100 km/h in meno di 2 secondi.', 8, 3),
('Volkswagen Polo 2021', 23000, 1, 'volkswagen-polo.jpg', 'Utilitaria moderna con motore 1.0L TSI da 95 CV, tecnologia IQ.Drive, strumentazione digitale e infotainment con schermo da 8 pollici.', 2, 1),
('Volkswagen Taigo', 28000, 1, 'Volkswagen-Taigo.jpg', 'SUV coupé compatto con motore 1.5L TSI da 150 CV, tetto panoramico, interni digitalizzati e fari LED Matrix IQ.Light.', 2, 2);





