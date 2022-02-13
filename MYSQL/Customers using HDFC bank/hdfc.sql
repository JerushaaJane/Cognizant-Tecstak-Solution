/*Write a query to display the unique user name and their city who have booked their tickets by not using the HDFC bank for any of the bookings. Sort the result based on the user name.

(HINT: Use users and bookingdetails tables to retrieve records.)

(Note: Evaluate only the respective query to get the desired result. Data is case sensitive.

Maintain the same sequence of column order as given in the problem description)*/
SELECT DISTINCT u.name,u.address
FROM users u join bookingdetails b
ON u.user_id=b.user_id
WHERE u.user_id NOT IN(SELECT user_id FROM bookingdetails WHERE name = "HDFC" )
ORDER BY u.name;
