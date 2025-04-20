package shape;

public class Cylinder extends Shape{
	
	int r,H;
	
	public Cylinder() {}
	public Cylinder(int r, int H) {
		this.r = r;
		this.H = H;
	}
	public double surfaceArea() {
		return ((2 * r * Math.PI)*2) + ((2 * Math.PI)*H);
		
	}
	public double volume() {
		return (2 * r * Math.PI)*H;
	}
	@Override
	public double circum() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 0;
	}
}
