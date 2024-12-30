INSERT INTO engineer (id, name, email_id, city, notice_period)
VALUES (1, 'Rohit Abhishek', 'rabhi1611@gmail.com', 'Bengaluru, Karnataka, India', '30 days');

INSERT INTO education (education_id, id, course, major, start_year, end_year, grade, university)
VALUES (1, 1, 'B-Tech', 'Computer Science and Engineering', '2019', '2023', '80.2%', 'Dr. A.P.J. Abdul Kalam Technical University, formerly the Uttar Pradesh Technical University.');

INSERT INTO experience (experience_id, id, role, company, summary, start_date, end_date)
VALUES (1, 1, 'Associate Engineer', 'Caterpillar Inc (Contract)', 'Working on CAT Productivity projects as a back-end developer. Daily tasks include implementing respective stories of features, Bug fixes, and learning.', '14/08/2023','present');

INSERT INTO experience (experience_id, id, role, company, summary, start_date, end_date)
VALUES (2, 1, 'College Intern', 'Caterpillar Inc', 'Learned how software engineers work on real-life projects to satisfy customers’ demands. Got practical exposure to skills like Java, Spring Boot, etc.', '06/02/2023', '28/07/2023');

INSERT INTO profile (profile_id, id, social_name, link)
VALUES (1, 1, 'LinkedIn', 'https://www.linkedin.com/in/rohit-abhishek-422808194/');

INSERT INTO profile (profile_id, id, social_name, link)
VALUES (2, 1, 'LeetCode', 'https://leetcode.com/u/rabhi1611/');

INSERT INTO profile (profile_id, id, social_name, link)
VALUES (3, 1, 'GitHub', 'https://github.com/rabhi1611');

INSERT INTO profile (profile_id, id, social_name, link)
VALUES (4, 1, 'geeksforgeeks', 'https://www.geeksforgeeks.org/user/rabhi1611/');

INSERT INTO project (project_id, id, name, detail)
VALUES (1, 1, 'VISIONLINK PRODUCTIVITY APPLICATION, CATERPILLAR', 'This Project helps Caterpillar customers to utilize its resource efficiently.');

INSERT INTO project (project_id, id, name, detail)
VALUES (2, 1, 'CATOS PLATFORM, CATERPILLAR', 'In this project, under the guidance of my project architect and team leader, I created multiple spring-boot microservices completely from scratch to production ready.');

INSERT INTO skill (skill_id, skill, id)
VALUES (1,'java', 1);

INSERT INTO skill (skill_id, skill, id)
VALUES (2,'spring-boot', 1);

INSERT INTO skill (skill_id, skill, id)
VALUES (3,'SQL Server', 1);

INSERT INTO skill (skill_id, skill, id)
VALUES (4,' SQL', 1);

INSERT INTO skill (skill_id, skill, id)
VALUES (5,'DSA', 1);

INSERT INTO skill (skill_id, skill, id)
VALUES (6,'Team Work', 1);

INSERT INTO skill (skill_id, skill, id)
VALUES (7,'JPA', 1);

INSERT INTO skill (skill_id, skill, id)
VALUES (8,'Hibernate', 1);

INSERT INTO skill (skill_id, skill, id)
VALUES (9,'Git', 1);

INSERT INTO skill (skill_id, skill, id)
VALUES (10,'Docker', 1);

INSERT INTO skill (skill_id, skill, id)
VALUES (11,'AWS', 1);

INSERT INTO skill (skill_id, skill, id)
VALUES (13,'Design Patterns', 1);

INSERT INTO achievement (achievement_id, achievement, id)
VALUES (1, 'Got recognized as one of the employee in my team who performed exceptionally well for continuous releases.', 1);

INSERT INTO achievement (achievement_id, achievement, id)
VALUES (2, 'GeeksforGeeks 500+ coding score.', 1);

INSERT INTO achievement (achievement_id, achievement, id)
VALUES (3, 'LeetCode 400+ coding score solved.', 1);

INSERT INTO achievement (achievement_id, achievement, id)
VALUES (4, 'Qualified Google Code Jam 2022 Qualifier round with 54 points.', 1);