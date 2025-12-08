-- Create the accounts table
CREATE TABLE IF NOT EXISTS accounts (
    id INT PRIMARY KEY,
    balance DOUBLE NOT NULL,
    account_name VARCHAR(100)
);

-- Insert 30 Dummy accounts with varying balances
INSERT INTO accounts (id, balance, account_name) VALUES
(1, 5000.0, 'Juan Dela Cruz'), (2, 1200.0, 'Maria Clara'), (3, 350.0, 'Jose Rizal'),
(4, 10000.0, 'Andres Bonifacio'), (5, 75.0, 'Emilio Aguinaldo'), (6, 2300.0, 'Apolinario Mabini'),
(7, 450.0, 'Gabriela Silang'), (8, 8900.0, 'Melchora Aquino'), (9, 15.0, 'Antonio Luna'),
(10, 6700.0, 'Marcelo del Pilar'), (11, 3200.0, 'Gregorio del Pilar'), (12, 150.0, 'Lapu-Lapu'),
(13, 12000.0, 'Francisco Balagtas'), (14, 500.0, 'Leona Florentino'), (15, 2100.0, 'Juan Luna'),
(16, 800.0, 'Mariano Ponce'), (17, 4300.0, 'Pio Valenzuela'), (18, 90.0, 'Diego Silang'),
(19, 7200.0, 'Teresa Magbanua'), (20, 1100.0, 'Felipe Agoncillo'), (21, 600.0, 'Lope K. Santos'),
(22, 25000.0, 'Benigno Aquino'), (23, 340.0, 'Corazon Aquino'), (24, 1800.0, 'Ramon Magsaysay'),
(25, 950.0, 'Manuel Quezon'), (26, 5400.0, 'Sergio Osmeña'), (27, 200.0, 'Diosdado Macapagal'),
(28, 1300.0, 'Carlos Garcia'), (29, 880.0, 'Elpidio Quirino'), (30, 4500.0, 'Jose Laurel');