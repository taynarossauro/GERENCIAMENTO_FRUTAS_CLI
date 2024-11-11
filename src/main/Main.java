package main;

//importando bibliotecas
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        //iniciando scanner para entrada de dados
        Scanner entrada = new Scanner(System.in);
        Set<String> listaFrutas = new HashSet<>();
        
        while (true) {
            //opções do switch case
            try {
                System.out.println("\nSelecione uma opção:");
                System.out.println("1. Adicionar fruta");
                System.out.println("2. Mostrar frutas cadastradas");
                System.out.println("3. Remover fruta");
                System.out.println("4. Conferir presença de uma fruta");
                System.out.println("5. Sair do programa");
                System.out.print("Opção escolhida: ");
                
                int escolha = entrada.nextInt();
                entrada.nextLine();

                //switch case para usuário utilizar
                switch (escolha) {
                    case 1:
                        System.out.print("Informe o nome da fruta a ser adicionada: ");
                        String frutaAdicionar = entrada.nextLine();
                        if (listaFrutas.add(frutaAdicionar)) {
                            System.out.println(frutaAdicionar + " foi adicionada com sucesso.");
                        } else {
                            System.out.println(frutaAdicionar + " já está na lista.");
                        }
                        break;
                    case 2:
                        System.out.println("Frutas cadastradas: " + listaFrutas);
                        break;
                    case 3:
                        System.out.print("Digite o nome da fruta a ser removida: ");
                        String frutaRemover = entrada.nextLine();
                        if (listaFrutas.remove(frutaRemover)) {
                            System.out.println(frutaRemover + " foi removida com sucesso.");
                        } else {
                            System.out.println(frutaRemover + " não foi encontrada na lista.");
                        }
                        break;
                    case 4:
                        System.out.print("Informe o nome da fruta para verificar: ");
                        String frutaVerificar = entrada.nextLine();
                        if (listaFrutas.contains(frutaVerificar)) {
                            System.out.println(frutaVerificar + " está na lista.");
                        } else {
                            System.out.println(frutaVerificar + " não foi encontrada na lista.");
                        }
                        break;
                    case 5:
                        System.out.println("Encerrando o programa...");
                        entrada.close();
                        return;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }
                //exception caso a entrada seja inválida
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira um número válido.");
                entrada.nextLine(); 
        }
    }
}}
