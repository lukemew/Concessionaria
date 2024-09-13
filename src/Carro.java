public class Carro extends Veiculo {

    public Carro(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();

    }

    @Override
    public void mover() {
        System.out.println("O carro está se movendo na estrada");
    }

}
