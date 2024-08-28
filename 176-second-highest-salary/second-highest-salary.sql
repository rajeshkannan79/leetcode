# Write your MySQL query statement below
Select(select distinct(salary) from Employee 
ORDER BY salary DESC
limit 1 offset 1) as SecondHighestSalary 