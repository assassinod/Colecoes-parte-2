import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, String> Nmasculino = new HashMap<>();
        Map<String, String> Nfeminino = new HashMap<>();

        System.out.println("Digite seu sexo com M para mulher e H para homem:");
        String sexo = scan.nextLine();

        System.out.println("Digite seu nome");
        String nome = scan.nextLine();


        if (sexo.equalsIgnoreCase("M")) {
            Nfeminino.put("Mulher", nome);
        } else if (sexo.equalsIgnoreCase("H")) {
            Nmasculino.put("Homem", nome);
        } else {
            System.out.println("Esse sexo não existe");
        }

        System.out.print("\nPessoas com nomes femininos:");
        for (Map.Entry<String,String> entry : Nfeminino.entrySet()) {
            System.out.println(entry.getValue());
        }
        System.out.print("\nPessoas com nomes Masculino:");
        for (Map.Entry<String,String> entry : Nmasculino.entrySet()) {
            System.out.println(entry.getValue());


        }
    }
}
