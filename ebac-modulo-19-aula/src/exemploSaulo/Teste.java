package exemploSaulo;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Teste {

	public static void main(String[] args) {
		Aluno a = new Aluno();

		a.adicionarNota(3.5);
		a.adicionarNota(9.5);
		a.adicionarNota(7.3);
		a.adicionarNota(8.4);
		
		a.setMatricula(123456);
		a.setNome("Lucas Gonçalves Westphal Lima");
		
		System.out.println(a.toString());
		
		System.out.printf("Média: %.2f", a.calcularMedia());
		System.out.println(""); 
		
		try{
			/* Objeto já instanciado */
			Reflexao.refletirObjeto(a, a.getClass());
			
			/* Objeto não instanciado */
			Class<?> minhaClasse = Class.forName("exemploSaulo.Aluno");
			Object meuObjeto = minhaClasse.getConstructor().newInstance();
			Field f = meuObjeto.getClass().getDeclaredField("matricula");
			f.setAccessible(true);
			f.set(meuObjeto, 567890);
			Reflexao.refletirObjeto(meuObjeto, minhaClasse);
			
			Method m = meuObjeto.getClass().getDeclaredMethod("toString");
			System.out.println(m.invoke(meuObjeto));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
