package exemploSaulo;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Reflexao {

	public static void refletirObjeto(Object obj, Class cla) throws IllegalAccessException{
		
		System.out.println("===========================");
		System.out.println("Nome da Classe: " + cla.getName());
		System.out.println("Nome Simples da Classe: " + cla.getSimpleName());
		System.out.println("Tipo: " + cla.getTypeName());
		System.out.println("===========================");
		Field[] fie = cla.getDeclaredFields();
		for(Field f : fie) {
			f.setAccessible(true);
			System.out.println(f.getName() + ": " + f.getType().getTypeName() + 
					" (primitivo = " + f.getType().isPrimitive() + ")" + " valor => " + f.get(obj));
			f.setAccessible(false);
		}
		System.out.println("===========================");
		Field[] fie2 = cla.getDeclaredFields();
		for(Field f : fie2) {
			f.setAccessible(true);
			if (f.getType().isPrimitive() == true) {
				f.set(obj, 0);
			}
			else {
				f.set(obj, null);
			}
			System.out.println(f.getName() + ": " + f.getType().getTypeName() + 
					" (primitivo = " + f.getType().isPrimitive() + ")" + " valor => " + f.get(obj));
			f.setAccessible(false);
		}
		System.out.println("===========================");
		Method[] met = cla.getDeclaredMethods();
		for(Method m : met) {
			System.out.println(m.getName() + ": parametros (" + Arrays.toString(m.getParameterTypes()) +
					") retorno = (" + m.getReturnType().getSimpleName() + ")");
		}
	}
}
