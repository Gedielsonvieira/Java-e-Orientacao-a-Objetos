package exercitando;

public class MultiploDe3 {
    public static void main(String[] args) {
        System.out.println("Números Multiplos de 3: ");
        for (int numero = 1; numero < 101; numero++){
            if (numero % 3 == 0){
                System.out.print(numero + " ");
            }
        }
    }
}
