//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Veiculo carro = new Carro("Chevrolet", "Zenitsu", 2001, 4);
        carro.exibirDetalhes();
        carro.mover();

        Veiculo moto = new Moto("Kawasaki", "Ninja", 2020, 399);
        moto.exibirDetalhes();
        moto.mover();

        Veiculo caminhao = new Caminhao("Volvo", "FH540", 2024, 40);
        caminhao.exibirDetalhes();
        caminhao.mover();

        Veiculo onibus = new Onibus("Volvo", "B240M", 2024, 40);
        onibus.exibirDetalhes();
        onibus.mover();
    }

}