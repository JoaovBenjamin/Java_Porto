import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        OrdemServico ordemServico = new OrdemServico();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o tipo de serviço (1 - Guincho, 2 - Auxílio): ");
        int tipoServico = scanner.nextInt();
        ordemServico.setTipoServico(tipoServico);

        scanner.nextLine();

        System.out.print("Digite a descrição da situação: ");
        String descricao = scanner.nextLine();
        ordemServico.setDescricao(descricao);

        ordemServico.exibirOrdemServico();

        Modal modal = new Modal();

        System.out.print("Digite a marca do caminhão: ");
        String marca = scanner.nextLine();
        modal.setMarca(marca);

        System.out.print("Digite o modelo do caminhão: ");
        String modelo = scanner.nextLine();
        modal.setModelo(modelo);

        System.out.print("Digite o implemento: ");
        String implemento = scanner.nextLine();
        modal.setImplemento(implemento);

        System.out.print("Digite o PBTC do caminhão: ");
        double pbtc = scanner.nextDouble();
        modal.setPbtc(pbtc);

        System.out.println("Confirme os dados:");
        modal.exibirInformacoes();

        System.out.println("As informações foram recebidas e estão sendo analisadas para a melhor escolha do Modal.");
    }
}
