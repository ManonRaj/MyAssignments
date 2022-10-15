package week1.Assignments;

public class TwoWheeler {

	int noOfWheels = 2;
	short noOfMirrors = 1998;
	long chassisNumber = 876524536;
	boolean isPunctured = true;
	String bikeName = "BMW";
	double runningKM = 20000;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoWheeler obj = new TwoWheeler();
		System.out.println("Wheels :  "+ obj.noOfWheels);
		System.out.println("Mirrors : " + obj.noOfMirrors);
		System.out.println("ChassisNumber : " + obj.chassisNumber);
		System.out.println("IsPunctured : " + obj.isPunctured);
		System.out.println("Bike Name : " + obj.bikeName);
		System.out.println("Running KiloMeter : " + obj.runningKM);

	}

}
