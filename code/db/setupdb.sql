CREATE DATABASE IF NOT EXISTS UserAdmin;
CREATE DATABASE IF NOT EXISTS UserAdminTest;
GRANT ALL PRIVILEGES ON UserAdmin.* TO 'useradmin'@'localhost' IDENTIFIED BY '3adb' WITH GRANT OPTION;
GRANT ALL PRIVILEGES ON UserAdminTest.* TO 'useradmin'@'localhost' WITH GRANT OPTION;
