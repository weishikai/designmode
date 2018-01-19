package com.dewei.designmode;

public class Main {
	  public static String output = "";
	    public static void foo(int i)
	    {
	        try
	        {
	            if (i == 1)
	            {
	                throw new Exception();
	            }
	        }
	        catch (Exception e)
	        {
	            output += "2";
	            return ;
	        } finally
	        {
	            output += "3";
	        }
	        output += "4";
	    }
	public static void main(String[] args) {
		// 桥接模式
		/*Bridge bridge = new Bridge();
		SourceSub sourceSub1 = new SourceSub1(); 
		bridge.setSourceSub(sourceSub1);
		bridge.method();
		
		SourceSub sourceSub2 = new SourceSub2(); 
		bridge.setSourceSub(sourceSub2);
		bridge.method();
		*/
		/*int a[ ][ ]={{1,2},{3,4},{5,6}};
		System.out.println(a[1][1]);
		foo(0);
	    foo(1);
	    System.out.println(output);
	*/
	
		// 策略模式
//		Plus plus = new Plus();
//		Minus minus = new Minus();
//		Multipy multipy = new Multipy();
//		System.out.println(plus.calculator("100+100"));
//		System.out.println(minus.calculator("100-17"));
//		System.out.println(multipy.calculator("10*20"));
		// 模板模式
//		AbstractPeople student = new Student();
//		AbstractPeople teacher = new Teacher();
//		student.prepareToSchool();
//		teacher.prepareToSchool();
	}

}
