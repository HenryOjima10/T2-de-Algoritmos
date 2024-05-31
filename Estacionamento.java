import java.util.LinkedList;
import java.util.Queue;

public class Estacionamento {
    private Queue<Carro> filaEntrada;
    private Queue<Carro> filaSaida;
    private int capacidadeMaxima;

    public Estacionamento(int capacidadeMaxima) {
        this.filaEntrada = new LinkedList<>();
        this.filaSaida = new LinkedList<>();
        this.capacidadeMaxima = capacidadeMaxima;
    }

    public void entradaCarro(Carro carro) {
        if (filaEntrada.size() < capacidadeMaxima) {
            filaEntrada.add(carro);
            System.out.println("Carro com placa " + carro.getPlaca() + " entrou no estacionamento.");
        } else {
            System.out.println("Estacionamento cheio. Carro com placa " + carro.getPlaca() + " não pode entrar.");
        }
    }

    public void saidaCarro(int horarioSaida) {
        if (!filaEntrada.isEmpty()) {
            Carro carroSaindo = filaEntrada.poll();
            int tempoPermanencia = horarioSaida - carroSaindo.getHorarioEntrada();
            filaSaida.add(carroSaindo);
            System.out.println("Carro com placa " + carroSaindo.getPlaca() + " saiu do estacionamento.");
            System.out.println("Tempo de permanência: " + tempoPermanencia + " horas.");
        } else {
            System.out.println("Estacionamento vazio. Não há carros para sair.");
        }
    }

    public boolean consultaCarro(String placa) {
        for (Carro carro : filaEntrada) {
            if (carro.getPlaca().equals(placa)) {
                System.out.println("Carro com placa " + placa + " está na fila de entrada.");
                return true;
            }
        }
        for (Carro carro : filaSaida) {
            if (carro.getPlaca().equals(placa)) {
                System.out.println("Carro com placa " + placa + " está na fila de saída.");
                return true;
            }
        }
        System.out.println("Carro com placa " + placa + " não está no estacionamento.");
        return false;
    }
}
