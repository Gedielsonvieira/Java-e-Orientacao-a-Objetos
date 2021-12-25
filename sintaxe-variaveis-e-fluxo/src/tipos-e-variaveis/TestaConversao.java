// Rever aula e fazer anotações 07 Conversões e outros tipos

public class TestaConversao {
    public static void main(String[] args){
        //double salario = 1270.05;
        //System.out.println("Olá mundo");

        /*int
        float a = 10.0f;
        double b = 10.0;
        short
        long*/


        
        // De double para:...
        System.out.println("Conversões Explicitas");
        double numeroTipoDouble = 1285.50;

        byte numeroEmByte = (byte) numeroTipoDouble; 
        System.out.println("De double (1285.50) para byte = " + numeroEmByte);

        short valorPequeno = (short)numeroTipoDouble;
        System.out.println("De double (1285.50) para short = " + valorPequeno);

        char caracterTipoChar = (char)numeroTipoDouble;
        System.out.println("De double (1285.50) para char = " + caracterTipoChar);

        int numeroTipoInteiro = (char)numeroTipoDouble;
        System.out.println("De double (1285.50) para int = " + numeroTipoInteiro);

        long numeroTipoLong = (long) numeroTipoDouble;
        System.out.println("De double (1285.50) para long = " + numeroTipoLong);

        float numeroTipoFloat = (float) numeroTipoDouble;
        System.out.println("De double (1285.50) para float = " + numeroTipoFloat);


        // De char para:...
        System.out.println();
        System.out.println("Conversões implicitas - ou seja, não precisa colocar o casting");
        //O casting faz a conversão quando ela não é possível de forma automática
        char letra = 'B'; //'' para representar char e "" para representar string
        int numeroInteiro = letra;
        System.out.println("De char (B) para inteiro = " + numeroInteiro);
    }    
}