import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
       
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        String nomeCliente;

        System.out.print("Por favor, digite o nome do cliente: ");
            nomeCliente = sc.nextLine();

        System.out.print("Por favor, digite o número da conta: ");
            int numero = sc.nextInt();

        System.out.print("Por favor, digite o número da agência: ");  
            String agencia = sc.next();
           
        System.out.print("Por favor, digite o saldo: ");
            float saldo = sc.nextFloat();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero +" e seu saldo R$" + saldo + " já está disponível para saque.");  

        sc.close();
    }    
}
