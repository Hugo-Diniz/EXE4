package exe4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Inventario implements InventarioIF {
    private int tamanhoMaximo;
    private List<ItemJogo> itens;

    public Inventario() {
        this.tamanhoMaximo = 0;
        this.itens = new ArrayList<>();
    }

    @Override
    public int getTamanho() {
        return tamanhoMaximo;
    }

    @Override
    public void setTamanho(int tamanho) {
        this.tamanhoMaximo = tamanho;
    }

    @Override
    public void adicionarItem(ItemJogo item) throws InventarioCheioException {
        if (itens.size() < tamanhoMaximo) {
            itens.add(item);
        } else {
            throw new InventarioCheioException("Inventário está cheio.");
        }
    }

    @Override
    public void removerItem(int indice) {
        if (indice >= 0 && indice < itens.size()) {
            itens.remove(indice);
        }
    }

    @Override
    public boolean contemItem(ItemJogo item) {
        return itens.contains(item);
    }

    @Override
    public List<ItemJogo> getInventario() {
        return itens;
    }

    @Override
    public Iterator<ItemJogo> iterator() {
        return itens.iterator();
    }

    @Override
    public void forEach(Consumer<? super ItemJogo> action) {
        itens.forEach(action);
    }

    @Override
    public Spliterator<ItemJogo> spliterator() {
        return itens.spliterator();
    }
}
