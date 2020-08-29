Login Specification
===================
Created by Dell on 8/29/2020

This is an executable specification file which follows markdown syntax.
Every heading in this file denotes a scenario. Every bulleted point denotes a step.

table: ./src/test/resources/users.csv
     
Valid User Login
----------------
* Sign in using username "harsharnsoffice2@gmail.com" and password "eve20000"
* Logged in username is "Harsharn Wijewardana"

Invalid User Login
------------------
* Sign in using username "harsharnsoffice2@gmail.com" and password "password123"
* Login error is visible

CSV Data driven login
---------------------
* Sign in using username <Email> and password <Password>
* Logged in username is <LoggedInUsername>
