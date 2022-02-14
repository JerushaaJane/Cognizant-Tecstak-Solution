/*Create a PL/SQL Trigger to display the message “NEW EMPLOYEE DETAILS INSERTED”, whenever a new record is inserted into Employee table.*/
create or replace trigger Display
after insert on employee
for each row
begin
dbms_output.put_line('New employee inserted');
end;
/
