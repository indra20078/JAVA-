a = int(input("Enter a number: "))

if a == 1 or a == 3 or a== 5 or a== 7 :
    print("primenumber")
elif a == 9 or a== 8 or a ==4:
    print("composite")

else:
    for b in range(1, 9):
        if ((a % b)==0):
            print("composite")
        else:
            print("prime")




        