package week3.day1.org.system;

public class Desktop extends Computer {

	public void desktopSize() {

		System.out.println("My computer size is 15.60-inch display");
	}

	public static void main(String[] args) {

		Desktop obj = new Desktop();
		obj.computerModel();
		obj.desktopSize();
	}

}
