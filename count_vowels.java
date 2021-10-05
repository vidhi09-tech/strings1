import java.util.*;
public class count_vowels 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string->\n");
		String s=sc.nextLine();
		s=s.toLowerCase();
		Stack<String> myStack = new Stack<>();
		StringTokenizer st = new StringTokenizer(s);
		while (st.hasMoreTokens()) 
		{
			myStack.push(st.nextToken());
		}
		String s1 = null;
		while (!myStack.empty()) 
		{
			s1=myStack.pop();
			System.out.print(s1);
		}
		char ch;
		int c=0;
		int l=s1.length();
		for(int i=0;i<l;i++)
		{
			ch=s1.charAt(i);
			if(ch=='a'|| ch=='e' || ch=='i' || ch=='o'|| ch=='u')
				{
				 c++;
				}
			ch=0;
		}
		System.out.print("The numbr of vowels are "+c);
	}

}
