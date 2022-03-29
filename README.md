# Calculadora Volume/Circunferencia

### Calculadora de volume e circunferencia de um circulo com base no valor de raio escolhido pelo usuário.

### Método Principal:


	
	public class Calculadora_71 {
		public static void Calc() {
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);

			System.out.println("Digite o raio:");

			double raio = sc.nextDouble();

			double c = Calc.circunferencia(raio);

			double v = Calc.volume(raio);

			System.out.println("Circunferencia: " + c);
			System.out.println("Volume: " + v);
			System.out.println("PI: " + Calc.PI);

			sc.close();
		}	
	}

