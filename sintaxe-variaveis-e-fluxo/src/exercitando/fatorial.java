package exercitando;

public class fatorial {
    public static void main(String[] args) {
        int armazenaValor = 1;
        for (int fatorial = 1; fatorial <= 10; fatorial++) {
            System.out.print(fatorial+ "!: ");

            armazenaValor = 1;
            for (int numero = 1; numero <= 10; numero++) {
                if (numero <= fatorial){
                    armazenaValor *= numero;
                }
            }
            System.out.println(armazenaValor);
       }
    }
}
