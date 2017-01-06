class TestDemo
{
public static String Process(int a)
{
if(a==0) return "You have Entered Zero";
else if (a>0) return "You have Entered Positive Value";
else if (a<0) return "You have Entered Negative Value";
return null;
}

public static void main(String[] args)
{
System.out.print("Enter a Number :");
int x = Integer.parseInt(System.console().readLine());
System.out.println(Process(x));
}

}