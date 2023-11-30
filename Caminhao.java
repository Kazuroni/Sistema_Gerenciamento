package Sistema_Gerenciamento;

public class Caminhao extends Veiculo {
    private double capacidadeCarga;

    public Caminhao(String marca, String modelo, int ano, double capacidadeCarga) {
        super(marca, modelo, ano);
        this.capacidadeCarga = capacidadeCarga;
    }

    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }

    @Override
    public void acelerar() {
        System.out.println("Caminhão " + getMarca() + " acelerando...");
    }

    @Override
    public String toString() {
        return super.toString() + ", Capacidade de Carga: " + capacidadeCarga;
    }
}

