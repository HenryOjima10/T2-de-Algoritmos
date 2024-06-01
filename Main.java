public class Main {
    public static void main(String[] args) {
        Estacionamento estacionamento = new Estacionamento(10);

        // Adiciona 10 carros, atingindo a capacidade máxima
        for (int i = 0; i < 10; i++) {
            estacionamento.entradaCarro(new Carro("CAR" + i, 1000 + i * 30));
        }

        // Tentativa de adicionar mais um carro, o estacionamento está cheio
        estacionamento.entradaCarro(new Carro("CAR10", 1300));

        // Exibe as filas de entrada e saída
        estacionamento.mostrarFilaEntrada();
        estacionamento.mostrarFilaSaida();
    }
}
