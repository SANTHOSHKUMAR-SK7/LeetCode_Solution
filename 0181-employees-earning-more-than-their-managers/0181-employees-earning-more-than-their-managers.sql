# Write your MySQL query statement below
-- SELECT name as Employee
-- FROM Employee where managerId is not null
-- limit 1;
-- SELECT e1.name AS Employee
-- FROM Employee e1
-- JOIN Employee e2 ON e1.managerId = e2.id
-- WHERE e1.salary > e2.salary;

SELECT emp1.
name AS Employee FROM Employee emp1
JOIN Employee emp2 ON emp1.managerId = emp2.id
WHERE emp1.salary > emp2.salary