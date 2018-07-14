## springboot-Mongo-Crud

	This is a sample project in springboot and mongodb database
	
	Setting up mongo
	----------------
	1. Start mongod.exe 
	2. Start mongo.exe and create collection and needed documents 
	3. Keep the mongod.exe running

### Student collection 
----------------------

> Student collection assumed to have similar documents for simplicity.

**Sample document structure**

* _id
* name
* cgpa
* department
	
### Sample operations and url requests
--------------------------------------
1. Find student by id

	> http://localhost:8080/student/find/1

1. Display all student information

	> http://localhost:8080/student/findall

2. Add new student entry to the table

	> http://localhost:8080/student/insert?id=5&name=kai&cgpa=9.87&department=CSE

3. Update student entry

	> http://localhost:8080/student/update?id=7&name=sadie&cgpa=8.17&department=IT

4. Delete student entry

	> http://localhost:8080/student/delete/8

5. Truncate the student table

	> http://localhost:8080/student/deleteAll


	
