import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();

        int opcao;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Cadastrar nome");
            System.out.println("2 - Listar nomes cadastrados");
            System.out.println("3 - Atualizar um nome existente");
            System.out.println("4 - Remover um nome");
            System.out.println("5 - Sair do sistema");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine(); // limpa o buffer

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome a ser cadastrado: ");
                    String nome = scanner.nextLine();
                    nomes.add(nome);
                    System.out.println("Nome cadastrado com sucesso!");
                    break;

                case 2:
                    if (nomes.isEmpty()) {
                        System.out.println("Nenhum nome cadastrado.");
                    } else {
                        System.out.println("\nLista de nomes:");
                        for (int i = 0; i < nomes.size(); i++) {
                            System.out.println(i + " - " + nomes.get(i));
                        }
                    }
                    break;

                case 3:
                    if (nomes.isEmpty()) {
                        System.out.println("Não há nomes para atualizar.");
                    } else {
                        System.out.print("Digite o índice do nome que deseja atualizar: ");
                        int indiceAtualizar = scanner.nextInt();
                        scanner.nextLine();

                        if (indiceAtualizar >= 0 && indiceAtualizar < nomes.size()) {
                            System.out.print("Digite o novo nome: ");
                            String novoNome = scanner.nextLine();
                            nomes.set(indiceAtualizar, novoNome);
                            System.out.println("Nome atualizado com sucesso!");
                        } else {
                            System.out.println("Índice inválido.");
                        }
                    }
                    break;

                case 4:
                    if (nomes.isEmpty()) {
                        System.out.println("Não há nomes para remover.");
                    } else {
                        System.out.print("Digite o índice do nome que deseja remover: ");
                        int indiceRemover = scanner.nextInt();

                        if (indiceRemover >= 0 && indiceRemover < nomes.size()) {
                            nomes.remove(indiceRemover);
                            System.out.println("Nome removido com sucesso!");
                        } else {
                            System.out.println("Índice inválido.");
                        }
                    }
                    break;

                case 5:
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 5);

        scanner.close();
    }
}