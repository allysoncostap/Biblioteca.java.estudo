package lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {

	public static void main(String[] args) {
		
		
	
		Function<Produto,Double> procomdesc= produto -> produto.preco *(1- produto.desconto);
		UnaryOperator<Double> impMun= preco -> preco >=2500? preco *0.915:preco;
		UnaryOperator<Double> frete= preco -> preco >=3000? preco + 100:preco+50;
		UnaryOperator<Double>casaDescimal = numb -> Double.parseDouble(String.format("%.2f",numb)); 
		
		Produto p = new Produto("IPad",2499, 100 );
		
		System.out.println(p.preco + "Preço");
		System.out.println(procomdesc.apply(p));
		System.out.println(impMun.apply(p.preco));
		System.out.println(casaDescimal.apply(p.preco));
		System.out.println(frete.apply(p.preco));
	}
}
