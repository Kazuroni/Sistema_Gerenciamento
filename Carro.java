package Sistema_Gerenciamento;

public class Carro extends Veiculo {
    private int portas;

    public Carro(String marca, String modelo, int ano, int portas) {
        super(marca, modelo, ano);
        this.portas = portas;
    }

    public int getPortas() {
        return portas;
    }

    @Override
    public void acelerar() {
        System.out.println("Carro " + getMarca() + " acelerando...");
    }

    @Override
    public String toString() {
        return super.toString() + ", Portas: " + portas;
    }
}

