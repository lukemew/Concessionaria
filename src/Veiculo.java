public class Veiculo {
    private final String marca;
    private final String modelo;
    private final int ano;

    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void exibirDetalhes() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.ano);
    }

    public void mover() {
        System.out.println("Agora o veículo '" + this.modelo + "' Está se movendo");
    }

}
