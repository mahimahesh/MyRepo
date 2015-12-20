package pack;

public class Demo
{
	public static void main(String args[])
	{
		String s1=new String("taj");
		String s2=new String("mahal");
		s1.concat(s2);
	System.out.println(s1);
	StringBuffer sb1=new StringBuffer("taj");
	StringBuffer sb2=new StringBuffer("mahal");
	sb1.append(sb2);
	System.out.println(sb1);
	}
	

}
