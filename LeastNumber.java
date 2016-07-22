# LeastNumber
import java.util.Arrays;
import java.util.Scanner;

public class LeastNumber{

public static void main(String[] args) {
	System.out.println("Enter the Combination Number");
	Scanner sr=new Scanner(System.in);
int a=sr.nextInt();
String str=""+a;
String str1="";
int b[]=new int[str.length()];
int c=0;
int i=0;
while(a>0)
{
c=a%10;
b[i]=c;
i++;
a=a/10;
}
Arrays.sort(b);
for(int j=0;j<=1;j++)
{
str1=""+b[0]+b[1];
}
System.out.println("Least Combination:"+str1);
}
}
