select Student.student_name,Department.department_name from
Student inner join Department on Department.department_id=Student.department_id
where city="Coimbatore"
order by student_name asc;
