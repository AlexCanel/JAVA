package entities;

public class Student {
	
	public String name;
	public Double nota1;
	public Double nota2;
	public Double nota3;
	
	public double notaFinal() {
		return nota1 + nota2 + nota3;
	}
	
	public String resultado() {
		
		String result;
		
		if(notaFinal()> 60) {
			result = "Pass";
		}else {
			double notaFaltando = 60 - notaFinal(); 
			result = String.format("Failed\nMissing %.2f Points", notaFaltando);
		}
	
		return result;
	
	}
	
	public String toString() {
		return "Final Grade = "
			+	String.format("%.2f%n", notaFinal())
			+	resultado();
	}
	
	
}
