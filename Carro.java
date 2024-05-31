public class Carro {
    private String placa;
    private int horarioEntrada;

    public Carro(String placa, int horarioEntrada) {
        this.placa = placa;
        this.horarioEntrada = horarioEntrada;
    }

    public String getPlaca() {
        return placa;
    }

    public int getHorarioEntrada() {
        return horarioEntrada;
    }
}
