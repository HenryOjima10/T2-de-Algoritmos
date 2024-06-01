public class Carro {
    private String placa;
    private int horarioEntrada;
    private int horarioSaida;

    public Carro(String placa, int horarioEntrada) {
        this.placa = placa;
        this.horarioEntrada = horarioEntrada;
    }

    public void registrarSaida(int horarioSaida) {
        this.horarioSaida = horarioSaida;
    }

    public int calcularTempoPermanencia() {
        return horarioSaida - horarioEntrada;
    }

    public String getPlaca() {
        return placa;
    }

    public int getHorarioEntrada() {
        return horarioEntrada;
    }

    public int getHorarioSaida() {
        return horarioSaida;
    }
}
