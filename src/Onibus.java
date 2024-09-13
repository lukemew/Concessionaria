public class Onibus extends Veiculo {

    private final int numeroDeAssentos;

    public Onibus(String marca, String modelo, int ano, int numeroDeAssentos) {
        super(marca, modelo, ano);
        this.numeroDeAssentos = numeroDeAssentos;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("////////////////////////////////");
        System.out.println("Obtendo informações do ônibus: ");
        super.exibirDetalhes();
        System.out.println("Número de assentos: " + this.numeroDeAssentos);
    }

    @Override
    public void mover() {
        System.out.println("O ônibus está transportando passageiros");
    }

}
