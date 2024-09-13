# Projeto de Concessionária

Este projeto é uma aplicação Java que simula uma concessionária de veículos, demonstrando conceitos de herança e polimorfismo.

## Estrutura do Projeto

### Classe Base: `Veiculo`
- **Atributos:**
  - `marca` (String)
  - `modelo` (String)
  - `ano` (int)
- **Métodos:**
  - `exibirDetalhes()`
  - `mover()`

### Classes Derivadas
- **`Carro`**
  - Atributo: `quantidadeDePortas` (int)
  - Método `mover()`: "O carro está acelerando na estrada."
- **`Moto`**
  - Atributo: `cilindradas` (int)
  - Método `mover()`: "A moto está ziguezagueando pelo trânsito."
- **`Caminhao`**
  - Atributo: `capacidadeDeCarga` (double)
  - Método `mover()`: "O caminhão está transportando carga."
- **`Onibus`**
  - Atributo: `numeroDeAssentos` (int)
  - Método `mover()`: "O ônibus está transportando passageiros."

### Classe `Main`
- Instancia objetos de cada classe derivada.
- Utiliza `exibirDetalhes()` para mostrar informações dos veículos.
- Utiliza `mover()` para demonstrar polimorfismo.

## Exemplo de Código

```java
public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Toyota", "Corolla", 2022, 4);
        Moto moto = new Moto("Honda", "CB500", 2021, 500);
        Caminhao caminhao = new Caminhao("Volvo", "FH 540", 2024, 40.0);
        Onibus onibus = new Onibus("Mercedes", "Sprinter", 2023, 30);

        carro.exibirDetalhes();
        carro.mover();

        moto.exibirDetalhes();
        moto.mover();

        caminhao.exibirDetalhes();
        caminhao.mover();

        onibus.exibirDetalhes();
        onibus.mover();
    }
}
