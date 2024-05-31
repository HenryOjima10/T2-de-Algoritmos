import java.util.LinkedList;
import java.util.Queue;

public class Fila<E> {
    private Queue<E> elementos;

    public Fila() {
        this.elementos = new LinkedList<>();
    }

    public boolean estaVazia() {
        return elementos.isEmpty();
    }

    public void enfileira(E elemento) {
        elementos.add(elemento);
    }

    public E desenfileira() {
        if (!estaVazia()) {
            return elementos.poll();
        }
        return null;
    }

    public int tamanho() {
        return elementos.size();
    }

    public E getPrimeiro() {
        if (!estaVazia()) {
            return elementos.peek();
        }
        return null;
    }

    @Override
    public String toString() {
        return elementos.toString();
    }
}
