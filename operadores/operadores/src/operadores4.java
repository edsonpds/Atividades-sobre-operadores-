public class operadores4 {
    public static void main(String[] args) {
        
        String nomeUm = "Edson";
        //String nomeDois = "Edson"; 
        
        String nomeDois = new String("Edson");
        
        //System.out.println(nomeUm == nomeDois);

        System.out.println(nomeUm.equals(nomeDois));

        
        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2; 

        if (numero1==numero2){
            System.out.println("a nossa condição é verdadeira");
        }

        System.out.println("numeroUm é igual ao numeroDois? " + simNao);

        simNao = numero1 != numero2;

        System.out.println("numeroUm é diferente a numeroDois? " + simNao);

        simNao = numero1 > numero2; 

        System.out.println("numeroUm é maior que o numeroDois? " +simNao);
    }
}
