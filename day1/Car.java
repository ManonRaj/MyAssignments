package week1.day1;

public class Car {

	public void printCarName() 
	{
		System.out.println("I have Maruti swift car");
	}

	public int getRegNumber() 
	{
		int regNmber = 3333;
		return regNmber;
	}
	public String getColor()
	{
		String carcolor = "Blue";
		return carcolor;

	}
	public boolean isCarPuncture()
	{
		//boolean carPuncture = true;
		return true;
	}

	public int addTwoNumbers(int n1, int n2)
	{
		int sum = n1+n2;
		return sum;
	}
	public int subtractTwoNumbers(int sub1, int sub2)
	{
		int subtractValue = sub1 - sub2;
		return subtractValue;
	}
	public int mutiplyTwoNumbers(int mul1, int mul2)
	{
		int multiplyValue = mul1*mul2;
		return multiplyValue;
	}
	public int divisionTwoNumber(int div1, int div2)
	{
		int divisionValue = div1/div2;
		return divisionValue;
	}

	public static void main(String[] args) {

		Car myobj=new Car();
		myobj.printCarName();
		myobj.getRegNumber();
		String color = myobj.getColor();
		System.out.println(color);		

		System.out.println(myobj.isCarPuncture());

		int addvalue = myobj.addTwoNumbers(10,10);
		System.out.println(addvalue);

		int subvalue = myobj.subtractTwoNumbers(20, 10);
		System.out.println(subvalue);

		int multvalue = myobj.mutiplyTwoNumbers(20, 10);
		System.out.println(multvalue);

		int divvalue = myobj.divisionTwoNumber(20, 10);
		System.out.println(divvalue);


	}

}
