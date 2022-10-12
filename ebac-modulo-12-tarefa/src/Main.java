import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        String ler;
        String[] nomes;
        List<String> listaMasculino = new ArrayList<>();
        List<String> listaFeminino = new ArrayList<>();
        Map<String, List<String>> mapa = new TreeMap<>();
        String[] nomesSexo;

        System.out.println("Digite os nomes separados por virgula:");
        ler = scan.next();
        nomes = BubbleSort(ler.split(","));

        for(String i : nomes){
            System.out.println(i);
        }

        System.out.println("Digite os nomes-sexo separados por virgula:");
        ler = scan.next();
        nomesSexo = ler.split(",");

        for(int i = 0; i < nomesSexo.length; i++){
            String[] temp = nomesSexo[i].split("-");
            if(temp[1].equals("m")){
                listaMasculino.add(temp[0]);
                mapa.put(temp[1],listaMasculino);
            }
            else if (temp[1].equals("f")){
                listaFeminino.add(temp[0]);
                mapa.put(temp[1],listaFeminino);
            }
        }

        System.out.println(mapa);
    }
    private static String[] BubbleSort(String[] nomes) {

        for(int i = 0; i < nomes.length; i++){
            for(int j = 0; j < nomes.length - i - 1; j++){
                int cmp = nomes[j].compareTo(nomes[j + 1]);
                if(cmp > 0) { //nomes[i] > nomes[j + 1]
                    String aux = nomes[j];
                    nomes[j] = nomes[j + 1];
                    nomes[j + 1] = aux;
                }
            }
        }

        return nomes;
    }

}