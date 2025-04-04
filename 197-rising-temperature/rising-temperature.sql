# Write your MySQL query statement below
select a.id from weather a join weather b 
on DateDiff(a.recordDate,b.recordDate)=1 
and a.temperature>b.temperature;