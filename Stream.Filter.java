package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;



public class Filter {
	
	public static void main(String[] args){



Aluno a1 = new Aluno("allyson",10.0,true);
Aluno a2 = new Aluno("karol", 9.0, true);
Aluno a3= new Aluno("bella", 10.0, false  );
Aluno a4 = new Aluno("Ayo", 2.0 ,true );
Aluno a5 = new Aluno("Mae", 8.7 , false);
Aluno a6 = new Aluno("Pai",7.5 , true );

List<Aluno>alunos =Arrays.asList(a1,a2,a3,a4,a5,a6);
Predicate<Aluno>aprovado = a ->a.nota >=7;
Function<Aluno, String> saudacaoAprovado =
a -> "Parabens " + a.nome + "! Você foi aprovado(a)!";

alunos.stream().filter(aprovado).map(saudacaoAprovado)
.forEach(System.out::println);
}

}
