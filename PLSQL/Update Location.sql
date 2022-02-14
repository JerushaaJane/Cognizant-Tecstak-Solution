/*Create a PL/SQL  block to update the location ID for an existing department, which has location ID preceded with   'HQ' as

 'HQ-BLR-101'.

Note: Use '/' to terminate your query before compilation and evaluation

Table name : Department
Column name        Data type    Constraints
DEPARTMENT_ID     NUMBER(5)        PK
DEPARTMENT_NAME   VARCHAR2(25)     NOT NULL
LOCATION_ID       VARCHAR2(15)
*/
BEGIN
UPDATE Department SET LOCATION_ID='HQ-BLR-101'
WHERE LOCATION_ID LIKE 'HQ%';
END;
/
