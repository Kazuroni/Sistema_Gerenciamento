package Sistema_Gerenciamento;

import java.util.ArrayList;

public class MainVeiculos {
    public static void main(String[] args) {
        ArrayList<Veiculo> listaVeiculos = new ArrayList<>();

        // Adicionando veículos à lista
        listaVeiculos.add(new Carro("Toyota", "Corolla", 2022, 4));
        listaVeiculos.add(new Moto("Honda", "CBR500R", 2021, "Esportiva"));
        listaVeiculos.add(new Caminhao("Volvo", "FH16", 2020, 20000.0));

        // Iterando e realizando operações comuns
        for (Veiculo veiculo : listaVeiculos) {
            System.out.println(veiculo);
            veiculo.acelerar();
            // Aqui você pode realizar outras operações comuns, como ligar veículos, etc.
        }
    }
}
