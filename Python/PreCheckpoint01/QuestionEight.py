from numexpr.necompiler import double

salary = double(input("Digite o seu salário e pressione ENTER: "))

freeImpost = 2200
withImpostMin = 2200.01
withImpostMax = 3102.99
impost = 0
salaryTotal = salary * impost

if salary <= freeImpost:
    print(f"Seu salário {salary:.2f} está livre de impostos! Agradeça enquanto ainda pode.")
elif withImpostMin <= salary < withImpostMax:
    impost = 0.075
    salaryTotal = salary * (1 - impost)
    print(f"Seu salário {salary:.2f} tomou impostos de {impost * 100}%, logo o seu salário ficou em {salaryTotal:.2f}.")
elif withImpostMax <= salary:
    impost = 0.1
    salaryTotal = salary * (1 - impost)
    print(f"Seu salário {salary} tomou impostos de {impost * 100}%, logo o seu salário ficou em {salaryTotal:.2f}.")
