public class Modal {
    private String marca;
    private String modelo;
    private String implemento;
    private double pbtc;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getImplemento() {
        return implemento;
    }

    public void setImplemento(String implemento) {
        this.implemento = implemento;
    }

    public double getPbtc() {
        return pbtc;
    }

    public void setPbtc(double pbtc) {
        this.pbtc = pbtc;
    }

    public void exibirInformacoes() {
        System.out.println("Marca do Caminhão: " + marca);
        System.out.println("Modelo do Caminhão: " + modelo);
        System.out.println("Implemento: " + implemento);
        System.out.println("PBTC do Caminhão: " + pbtc);
    }
}
