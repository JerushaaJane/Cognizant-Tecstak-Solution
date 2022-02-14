/*Create a procedure named 'select_city' which accepts one input parameter user_id of type number and one output parameter city_details of type varchar. This procedure is used to display the city_details of user.If the user is from Bangalore then display the city_details as 'User is from Bangalore',or if the user is from Chennai then display the city_details as 'User is from Chennai', else display the city_details as 'User is from other cities'.

Hints: Data is case sensitive.
Procedure name: select_city
Input parameter : user_id with data type as number
Output parameter: city_details with data type as varchar.

Note: Use '/' to terminate your query before compilation and evaluation*/
create or replace procedure select_city
     (user_id       in number,
       city_details out varchar2                  --> no size here
      )
    as
   begin
      select case
        when city = 'Bangalore'  then
          'User is from Bangalore'
       when city = 'Chennai'    then
        'User is from Chennai'
     else
         'User is from other cities'
    end tmp_status
    into city_details
    from contact cnt
    where cnt.id = user_id;
   end;
  /
