public class Moto extends Veiculo{

    private final int cilindradas;

    public Moto(String marca, String modelo, int ano, int cilindradas) {
        super(marca, modelo, ano);
        this.cilindradas = cilindradas;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("////////////////////////////////");
        System.out.println("Obtendo informações da moto: ");
        super.exibirDetalhes();
        System.out.println("Cilindradas: " + this.cilindradas);
    }

    @Override
    public void mover() {
        System.out.println("A moto está ziguezagueando pelo trânsito");
    }

}
