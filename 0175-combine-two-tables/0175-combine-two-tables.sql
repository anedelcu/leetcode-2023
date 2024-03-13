# Write your MySQL query statement below
SELECT p.firstname, p.lastname, a.city, a.state
FROM PERSON p
LEFT JOIN address a 
ON p.personId = a.personId;