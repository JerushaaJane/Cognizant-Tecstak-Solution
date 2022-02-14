/*
Create a procedure named 'insert_credit' to insert the values in the credit_card table by passing 5 inputs as parameters.

Hints: Procedure name:    insert_credit Input parameter : credit_id with data type as number,credit_card_number with data type as varchar,credit_card_expire with data type as varchar,holder_name with data type as varchar and card_type with data type as varchar Table used: credit_card

Note: Use '/' to terminate your query before compilation and evaluation
*/
CREATE OR REPLACE PROCEDURE insert_credit(
credit_id NUMBER,
credit_card_number VARCHAR,
credit_card_expire VARCHAR,
holder_name VARCHAR,
card_type VARCHAR)
AS
   /*Declaration block*/

BEGIN
  INSERT INTO credit_card(id,card_number,card_expire,name,cc_type)
  VALUES(credit_id,credit_card_number,credit_card_expire,holder_name,card_type);

END insert_credit;
/
