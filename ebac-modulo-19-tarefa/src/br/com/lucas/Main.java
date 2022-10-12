package br.com.lucas;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Goleiro g = new Goleiro("Lucas",39,8);

		System.out.println(g.toString());
		System.out.println("");
		
		System.out.println("CAMPOS:");
		Class cla = g.getClass();
		Field[] fie = cla.getDeclaredFields();
		for(Field f : fie) {
			System.out.println(f.getName());
		}
		System.out.println("");
		
		System.out.println("ANOTAÇÕES:");
		for(Field f : fie) {
			if(f.isAnnotationPresent(Tabela.class)) {
				Tabela at = f.getAnnotation(Tabela.class);
				System.out.println(at.toString());
				String nomeMetodo = at.value();
				Method met = cla.getMethod(nomeMetodo);
				met.invoke(g);
			}
		}
		
	}

}
