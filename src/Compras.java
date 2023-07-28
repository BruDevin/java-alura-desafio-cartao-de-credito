import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Compras {
    private List<Produto> lista = new ArrayList<>();

    public List<Produto> getLista() {
        return lista;
    }

    public void adicionaCompra(Produto produto) {
        this.lista.add(produto);
    }

    public void exibeCompras() {
        String tela = new String();
        for (Produto item : lista) {
            System.out.println(item.getNome() + ": " + item.getValor());
        }
    }
}
