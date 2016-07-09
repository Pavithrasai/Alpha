import java.io.*;
import java.util.*;
import java.lang.*;
public class Number
{
public static void main(String[]args)
{
char ch
System.out.println("Enter the input");
Scanner sc=new Scanner(System.in);
ch=sc.nextChar();
if(((ch>='a')&&(ch<='z'))||((ch>='A')&&(ch=='A')))
{
System.out.println("Given input is Alphabet");
}
else
{
System.out.println("Given input is not an Alphabet");
}
}
}
