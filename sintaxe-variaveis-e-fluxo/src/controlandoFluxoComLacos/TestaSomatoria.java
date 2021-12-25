package controlandoFluxoComLacos;

public class TestaSomatoria {

    public static void main(String[] args) {

        int total = 0;
        int contador = 0;

        while (contador <= 10) {
            total = total + contador;
            //0 = 0 + 1
            //1 = 1 + 2
            //3 = 3 + 3
            //6...
            contador++;//É o mesmo que contador = contador + 1;
            //System.out.println("contador: "+contador);
            System.out.println("Total: "+total);
        }
        System.out.println("Total: "+total);
    }


}
