public class OperadoresRelacionais {
    public static void main(String[] args) {
        String nomeUm = "Alexandre";
        String nomeDois = new String("Alexandre");

        System.out.println(nomeUm.equals(nomeDois));

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        if(numero1 < numero2){ //true
            System.out.println("A nossa condição é verdadeira");
        }

        System.out.println("NumeroUm é igual ao NumeroDois? " + simNao);
        
        simNao = numero1 != numero2;

        System.out.println("NumeroUm é diferente de NumeroDois? " + simNao);

        simNao = numero1 > numero2;

        System.out.println("NumeroUm é maior que NumeroDois? " + simNao);

    }
}
