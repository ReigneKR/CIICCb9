-- DATABASE SCRIPT: Run this first in MySQL tool
CREATE DATABASE IF NOT EXISTS GcashApp;
USE GcashApp;

-- Create the structure
CREATE TABLE IF NOT EXISTS Balance (
    ID INT AUTO_INCREMENT PRIMARY KEY,
    amount DECIMAL(15, 2) NOT NULL,
    user_ID INT NOT NULL UNIQUE
);
-- Insert initial data
INSERT INTO Balance (amount, user_ID) VALUES (5000.75, 101);
INSERT INTO Balance (amount, user_ID) VALUES (12500.00, 102);
INSERT INTO Balance (amount, user_ID) VALUES (50.25, 103);
INSERT INTO Balance (amount, user_ID) VALUES (2500.00, 104);
INSERT INTO Balance (amount, user_ID) VALUES (750.50, 105);
INSERT INTO Balance (amount, user_ID) VALUES (150000.00, 106);
INSERT INTO Balance (amount, user_ID) VALUES (12.00, 107);
INSERT INTO Balance (amount, user_ID) VALUES (3340.85, 108);
INSERT INTO Balance (amount, user_ID) VALUES (999.99, 109);
INSERT INTO Balance (amount, user_ID) VALUES (5670.30, 110);