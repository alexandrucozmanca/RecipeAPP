#Create Database
CREATE DATABASE recipe_dev;
CREATE DATABASE recipe_prod;

#Create database service accounts
CREATE USER 'recipe_dev_user'@'localhost' IDENTIFIED BY 'alex';
CREATE USER 'recipe_prod_user'@'localhost' IDENTIFIED BY 'alex';

#Database grants
GRANT SELECT ON recipe_dev.* to 'recipe_dev_user'@'localhost';
GRANT INSERT ON recipe_dev.* to 'recipe_dev_user'@'localhost';
GRANT DELETE ON recipe_dev.* to 'recipe_dev_user'@'localhost';
GRANT UPDATE ON recipe_dev.* to 'recipe_dev_user'@'localhost';

GRANT SELECT ON recipe_prod.* to 'recipe_dev_user'@'localhost';
GRANT INSERT ON recipe_prod.* to 'recipe_dev_user'@'localhost';
GRANT DELETE ON recipe_prod.* to 'recipe_dev_user'@'localhost';
GRANT UPDATE ON recipe_prod.* to 'recipe_dev_user'@'localhost';