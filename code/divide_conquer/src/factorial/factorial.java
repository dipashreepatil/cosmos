import java.util.*;

public class Main{
public static void main(String args[])
{
//to read input from stdin using buffered reader
BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
int n=Integer.parseInt(br.read());
//to read input from stdin using scanner class
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int fact=1;
while(n>=1)
{
fact=fact*n;
n--;
}
System.out.println("\n\t Factorial of number "+n+"is"+fact);



}
}
