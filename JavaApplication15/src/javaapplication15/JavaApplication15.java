
package javaapplication15;

import java.util.Scanner;

public class JavaApplication15 {


    public static void main(String[] args) {
    Scanner ler = new Scanner (System.in);
    double salarioMinimo = ler.nextDouble();
    int quantidadeDeAgua = ler.nextInt();
    double valorMilLitros = salarioMinimo*0.02;
    int divisao = quantidadeDeAgua/1000;
    double total = valorMilLitros*divisao;
    System.out.println("O valor da sua conta de água é: " + total);
    double desconto= total-(total*0.15);
    System.out.println("O valor da sua conta de água com 15% de desconto é: " + desconto);
    }
    
}