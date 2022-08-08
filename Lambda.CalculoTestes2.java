package lambdas;

public class CalculoTestes2 {

public static void main(String[] arg){
Calculo calc = (x,y) -> {
return x + y ;
};
System.out.println( calc.executar(2,3));
 calc = (x,y) -> x*y;
 System.out.println( calc.executar(2,3));

 System.out.println(calc.legal());
 System.out.println(Calculo.muitoLegal());
 
 }
}
