package week1.day1;

public class myCar {

	public static void main(String[] args) {
		Car obj=new Car();
		obj.printCarName();
		String color = obj.getColor();
		System.out.println(color);		
		
		System.out.println(obj.isCarPuncture());
		
		int addvalue = obj.addTwoNumbers(10,10);
		System.out.println(addvalue);
		
		int subvalue = obj.subtractTwoNumbers(20, 10);
		System.out.println(subvalue);
		
		int multvalue = obj.mutiplyTwoNumbers(20, 10);
		System.out.println(multvalue);
		
		int divvalue = obj.divisionTwoNumber(20, 10);
		System.out.println(divvalue);

	}

}
