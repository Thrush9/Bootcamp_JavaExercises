package daytwo;

class TwoDAreas {

	double result;

	public double area(double side) {
		result = side * side;
		System.out.println(" Square Area is " + result);
		return result;
	}

	public double area(double length, double height) {
		result = length * height;
		System.out.println(" Rectangle Area is " + result);
		return result;
	}

}

class ThreeDAreas extends TwoDAreas {

	double result;
	
	/*
	 * public double area(double side) { result = 6*side * side;
	 * System.out.println(" 3D Square Area is " + result); return result; }
	 * 
	 * public double area(double length,double breadth, double height) { result =
	 * 2*(length * height + breadth * height + length * breadth);
	 * System.out.println(" 3D Rectangle Area is " + result); return result; }
	 */

	public double volume(double side) {
		result = side * side * side;
		System.out.println(" Cube Volume is " + result);
		return result;
	}

	public double volume(double length, double breadth, double height) {
		result = length * breadth * height;
		System.out.println(" Cuboid Volume is " + result);
		return result;
	}

}

public class GeometricAreas {
	
	public static void main(String[] args) {

		TwoDAreas obj1 = new TwoDAreas();
		obj1.area(4);
		obj1.area(4,5);
		
		ThreeDAreas obj2 = new ThreeDAreas();
		obj2.area(4);
		obj2.area(4,5);
		obj2.volume(4);
		obj2.volume(4, 5, 6);

	}
}