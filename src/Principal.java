import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        //ler o limite do cartão
        CartaoDeCredito meuCartao = new CartaoDeCredito();
        Compras minhasCompras = new Compras();
        Scanner leitor = new Scanner(System.in);
        String sair = "";

        System.out.println("Informe o limite do cartão de crédito: ");
        double limite = leitor.nextDouble();
        meuCartao.setLimite(limite);

        while (!sair.equals("s")) {
            //ler item e valor da compra
            System.out.println("Informe o produto: ");
            String nome = leitor.next();
            System.out.println("Informe o valor: ");
            double valor = leitor.nextDouble();

            //instanciar produto
            if (meuCartao.getLimite() < valor) {
                System.out.println("Saldo insuficiente");
                minhasCompras.exibeCompras();
            } else {
                Produto produto = new Produto(nome, valor);
                minhasCompras.adicionaCompra(produto);
                double novoLimite = meuCartao.getLimite() - valor;
                meuCartao.setLimite(novoLimite);
            }

            System.out.println("Deseja sair: s/n");
            sair = leitor.next();
        }

        minhasCompras.exibeCompras();

        //negar compra ao extrapolar limite

        //exibir as compras ordenadas por valor

        //sair ao comando
    }
}
