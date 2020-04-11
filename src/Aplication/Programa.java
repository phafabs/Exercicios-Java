
package Aplication;

import entities.Pessoa;
import java.util.Scanner;

public class Programa {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();
        
        System.out.print("Digite seu CPF: ");
        String cpf = sc.nextLine();
        
        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();
        
        sc.nextLine();
        
        System.out.print("Digite seu sobrenome: ");
        String sobrenome = sc.nextLine();
        
        Pessoa dados = new Pessoa(nome, cpf, idade, sobrenome);
        
        System.out.println();
        System.out.println("Nome Completo: " + dados.getNomeCompleto());
      
        System.out.println("Portador do CPF: " + dados.getCpf());
        
        System.out.println("Idade: " + dados.getIdade());
    }
}
