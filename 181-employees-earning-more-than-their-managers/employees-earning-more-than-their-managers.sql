select e1.name as Employee from Employee as e1
where e1.salary > (select e2.salary from employee e2 where e2.id = e1.managerid)
