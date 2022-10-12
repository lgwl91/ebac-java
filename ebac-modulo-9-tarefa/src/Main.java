public class Main {
    public static void main(String[] args) {


        long valorLong = 999999999999999999l;
        int valorInt = (int) valorLong;

        System.out.println("O valor " + valorInt + " é diferente do valor " + valorLong + ".");

        Integer wrpInt = valorInt;

        System.out.println("Valor Wrapper: " + wrpInt + ".");
    }
}