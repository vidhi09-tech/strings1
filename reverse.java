//program to reverse a string in Java

import java.util.Scanner;
public class Main
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
String str = sc.nextLine();
StringBuilder sb = new StringBuilder();

#Appending the characters in the reverse order
for(int i = str.length() - 1; i >= 0; i--)
{
sb.append(str.charAt(i));
}
System.out.println(sb.toString());
}
}
