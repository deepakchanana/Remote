package Java_Pkg;

public class Loading extends l {
	Loading()
	{
		super("Base");
		System.out.println("without para in child class");
	}
	
	Loading(String g)
	{
		super("Parent");
		System.out.println(g + " in child class");
	}
	public static void main(String[] args) {

		Loading f=new Loading("Child Class");
	}

}

class l
{
	l()
	{
		System.out.println("without para in base class");
	}
	l(String s)
	{
		System.out.println(s + "in base class");
	}
}