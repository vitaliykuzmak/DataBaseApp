WITH min_max_birth AS (
    SELECT 
        MIN(BIRTHDAY) AS min_birthday,
        MAX(BIRTHDAY) AS max_birthday
    FROM worker
)
SELECT 
    CASE 
        WHEN worker.BIRTHDAY = min_max_birth.min_birthday THEN 'OLDEST'
        WHEN worker.BIRTHDAY = min_max_birth.max_birthday THEN 'YOUNGEST'
    END AS TYPE,
    worker.NAME,
    worker.BIRTHDAY
FROM 
    worker, min_max_birth
WHERE 
    worker.BIRTHDAY = min_max_birth.min_birthday 
    OR worker.BIRTHDAY = min_max_birth.max_birthday;