import java.util.LinkedList;
import java.util.Queue;
import java.util.Iterator;

public class Estacionamento {
    private Queue<Carro> filaEntrada;
    private Queue<Carro> filaSaida;
    private int numManobras;
    private int capacidadeMaxima;

    public Estacionamento(int capacidadeMaxima) {
        filaEntrada = new LinkedList<>();
        filaSaida = new LinkedList<>();
        numManobras = 0;
        this.capacidadeMaxima = capacidadeMaxima;
    }

    public boolean isCheio() {
        return filaEntrada.size() >= capacidadeMaxima;
    }

    public void entradaCarro(Carro carro) {
        if (!isCheio()) {
            filaEntrada.add(carro);
        } else {
            System.out.println("O estacionamento está cheio. Não é possível adicionar mais carros.");
        }
    }

    public void saidaCarro(int horarioSaida) {
        if (!filaEntrada.isEmpty()) {
            Carro carro = filaEntrada.remove();
            carro.registrarSaida(horarioSaida);
            filaSaida.add(carro);
            numManobras++;
        } else {
            System.out.println("Não há carros para sair do estacionamento.");
        }
    }

    public void consultarCarro(String placa) {
        Iterator<Carro> iterator = filaEntrada.iterator();
        int posicao = 1;
        boolean encontrado = false;

        while (iterator.hasNext()) {
            Carro carro = iterator.next();
            if (carro.getPlaca().equals(placa)) {
                encontrado = true;
                System.out.println("O carro com a placa " + placa + " está na fila de entrada.");
                System.out.println("Posição na fila: " + posicao);
                System.out.println("Horário de entrada: " + carro.getHorarioEntrada());
                break;
            }
            posicao++;
        }

        if (!encontrado) {
            System.out.println("O carro com a placa " + placa + " não está no estacionamento.");
        }
    }

    public void mostrarFilaEntrada() {
        System.out.println("Fila de carros na entrada:");
        for (Carro carro : filaEntrada) {
            System.out.println("Placa: " + carro.getPlaca() + ", Horário de entrada: " + carro.getHorarioEntrada());
        }
    }

    public void mostrarFilaSaida() {
        System.out.println("Fila de carros na saída:");
        for (Carro carro : filaSaida) {
            System.out.println("Placa: " + carro.getPlaca() + ", Horário de entrada: " + carro.getHorarioEntrada() +
                    ", Horário de saída: " + carro.getHorarioSaida() + ", Tempo de permanência: " +
                    carro.calcularTempoPermanencia() + " minutos");
        }
    }

    public int getNumManobras() {
        return numManobras;
    }
}
