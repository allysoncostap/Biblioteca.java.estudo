package lambdas;

public class CalculoTestes1 {
	public static void main(String[] arg){
		Calculo calculo = new Soma();
		System.out.println(calculo.executar(2,3));

		calculo = new Multiplicar();
		System.out.println(calculo.executar(2,3));




		}
}
