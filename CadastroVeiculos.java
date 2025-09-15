import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadastroVeiculos {

    private static List<Veiculo> veiculos = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("""
                      __  __ ___ _  _ _   _
                     |  \\/  | __| \\| | | | |
                     | |\\/| | _|| .` | |_| |
                     |_|  |_|___|_|\\_|\\___/

                    1 - Cadastrar Veículo
                    2 - Listar Veículos
                    3 - Excluir Veículo
                    4 - Pesquisar Veículo
                    0 - Sair
                    """);
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            System.out.println(); //espaço entre opção e texto
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarVeiculo();
                    break;
                case 2:
                    listarVeiculos();
                    break;
                case 3:
                    excluirVeiculo();
                    break;
                case 4:
                    pesquisarVeiculo();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }

    // cadastro
    private static void cadastrarVeiculo() {
        // marca
        System.out.print("Marca: ");
        String marca = scanner.nextLine();
        // modelo
        System.out.print("Modelo: ");
        String modelo = scanner.nextLine();
        // ano
        System.out.print("Ano: ");
        int ano = scanner.nextInt();
        scanner.nextLine();
        // placa
        System.out.print("Placa: ");
        String placa = scanner.nextLine();

        for (Veiculo v : veiculos) {
            if (v.getPlaca().equalsIgnoreCase(placa)) {
                System.out.println("Placa já cadastrada.");
                return;
            }
        }

        Veiculo novo = new Veiculo(marca, modelo, placa, ano);
        veiculos.add(novo);
        System.out.println();
        System.out.println("Veículo cadastrado com sucesso:\n" + novo);
    }

    // listar
    private static void listarVeiculos() {
        if (veiculos.isEmpty()) {
            System.out.println("Nenhum veículo cadastrado.");
        } else {
            for (Veiculo v : veiculos) {
                System.out.println(v);
            }
        }
    }

    // excluir (teste que não deu certo: colocar uma confirmação de exclusão)
    private static void excluirVeiculo() {
        System.out.print("Digite a placa do veículo a excluir: ");
        String placa = scanner.nextLine();
        Veiculo excluir = null;

        for (Veiculo v : veiculos) {
            if (v.getPlaca().equalsIgnoreCase(placa)) {
                excluir = v;
                break;
            }
        }

        if (excluir != null) {
            veiculos.remove(excluir);
            System.out.println("Veículo removido!");
        } else {
            System.out.println("Placa não encontrada.");
        }
    }

    // pesquisar
    private static void pesquisarVeiculo() {
        System.out.println("Pesquisar por: \n1 - Placa \n2 - Modelo");
        int tipo = scanner.nextInt();
        scanner.nextLine();

        boolean encontrado = false;

        if (tipo == 1) {
            System.out.print("Digite a placa: ");
            String placa = scanner.nextLine();
            for (Veiculo v : veiculos) {
                if (v.getPlaca().equalsIgnoreCase(placa)) {
                    System.out.println(v);
                    encontrado = true;
                }
            }
        } if (tipo == 2) {
            System.out.print("Digite o modelo do veículo: ");
            String modelo = scanner.nextLine();
            for (Veiculo v : veiculos) {
                if (v.getModelo().toLowerCase().contains(modelo.toLowerCase())) {
                    System.out.println(v);
                    encontrado = true;
                }
            }
        // não funciona quando o usuário digita letra, só número
        } else {
            System.out.println("Opção inválida.");
        }

        if (!encontrado) {
            System.out.println("Nenhum veículo encontrado.");
        }
    }
}
