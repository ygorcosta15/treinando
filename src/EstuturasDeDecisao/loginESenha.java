package EstuturasDeDecisao;
import java.util.Scanner;

public class loginESenha {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("login:  ");
        String loguin  = leitor.nextLine();
        
        System.out.print("senha:  ");
        String senha = leitor.nextLine();
        
        boolean autorizado = (loguin.equals("guilherme") && senha.equals("0f5"))
                             || (loguin.equals("jair") && senha.equals("0706"));
        
        if (autorizado){
            System.out.println("Usuario autorizado");
        }else {
            System.out.println("usuario NÂO autorizado");
        }
        
    }
}
