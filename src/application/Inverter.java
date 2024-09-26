package application;

import entities.Inversor;

import java.util.Scanner;

public class Inverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma string para inverter: ");
        String input = scanner.nextLine();
        Inversor inversor = new Inversor(input);
        System.out.println(inversor.inverterString(input));
    }

}
