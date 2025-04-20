package shape;

public class Main {
	
		public static void main(String[] args) {
			Shape circle = new Circle(3);
//			System.out.println(circle.area());  //넓이
//			System.out.println(circle.circum());  //둘레
			
			Shape rect = new Rect(4,5);
//			System.out.println(rect.area());
//			System.out.println(rect.circum());
			
			Shape trian = new Trian(3,4,5,6);
			
			
			
			Shape[] shapes = {circle, rect, trian};
			
			for(int i = 0; i < shapes.length; i++) {
				System.out.println("==============="+ shapes[i].getClass().getSimpleName() + "=============");
				System.out.println(shapes[i].area());
				System.out.println(shapes[i].circum());
				
			}
			
			Shape cylinder= new Cylinder(3,4);
			
			Shape hexahedron = new Hexahedron(3,4,5,6);
			
			Shape prism = new Prism(3,4,5);
			
			Shape[] shapes2 = {cylinder, hexahedron, prism};
			
			for(int i = 0; i <shapes2.length; i++) {
				System.out.println("==============" + shapes2[i].getClass().getSimpleName() + "=============");
				System.out.println(shapes2[i].surfaceArea());
				System.out.println(shapes2[i].volume());
			}
		}
	}


