package generics;

import java.util.List;

public class ListaUtil {

	public static Object getUtimo1(List<?>lista) {
		return lista.get(lista.size()-1);
	}
		public static <T>T  getUtimo2(List<T>lista) {
			return lista.get(lista.size()-1);
			
	}
	
	
	
}
