package core;

public class CommandProcessor {


    public String processCommand(String command) {

        // Se o valor recebido for uma das saudações conhecidas.
        if (command.equalsIgnoreCase("Hello") ||
            command.equalsIgnoreCase("hi") ||
            command.equalsIgnoreCase("Olá") ||
            command.equalsIgnoreCase("Oi")) {

                // Sistema escreve "Hi, chief"
                return "Hi chief.";
        }
        //se não for então...se receber "help"
        else if (command.equalsIgnoreCase("help") ||
                 command.equalsIgnoreCase("Mive me ajuda") ||
                 command.equalsIgnoreCase("Me ajuda ai") ||
                 command.equalsIgnoreCase("Me ajuda")) {


            //Sistema escreve.
            return "Available commands:\n" +
                    "- hello\n" +
                    "- help\n" +
                    "- exit\n";

        }
        else if (command.equalsIgnoreCase("exit")){
            return "Shutting down M.I.V.E...";
        }

        else {
            return "Unknown command";
        }
    }
}
