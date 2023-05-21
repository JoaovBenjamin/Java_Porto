public class OrdemServico {

    private int tipoServico;
    private String descricao;

    public int getTipoServico() {
        return tipoServico;
    }

    public void setTipoServico(int tipoServico) {
        this.tipoServico = tipoServico;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void exibirOrdemServico() {
        String tipo;
        if (tipoServico == 1) {
            tipo = "Guincho";
        } else if (tipoServico == 2) {
            tipo = "Auxílio";
        } else {
            tipo = "Inválido";
        }

        System.out.println("Tipo de Serviço: " + tipo);
        System.out.println("Descrição: " + descricao);
    }

}