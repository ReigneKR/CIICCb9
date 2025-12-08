-- Table Structure
CREATE TABLE Transaction (
    ID INT AUTO_INCREMENT PRIMARY KEY,
    amount DOUBLE NOT NULL,
    name VARCHAR(100),
    account_ID INT NOT NULL,
    date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    transferToID INT,
    transferFromID INT
);

-- Inserting 30 Dummy Records (Samples)
INSERT INTO Transaction (amount, name, account_ID, transferToID, transferFromID) VALUES
(500.00, 'Cash-in', 1, 1, 10), (1200.00, 'Cash-in', 2, 2, 11), (50.00, 'Cash-in', 3, 3, 12),
(300.00, 'Cash-in', 4, 4, 13), (1000.00, 'Cash-in', 5, 5, 14), (250.00, 'Cash-in', 6, 6, 15),
(700.00, 'Cash-in', 7, 7, 16), (150.00, 'Cash-in', 8, 8, 17), (2000.00, 'Cash-in', 9, 9, 18),
(450.00, 'Cash-in', 10, 10, 19), (800.00, 'Cash-in', 11, 11, 20), (100.00, 'Cash-in', 12, 12, 21),
(600.00, 'Cash-in', 13, 13, 22), (20.00, 'Cash-in', 14, 14, 23), (1100.00, 'Cash-in', 15, 15, 24),
(350.00, 'Cash-in', 16, 16, 25), (900.00, 'Cash-in', 17, 17, 26), (55.00, 'Cash-in', 18, 18, 27),
(1250.00, 'Cash-in', 19, 19, 28), (400.00, 'Cash-in', 20, 20, 29), (750.00, 'Cash-in', 21, 21, 30),
(1500.00, 'Cash-in', 22, 22, 31), (95.00, 'Cash-in', 23, 23, 32), (650.00, 'Cash-in', 24, 24, 33),
(200.00, 'Cash-in', 25, 25, 34), (1800.00, 'Cash-in', 26, 26, 35), (320.00, 'Cash-in', 27, 27, 36),
(850.00, 'Cash-in', 28, 28, 37), (130.00, 'Cash-in', 29, 29, 38), (2200.00, 'Cash-in', 30, 30, 39);