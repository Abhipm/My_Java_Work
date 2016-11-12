package ex;

    class Vehicle{
	String color;
	public int model;
	private int num;
	public void setnum(int num1){
		num = num1;
	}
	public int getnum(){
	return num;
	}
}


public class Inherit extends Vehicle{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

      Vehicle Ve = new Vehicle();
      Ve.color = "blue" ;
      Ve.model= 1990;
       System.out.println("The model is " + Ve.model);
       System.out.println("The color of the car is " +Ve.color );
       Ve.setnum(12);
       System.out.println("The num value is " + Ve.getnum());
      
    }

}
