

--Hãy tìm tất cả những nam giới tuổi dưới 45
SELECT p.name, p.age FROM 
(SELECT name, DATE_FORMAT(FROM_DAYS(DATEDIFF(now(),birthdate)), '%Y')+0 AS age 
FROM person where gender = 'Male') AS p WHERE p.age < 45  ORDER BY p.age DESC

--Hãy tìm tất cả những nữ giới làm nghề lái xe 'driver'
SELECT p.name, p.gender, p.job FROM person p WHERE p.gender = 'Female' and p.job='driver'
ORDER BY p.name

--Tính tỷ lệ nam/nữ lập trình viên trong tất cả tập dữ liệu
Select  (Select count(*) FROM person p 
WHERE p.job ='developer' and p.gender ='Male') as male, 
(Select count(*) FROM person p1 
WHERE p1.job ='developer' and p1.gender ='Female') as female
,Round((Select count(*) FROM person p 
WHERE p.job ='developer' and p.gender ='Male')/(Select count(*) FROM person p1 
WHERE p1.job ='developer' and p1.gender ='Female')*100 , -2) as tyle
FROM person
LIMIT 1
 

--Hãy tìm 5 thành phố có số lượng nữ lớn nhất
SELECT p.city, count(*) FROM person p
WHERE p.gender ='Female'
GROUP BY city
ORDER BY count(*) DESC 
LIMIT 5;