-- 코드를 입력하세요
SELECT *
FROM CAR_RENTAL_COMPANY_CAR 
WHERE INSTR(OPTIONS, '네비게이션') <> 0
ORDER BY CAR_ID DESC;