class Student
{
	public static String Process(int marks, int age)
	{
		if(marks>70) return "A grade";
		else if (marks>60 && age<15) return "A grade";
		else if (marks>60) return "B grade";
		else if (marks>44 && age<15) return "B grade";
		else if (marks<61) return "C grade";
		else if (marks<45 && age<15) return "C grade";
		return null;
	}

	public static void main(String[] args)
	{
		System.out.print("Enter Student marks :");
		int marks = Integer.parseInt(System.console().readLine());
		System.out.print("Enter Student Age :");
		int age = Integer.parseInt(System.console().readLine());
		System.out.println(Process(marks,age));
	}

}

