public class Carro extends Veiculo {

    private final int quantDePortas;

    public Carro(String marca, String modelo, int ano, int quantDePortas) {
        super(marca, modelo, ano);
        this.quantDePortas = quantDePortas;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("////////////////////////////////");
        System.out.println("Obtendo informações do carro: ");
        super.exibirDetalhes();
        System.out.println("Quantidade de portas: " + this.quantDePortas);
    }

    @Override
    public void mover() {
        System.out.println("O carro está acelerando na estrada");
    }

}
