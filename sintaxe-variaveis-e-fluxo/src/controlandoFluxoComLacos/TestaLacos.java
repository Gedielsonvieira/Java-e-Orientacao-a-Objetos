package controlandoFluxoComLacos;

public class TestaLacos {
    public static void main(String[] args){
        for(int multiplicador = 1; multiplicador <= 10; multiplicador++){
            System.out.print("Tabuada do número " + multiplicador + ": ");
            for(int numero = 1; numero <= 10; numero++){
                System.out.print( multiplicador + " x " + numero + " = " + multiplicador * numero);
                System.out.print(" ");
                
            }
            System.out.println();
        }
    }
}
