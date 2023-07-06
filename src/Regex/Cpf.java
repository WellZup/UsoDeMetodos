package Regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Cpf {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("=======Validando CPF=======");

        boolean cpfValido = false;
        String cpf;
        do {
            System.out.println("========Digite o CPF=======");
            cpf = entrada.nextLine();

            if (validarCPF(cpf)) {
                cpfValido = true;
                System.out.println("========CPF válido!=======");
            } else {
                System.out.println("### CPF inválido! Digite novamente. ###");
            }
        } while (!cpfValido);
    }

    public static boolean validarCPF(String cpf) {
        return cpf.matches("\\d{3}.\\d{3}.\\d{3}-\\d{2}");
    }
}


