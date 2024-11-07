SELECT ID, EXTRACT(YEAR FROM age(FINISH_DATE, START_DATE)) * 12 + EXTRACT(MONTH FROM age(FINISH_DATE, START_DATE)) AS MONTH_COUNT
FROM project
WHERE (EXTRACT(YEAR FROM age(FINISH_DATE, START_DATE)) * 12 + EXTRACT(MONTH FROM age(FINISH_DATE, START_DATE))) = (
    SELECT MAX(EXTRACT(YEAR FROM age(FINISH_DATE, START_DATE)) * 12 + EXTRACT(MONTH FROM age(FINISH_DATE, START_DATE))) FROM project
);
