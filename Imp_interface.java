package ex;

public class Imp_interface implements  B {

     public void eat(){
    	 System.out.println("I am eating");
     }
     public void sleep(){
    	 System.out.println("I was sleeping ");
     }
     public static void main(String[] args){
    	 Imp_interface I = new Imp_interface();
    	 I.eat();
    	 I.sleep();
     }
}