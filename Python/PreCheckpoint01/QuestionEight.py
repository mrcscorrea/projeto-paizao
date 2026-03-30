from numexpr.necompiler import double
salary = double(input("Digite o seu salário e pressione ENTER: "))

free_impost = 2200
with_impost_min = 2200.01
with_impost_max = 3102.99
impost = 0
salary_total = salary * impost

if salary <= free_impost:
    print(f"Seu salário {salary:.2f} está livre de impostos! Agradeça enquanto ainda pode.")
elif with_impost_min <= salary < with_impost_max:
    impost = 0.075
    salary_total = salary * (1 - impost)
    print(f"Seu salário {salary:.2f} tomou impostos de {impost * 100}%, logo o seu salário ficou em {salary_total:.2f}.")
elif with_impost_max <= salary:
    impost = 0.1
    salary_total = salary * (1 - impost)
    print(f"Seu salário {salary} tomou impostos de {impost * 100}%, logo o seu salário ficou em {salary_total:.2f}.")
