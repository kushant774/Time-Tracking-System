-- Create database for time tracking
CREATE DATABASE time_tracking;

-- Users table
CREATE TABLE users (
    user_id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100),
    email VARCHAR(100) UNIQUE,
    role ENUM('Admin', 'User'),
    password VARCHAR(255) -- Storing hashed password
);

-- Time logs table
CREATE TABLE time_logs (
    log_id INT AUTO_INCREMENT PRIMARY KEY,
    user_id INT,
    start_time TIMESTAMP,
    end_time TIMESTAMP,
    task_description TEXT,
    FOREIGN KEY (user_id) REFERENCES users(user_id)
);

-- System configuration table
CREATE TABLE system_config (
    config_id INT PRIMARY KEY,
    work_hours_per_day INT,
    break_time_minutes INT
);
