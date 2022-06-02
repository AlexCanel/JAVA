package entities;

public class Rectangle {
	
	public Double width;
	public Double height;
	
	public double area () {
		return width * height;
	}
	public double perimeter() {
		return (width + width) + (height+ height);
	}
	public double diagonal() {
		return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
	}
	
	public String toString() {
		return "\nArea = "
			+	String.format("%.2f%n", area())
			+	"Perimeter = "
			+	String.format("%.2f%n", perimeter())
			+	"Diagonal = "
			+	String.format("%.2f", diagonal());
	}
}
