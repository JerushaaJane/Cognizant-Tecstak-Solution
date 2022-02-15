/*Create a PL/SQL Package with Procedure in it.  Procedure will take designation and incentive as input and update the employee salary by adding the incentive for the given designation. Display the number of employee records that have got updated, e.g. ‘3 employee record(s) are updated’.

Note: Use '/' to terminate your query before compilation and evaluation
*/
CREATE OR REPLACE PACKAGE EMP_Designation AS
PROCEDURE EMP_Details
(design Employee.Designation%TYPE, Incentive NUMBER);
END emp_designation;
/

CREATE OR REPLACE PACKAGE BODY EMP_Designation AS
PROCEDURE EMP_Details
(design employee.designation%TYPE, Incentive NUMBER)
IS
BEGIN
UPDATE employee SET Employee.Salary = Employee.Salary + Incentive
WHERE Designation = design;
dbms_output.put_line(SQL%ROWCOUNT || ' employee(s) are updated.');
END EMP_Details;
END;
/
