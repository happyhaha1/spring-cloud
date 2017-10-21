create table USER (
  id int(15) PRIMARY KEY AUTO_INCREMENT,
  user_name varchar(255) NOT NULL,
  UNIQUE KEY (user_name)
);