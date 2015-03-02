package Ejercicio6;

public class Buffer {
    private final static int BUFFER_SIZE = 32;
    private char[] buffer;
    private int leido;
    private int escrito;

    public Buffer() {
        buffer = new char[BUFFER_SIZE];
        this.leido = 0;
        this.escrito = 0;
    }

    public synchronized char get() {
        while (isEmpty())
            try {
                wait();
            } catch (InterruptedException e) {
            	e.printStackTrace();
            }
        char c = buffer[leido++];
        if (leido == buffer.length) {
            leido = 0;
        }

        notifyAll();
        return c;
    }

    public synchronized void put(char c) {
        while (isFull())
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        buffer[escrito++] = c;
        if (escrito == buffer.length) {
            escrito = 0;
        }
        notifyAll();
    }

    private boolean isEmpty() {
        return leido == escrito;
    }

    private boolean isFull() {
        if (leido + 1 == escrito) {
            return true;
        }
        if (escrito == (buffer.length - 1) && leido == 0) {
            return true;
        }
        return false;
    }
}
