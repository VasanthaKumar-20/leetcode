# Write your MySQL query statement below
-- select(select distinct salary from employee order by salary desc limit 1 offset 1) as SecondHighestSalary;

select(select distinct max(salary) from employee where salary<>(select max(salary) from employee))as SecondHighestSalary;