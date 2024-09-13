public class Caminhao extends Veiculo{

    private final double capacidadeDeCarga;

    public Caminhao(String marca, String modelo, int ano, double capacidadeDeCarga) {
        super(marca, modelo, ano);
        this.capacidadeDeCarga = capacidadeDeCarga;
    }

    @Override
    public void exibirDetalhes(){
        System.out.println("////////////////////////////////");
        System.out.println("Obtendo informações do caminhão: ");
        super.exibirDetalhes();
        System.out.println("Capacidade de carga: " + this.capacidadeDeCarga + " toneladas");
    }

    @Override
    public void mover() {
        System.out.println("O caminhão está transportando carga");
    }

}
