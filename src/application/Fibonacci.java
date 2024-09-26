package application;

import entities.FibonacciChecker;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int num = scanner.nextInt();
        FibonacciChecker fibonacciChecker = new FibonacciChecker(num);
        if(fibonacciChecker.isFibonacci(num)){
            System.out.println("Está na sequência!");
        }else{
            System.out.println("Não está na sequência!");
        }
    }
}
