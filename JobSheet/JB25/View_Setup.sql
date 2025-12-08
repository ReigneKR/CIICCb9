-- 1. Create the table structure if it doesn't exist
CREATE TABLE IF NOT EXISTS transactions (
    transaction_id INT AUTO_INCREMENT PRIMARY KEY,
    user_id INT NOT NULL,
    amount DECIMAL(10, 2) NOT NULL,
    type VARCHAR(50) NOT NULL,
    transaction_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- 2. Insert 30 dummy transactions
INSERT INTO transactions (user_id, amount, type, transaction_date) VALUES
(101, 500.00, 'Cash-in', '2023-10-01 10:00:00'),
(102, 1200.50, 'Transfer', '2023-10-01 11:30:00'),
(103, 50.00, 'Pay Bills', '2023-10-02 09:15:00'),
(101, 200.00, 'Cash-in', '2023-10-02 14:20:00'),
(104, 3000.00, 'Cash-in', '2023-10-03 08:00:00'),
(102, 150.75, 'Pay Bills', '2023-10-03 16:45:00'),
(105, 500.00, 'Transfer', '2023-10-04 12:00:00'),
(103, 1000.00, 'Cash-in', '2023-10-04 13:10:00'),
(101, 75.00, 'Pay Bills', '2023-10-05 10:30:00'),
(106, 2500.00, 'Cash-in', '2023-10-05 15:00:00'),
(104, 400.00, 'Transfer', '2023-10-06 09:00:00'),
(102, 20.00, 'Pay Bills', '2023-10-06 11:20:00'),
(107, 600.00, 'Cash-in', '2023-10-07 14:00:00'),
(105, 100.00, 'Transfer', '2023-10-07 17:30:00'),
(103, 500.00, 'Cash-in', '2023-10-08 08:45:00'),
(108, 1500.00, 'Cash-in', '2023-10-08 13:00:00'),
(101, 300.00, 'Transfer', '2023-10-09 10:15:00'),
(104, 800.00, 'Pay Bills', '2023-10-09 16:00:00'),
(109, 100.00, 'Cash-in', '2023-10-10 11:00:00'),
(102, 250.00, 'Transfer', '2023-10-10 14:30:00'),
(106, 120.00, 'Pay Bills', '2023-10-11 09:20:00'),
(110, 5000.00, 'Cash-in', '2023-10-11 12:00:00'),
(107, 45.50, 'Pay Bills', '2023-10-12 15:10:00'),
(105, 300.00, 'Transfer', '2023-10-12 18:00:00'),
(101, 1000.00, 'Cash-in', '2023-10-13 07:30:00'),
(103, 200.00, 'Transfer', '2023-10-13 10:00:00'),
(108, 60.00, 'Pay Bills', '2023-10-14 11:45:00'),
(104, 150.00, 'Cash-in', '2023-10-14 14:20:00'),
(110, 2000.00, 'Transfer', '2023-10-15 09:00:00'),
(102, 500.00, 'Cash-in', '2023-10-15 13:15:00');