public class Veiculo {
    private String marca;
    private String modelo;
    private String placa;
    private int ano;

    public Veiculo() {
        this.marca = "";
        this.modelo = "";
        this.placa = "";
        this.ano = 0;
    }

    public Veiculo(String marca, String modelo, String placa, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.ano = ano;
    }

    // marca
    public String getMarca() {return marca;}
    public void setMarca(String marca) {this.marca = marca;}

    // modelo
    public String getModelo() {return modelo;}
    public void setModelo(String modelo) {this.modelo = modelo;}

    // placa
    public String getPlaca() {return placa;}
    public void setPlaca(String placa) {this.placa = placa;}

    // ano
    public int getAno() {return ano;}
    public void setAno(int ano) {this.ano = ano;}

    // \n dá quebra de linha (new line)
    @Override
    public String toString() {
        return "-------------------------\n" +
               "Marca: " + marca + "\n" +
               "Modelo: " + modelo + "\n" +
               "Ano: " + ano + "\n" +
               "Placa: " + placa + "\n" +
               "-------------------------"; 
    }
}