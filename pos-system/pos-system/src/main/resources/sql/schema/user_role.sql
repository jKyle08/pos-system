CREATE TABLE user_role (
    user_role_id BIGINT AUTO_INCREMENT PRIMARY KEY,
    user_role_name VARCHAR(100) NOT NULL,
    created_date DATETIME NOT NULL,
    updated_date DATETIME,
    created_by BIGINT UNSIGNED NOT NULL,
    updated_by BIGINT UNSIGNED,
    active BOOLEAN NOT NULL,
    FOREIGN KEY (created_by) REFERENCES user(user_id),
    FOREIGN KEY (updated_by) REFERENCES user(user_id)
);