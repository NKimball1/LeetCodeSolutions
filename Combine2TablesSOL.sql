# Write your MySQL query statement below
SELECT FirstName, LastName, City, State
FROM Person p
LEFT JOIN Address on p.PersonID = Address.PersonID;
