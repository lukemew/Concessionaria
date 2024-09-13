public class Moto extends Veiculo{

    private int cilindradas;

    public Moto(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Cilindradas: " + this.cilindradas);
    }

    public void mover() {
        System.out.println("A moto está ziguezagueando pelo trânsito");
    }

}
