package exe4;

import java.util.ArrayList;
import java.util.List;

public class Pilha implements Stack {

    private List<String> pilha;

    public Pilha() {
        this.pilha = new ArrayList<>(10);
    }

    @Override
    public void push(String item) {
        if (!isFull()) {
            this.pilha.add(0, item);
        }else {
            return;
        }
    }

    @Override
    public String pop() {
        if (!isEmpty()) {
            return this.pilha.remove(0);
        } else {
            return null;
        }
    }

    @Override
    public String peek() {
        if (!isEmpty()) {
            return this.pilha.get(0);
        }else {
            return null;
        }
    }

    @Override
    public boolean isEmpty() {
        if (pilha.size() == 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean isFull() {
        if (pilha.size() == 10) {
            return true;
        } else {
            return false;
        }
    }
    
    @Override
    public String toString() {
        return pilha.toString();
    }
}
