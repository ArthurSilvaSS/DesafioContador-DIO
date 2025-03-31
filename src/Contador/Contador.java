package Contador;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        try {
            System.out.println("Digite o primeiro parametro");
            int parametroUm = terminal.nextInt();

            System.out.println("Digite o segundo parametro");
            int parametroDois = terminal.nextInt();

            contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException();
        }

        int subtracao = parametroDois - parametroUm;
        for (int i = 1; i <= subtracao; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}

class ParametrosInvalidosException extends Exception {
}