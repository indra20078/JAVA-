import time

inp = input("Do you want the password to be strong,little weak or weak(S/lw/W): ")

spass = ["9MBmns4/H[*8^`c3 , !HYY@6%-5V7%jvby, ytm8-#zF&CGhxze3 , tUn=!paXRWS6x@tz"]

if inp == "S" or inp =="s":
    for num in spass:
        
        time.sleep(1)
        a = input("Do you want to Save the passwords to a text file(Y/n)(make sure that the .txt file is in the desktop path)Y/n: ")
        if a == "Y" or a == "y":
            time.sleep(1)
            print("The file will be store d as the exact path you are and it will be named as'writed.txt'")

            b = open( "writed.txt", "w"  )
            b.write(num +"\n")
        b.close()

        break

vpass = ["9MBmns4/H[*8^`c3 , !HYY@6%-5V7%jvby, ytm8-#zF&CGhxze3 , tUn=!paXRWS6x@tz"]

if inp == "S" or inp =="s":
    for mum in vpass:
        
        time.sleep(1)
        a = input("Do you want to Save the passwords to a text file(Y/n)(make sure that the .txt file is in the desktop path)Y/n: ")
        if inp == "lw" or a == "LW":
            time.sleep(1)
            print("The file will be store d as the exact path you are and it will be named as'writed.txt'")
             
            b1 = open( "writed.txt", "w"  )
            b1.write(mum + "\n")
        b1.close()

        break
