# Write your MySQL query statement below
SELECT emp1.
name AS Employee FROM Employee emp1
JOIN Employee emp2 ON emp1.managerId = emp2.id
WHERE emp1.salary > emp2.salary
