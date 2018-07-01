
About:
==========
This project is used to manipulate Table data in Mysql Databse - food
Table name - Restaurent

Execution:
==============
Check if application works fine, hit url - GET
http://localhost:8080/rest/restaurent/


See all Restaurent details present in table - GET
http://localhost:8080/rest/restaurent/all


See particular Restaurent details based on id - GET
http://localhost:8080/rest/restaurent/#id


Save a new Restaurent in DB - POST
http://localhost:8080/rest/restaurent/addnew

Input data format - 
{"resturentName":"name","address":"address","contactInfo":1234567890}


Delete a Restaurent from table based on id - Delete
http://localhost:8080/rest/restaurent/delete/#id
