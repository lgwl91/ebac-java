package exemploLucas;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class PessoaReflectionExemplo {

	public static void main(String[] args) throws IllegalArgumentException{
		try {	
			Pessoa p = new Pessoa("Lucas Lima",31);
			
			System.out.println(p);
			System.out.println("");
			p.apresentarPessoa();
			System.out.println("");
			
			Class obj = p.getClass();
			
			System.out.println("### Construtores ###");
			Constructor[] con = obj.getDeclaredConstructors();
			for(Constructor c : con) {
				System.out.println("Nome do construtor: " + c.getName());
				int modifier = c.getModifiers();
				String mod = Modifier.toString(modifier);
				System.out.println("Modificadores: " + mod);
				System.out.println("Parâmetros: " + c.getParameterCount());
				System.out.println("");
			}
			
			System.out.println("### Métodos ###");
			Method[] met = obj.getDeclaredMethods();
			for(Method m : met) {
				System.out.println("Nome do método: " + m.getName());
				int modifier = m.getModifiers();
				String mod = Modifier.toString(modifier);
				System.out.println("Modificadores: " + mod);
				System.out.println("Tipo de retorno: " + m.getReturnType());
				System.out.println("");
			}
			
			try {
				System.out.println("### Campos ###");
				Field[] fie = obj.getDeclaredFields();
				for(Field f : fie) {
					System.out.println("Nome do campo: " + f.getName());
					int modifier = f.getModifiers();
					String mod = Modifier.toString(modifier);
					System.out.println("Modificadores: " + mod);
					f.setAccessible(true);
					System.out.println("Valores: " + f.get(obj));
					f.setAccessible(false);
					System.out.println("");
				}
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			
			System.out.println("### Pacotes ###");
			String pac = obj.getPackageName();
			System.out.println(pac);
			System.out.println("");
			
			System.out.println("### Super Classe ###");
			String sup = obj.getSuperclass().getName();
			System.out.println(sup);
			System.out.println("");
			
			System.out.println("### Anotações ###");
			Annotation[] ann = obj.getAnnotations();
			for(Annotation a : ann) {
				System.out.println("Tipo Anotação: " + a.annotationType());
			}
			Field[] fie = obj.getDeclaredFields();
			for(Field f : fie) {
				if(f.isAnnotationPresent(AnnotationTeste.class)) {
					AnnotationTeste at = f.getAnnotation(AnnotationTeste.class);
					System.out.println("Nome da Anotação: " + at.toString());
					System.out.println("Valor da Anotação: " + at.value());
				}
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
