/*Create a PL/SQL Procedure to insert employee details into Employee table. Before inserting, check whether the employee age is eligible or not.  Employee age should be 18 or greater.  Values are passed as argument to the procedure.

If age valid, insert employee record into table and print the message "Age valid - Record inserted", else print the message "Age invalid - Record not inserted" by raising an exception.

Table: EMPLOYEE*/
create or replace PROCEDURE CHECK_AGE_ELIGIBILITY(
    v_id IN EMPLOYEE.EMPID%TYPE,
    v_name IN EMPLOYEE.EMPNAME%TYPE,
    v_age IN EMPLOYEE.AGE%TYPE) as

not_of_age exception;

    begin
        if v_age>=18 then
            insert into EMPLOYEE(empid,empname,age) values(v_age,v_name,v_age);
            dbms_output.put_line('Age valid - Record inserted');
        else
            raise not_of_age;

        end if;
    exception
        when not_of_age then
        dbms_output.put_line('Age invalid - Record not inserted');
end;
/
