#program to reverse a string in Python

str = input()
rev = ""

#finding the string length
num1 = len(str);
j = num1 - 1

#
for i in range(0, num1):
   rev = rev + str[j]
   j = j - 1
print(rev)
