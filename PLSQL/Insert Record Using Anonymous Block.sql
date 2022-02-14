/*
Create a PL/SQL block to insert a new record into the Department table. Fetch the maximum department id from the Department table and add 10 to it; take this value for department id; 'TESTING' is the value for department name and CHN-102 is the value for Location ID.

Note: Use '/' to terminate your query before compilation and evaluation

Table name : Department

Column name        Data type    Constraints
DEPARTMENT_ID     NUMBER(5)        PK
DEPARTMENT_NAME   VARCHAR2(25)     NOT NULL
LOCATION_ID       VARCHAR2(15)

*/
DECLARE

   dID NUMBER;
   /*dID Department.department_id%TYPE;*/

BEGIN
   SELECT MAX(department_id)+10 INTO dID FROM Department;

   INSERT INTO Department (department_id,department_name,location_id)
   VALUES (dID,'TESTING','CHN-102');
END;
/
