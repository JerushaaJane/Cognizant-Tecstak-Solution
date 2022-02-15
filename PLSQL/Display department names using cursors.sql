/*
Create a PL/SQL block to display all the department names from the Department table using cursors. The department names should be displayed in ascending order
*/
SET SERVEROUTPUT ON;
DECLARE
dname department.department_name%type;
cursor curs is SELECT department_name FROM department order by department_name;
BEGIN
  dbms_output.put_line('Department Names are :');
    OPEN curs;
    LOOP
        FETCH curs INTO dname;
        EXIT WHEN curs%notfound;
        dbms_output.put_line(dname);
    END LOOP;
    CLOSE curs;
END;
/
