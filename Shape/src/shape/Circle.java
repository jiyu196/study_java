package shape;

public class Circle extends Shape{
	
		int r;
		public Circle() {}
		public Circle(int r) {
			this.r = r;
		}
		public double circum() {
			return 2 * r * Math.PI;
		}
		public double area() {
			return 2 * r * Math.PI;
		}
		@Override
		public double surfaceArea() {
			// TODO Auto-generated method stub
			return 0;
		}
		@Override
		public double volume() {
			// TODO Auto-generated method stub
			return 0;
		}
	}

