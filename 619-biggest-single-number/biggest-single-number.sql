SELECT MAX(num) AS num
FROM ( select num from MyNumbers
GROUP BY num
HAVING COUNT(num) = 1) as uniquenumbers