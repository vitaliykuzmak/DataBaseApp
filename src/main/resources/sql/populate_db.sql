INSERT INTO worker (NAME, BIRTHDAY, LEVEL, SALARY) VALUES
('Alice', '1985-02-15', 'Senior', 7000),
('Bob', '1990-06-12', 'Middle', 4500),
('Charlie', '1998-11-23', 'Junior', 1200),
('David', '1995-05-14', 'Junior', 1500),
('Eve', '1987-08-09', 'Senior', 8000),
('Frank', '2000-04-18', 'Trainee', 900),
('Grace', '1992-03-03', 'Middle', 3000),
('Heidi', '1989-07-30', 'Senior', 6000),
('Ivan', '1997-12-01', 'Junior', 1100),
('Judy', '1983-11-10', 'Middle', 5200);

INSERT INTO client (NAME) VALUES
('Client A'), 
('Client B'), 
('Client C'), 
('Client D'), 
('Client E');

INSERT INTO project (CLIENT_ID, START_DATE, FINISH_DATE) VALUES
(1, '2023-01-01', '2024-01-01'),
(1, '2022-05-01', '2023-05-01'),
(2, '2021-04-01', '2022-08-01'),
(3, '2023-07-01', '2023-10-01'),
(4, '2021-01-01', '2022-01-01'),
(5, '2023-02-01', '2023-12-01'),
(5, '2020-03-01', '2023-03-01'),
(3, '2023-01-01', '2023-02-01'),
(4, '2022-10-01', '2024-10-01'),
(2, '2020-06-01', '2021-06-01');

INSERT INTO project_worker (PROJECT_ID, WORKER_ID) VALUES
(1, 1), (1, 2), (2, 3), (2, 4), (3, 5), 
(4, 6), (5, 7), (6, 8), (7, 9), (8, 10), 
(9, 1), (9, 2), (9, 3), (10, 4), (10, 5);