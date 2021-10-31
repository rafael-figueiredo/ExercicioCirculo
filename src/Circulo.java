import java.text.DecimalFormat;
import java.util.Scanner;

public class Circulo {
	public int d, r;
	public double c, a;
	Scanner sc = new Scanner(System.in);
	
	public void calcularRaioComprimento() {
		System.out.println("Informe o valor do di�metro do Circulo: ");
		d = sc.nextInt();
		System.out.println("");
		
		r = d/2;
		
		System.out.println("O valor do raio � de " + r + " CM/M/KM");
		System.out.println("");
		
		c = (2 * 3.14) * (r);
		
		DecimalFormat df = new DecimalFormat("##0.00");
		
		System.out.println("O comprimento do circulo � de " + df.format(c) + " CM/M/KM");
		System.out.println("");
		
		a = 3.14 * (Math.pow(r, 2));
		
		DecimalFormat df2 = new DecimalFormat("##0.00");
		
		System.out.println("A �rea do circulo � de " + df2.format(a) + " CM/M/KM�");
		System.out.println("");
	}
}
