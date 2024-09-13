//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Chevrolet", "Zenitsu", 2001);
        carro.exibirDetalhes();

        Moto moto = new Moto("Kawasaki", "Ninja", 2020);
        moto.setCilindradas(399);
        moto.exibirDetalhes();
        moto.mover();
    }

}