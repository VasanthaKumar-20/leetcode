# Write your MySQL query statement below
select e.name Employee from employee as e join employee as m on e.managerid=m.id where e.salary>m.salary;