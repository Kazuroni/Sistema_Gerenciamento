package Sistema_Gerenciamento;

public class Moto extends Veiculo {
    private String estilo;

    public Moto(String marca, String modelo, int ano, String estilo) {
        super(marca, modelo, ano);
        this.estilo = estilo;
    }

    public String getEstilo() {
        return estilo;
    }

    @Override
    public void acelerar() {
        System.out.println("Moto " + getMarca() + " acelerando...");
    }

    @Override
    public String toString() {
        return super.toString() + ", Estilo: " + estilo;
    }
}
