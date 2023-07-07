package DesafioDeCodigoPWC;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        do {
            String optionMenu = """
                    Digite o número do exercício que deseja realizar:
                                    
                    1. Exercício 1
                    2. Exercício 2
                    3. Exercício 3
                    4. Exercício 4
                    5. Exercício 5
                    0. Sair""";

            System.out.println(optionMenu);
            int choice = input.nextInt();

            switch (choice) {
                case 1 -> {
                    ex1();
                    System.out.println();
                }
                case 2 -> {
                    ex2();
                    System.out.println();
                }
                case 3 -> {
                    ex3();
                    System.out.println();
                }
                case 4 -> {
                    ex4();
                    System.out.println();
                }
                case 5 -> {
                    ex5();
                    System.out.println();
                }
                case 0 -> {
                    System.out.println("Encerrando...");
                    System.exit(0);
                }
                default -> System.out.println("Opção inválida");
            }
        } while (true);


    }

    private static void ex1() {
        String input = "Hello, World! OpenAI is amazing.";

        String[] inputAux = input.split(" ");

        for (int i = inputAux.length; i > 0; i -- ) {

            System.out.print(inputAux[i - 1]);
            if (i != 1 ) {
                System.out.print(" ");
            }
        }
    }

    private static void ex2() {
        String input = "Hello, World!";
        StringBuilder inputAux = new StringBuilder(input);

        for (int i = 0; i < inputAux.length(); i++) {
            for (int j = i + 1; j < inputAux.length(); j++) {
                if (inputAux.charAt(i) == inputAux.charAt(j)) {
                    inputAux.deleteCharAt(j);
                    j--;
                }
            }
        }
        System.out.print(inputAux);
    }

    private static void ex3() {
        String input = "babad";
        String palindrome = "";

        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j <= input.length(); j++) {
                String aux1 = input.substring(i, j);
                String aux2 = new StringBuilder(aux1).reverse().toString();

                if (aux1.equals(aux2) && aux1.length() > palindrome.length()) {
                    palindrome = aux1;
                }
            }
        }

        System.out.print(palindrome);

    }

    private static void ex4() {
        String input = "hello. how are you? i'am fine.";
        StringBuilder output = new StringBuilder();
        String aux;

        String[] splitElements = input.split("\\.");
        ArrayList<String> inputElements = new ArrayList<>(Arrays.asList(splitElements));

        inputElements.clear();

        for (String string : splitElements) {
            String upperCase = String.valueOf(string.trim().charAt(0));
            upperCase = upperCase.toUpperCase();
            String removeLowerCase = string.trim().substring(1);

            output.append(upperCase).append(removeLowerCase).append(".");
            inputElements.add(String.valueOf(output));

            output.delete(0,output.length());
        }

        aux = String.valueOf(inputElements).replace("[","").replace("]","")
                .replace(",","").trim();

        splitElements = aux.split("\\?");

        inputElements.clear();

        for (String string : splitElements) {
            String upperCase = String.valueOf(string.trim().charAt(0));
            upperCase = upperCase.toUpperCase();
            String removeLowerCase = string.trim().substring(1);

            if (string.endsWith(".")) {
                output.append(upperCase).append(removeLowerCase);
            } else {
                output.append(upperCase).append(removeLowerCase).append("?");
            }
            inputElements.add(String.valueOf(output));
            output.delete(0,output.length());
        }
        aux = String.valueOf(inputElements).replace("[","").replace("]","")
                .replace(",","").trim();

        output.append(aux);

        System.out.print(output);

    }

    private static void ex5() {
        String input = "racecar";
        StringBuilder reverseInput = new StringBuilder(input).reverse();
        boolean palindrome = input.matches(String.valueOf(reverseInput));

        System.out.println(palindrome);
    }

}