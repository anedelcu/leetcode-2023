# Write your MySQL query statement below

SELECT 
    id, 'Root' as Type
FROM
    tree
WHERE
    p_id is NULL
    
UNION 

SELECT 
    id, "Leaf" AS Type
FROM    
    tree
WHERE
    id NOT IN (SELECT DISTINCT
              p_id
         FROM
               tree
         WHERE
               p_id IS NOT NULL
        )
        AND p_id IS NOT NULL
              
UNION

SELECT
    id, 'Inner' AS Type
FROM
    tree
WHERE
    id IN (SELECT DISTINCT
            p_id
        FROM
            tree
        WHERE
            p_id IS NOT NULL)
        AND p_id IS NOT NULL
ORDER BY id;