package app;

// importa a função de Scanner java.
import java.util.Scanner;
// importa a classe CommandProcessor
import core.CommandProcessor;

//Classe Main
public class Main {

    public static void main(String[] args) {
        //Scanner permite a leitura do que foi digitado no terminal.
        Scanner scanner = new Scanner(System.in);
        //Cria o "Processador"
        CommandProcessor processor = new CommandProcessor();

        // Imprime mensagem de inicialização.
        System.out.println("M.I.V.E initialized.");
        System.out.println("Olá Chefe");

        String command;

        do {
            System.out.print("> ");

            //Lê oque você digita.
            command = scanner.nextLine();

            // guarda a resposta e executa a ação
            String response = processor.processCommand(command);
            // manda a resposta da ação.
            System.out.println(response);


        } while(!command.equalsIgnoreCase("exit"));
        scanner.close();
    }

}
