package lambdas;
public interface Calculo{
//public abstract
Double executar(double a , double b);

default String legal(){
return "legal";
}

static String muitoLegal(){
return "muito Legal";


}
}
