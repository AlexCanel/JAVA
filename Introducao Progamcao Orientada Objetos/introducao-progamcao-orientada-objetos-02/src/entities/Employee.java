package entities;

public class Employee {
	
	public String name;
	public Double groosSalary;
	public Double tax;
	
	public double netSalary() {
		return groosSalary - tax;
	}
	
	public double increaseSalary(double percentage) {
		return this.groosSalary += (percentage/100) * groosSalary;
	}
	
	public String toString() {
		return name
			+ 	", $ "
			+	String.format("%.2f", netSalary());
	}
}
