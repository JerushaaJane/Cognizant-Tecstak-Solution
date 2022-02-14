/*
Write a PL/SQL block to calculate the area of a circle for the radius ranging from 3 to 7 . Store the radius and corresponding area into the Circle table.

Circle :

Radius	Number(5)
Area	Number(7,2)

Assume that the circle table has been already created.
Note: Use '/' to terminate your query before compilation and evaluation.
*/
DECLARE
    area number(7,2);
    radius number(5):=3;
    pi constant number:=3.14;
BEGIN
    while radius<=7
    loop
    area:=pi*radius*radius;
    Insert into circle (radius,area) values (radius,area);
    radius:=radius+1;
    end loop;

END;
/
