package studio7;

public class Rectangle {

		private double length;
		private double width;
	
	public Rectangle (double length, double width) {
		
	this.length = length; //this tells the computer that the values are length & width
	this.width = width;
	
	
	} 
	 public double area() { //methods lower case
		 double area = (length * width);
		 return area;	 
	 }
	 
	 
	 public boolean size(Rectangle OtherR) {
		 if (this.area() > OtherR.area()) { //this is telling you that you're on R1 so you have to call R2's information  
			 return false;
		 } else {
			 
			 return true;
		 }
	 } 
	 
	 
	public boolean square() { 
		if (length == width) {
			return true;
		} else {
			return false;
			
		}
		
			
			
		}
	 
	 
	 public double perimeter() {
		 double perimeter = (2 * (length + width));
		 return perimeter; 
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rectangle R1 = new Rectangle(20.0, 20.0);
		Rectangle OtherR = new Rectangle(2.0, 8.0);
		
		R1.area(); //acessing ur information for R1
		R1.perimeter();
		
		OtherR.area();
		OtherR.perimeter();
		
		System.out.println(R1.area());
		System.out.println(R1.perimeter());
		
		System.out.println(OtherR.area());
		System.out.println(OtherR.perimeter());
		
		System.out.println("Is R1 smaller than R2: " + R1.size(OtherR));
		System.out.println("Is R1 a square? " + R1.square());
		
		
		
		
	}

}
