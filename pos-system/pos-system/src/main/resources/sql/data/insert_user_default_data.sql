INSERT INTO user (username, password, email, last_name, first_name, middle_name,
    user_position_id, user_role_id, subscription_start, subscription_end, 
    created_date, created_by, active)
VALUES ('admin', 'admin123', 'admin@example.com', 'admin', 'admin',  'admin',  
     1, 1, NOW(), NULL, NOW(), 1, true),
       ('user', 'user123', 'user@example.com', 'user', 'user', 'user', 
    2, 2, NOW(), NULL, NOW(), 1, true);