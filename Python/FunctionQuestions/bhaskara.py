import math

def bhaskara(a,b,c):
    raiz1 = (-b+math.sqrt(b**2-4*a*c))/2*a
    raiz2 = (-b-math.sqrt(b**2-4*a*c))/2*a
    return raiz1,raiz2

r1,r2 = bhaskara(1,-4,-5)
print(r1,r2)