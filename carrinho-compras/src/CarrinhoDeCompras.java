import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        boolean itemExiste = false;

        for (Item i : itemList) {
            if (i.getNome().equalsIgnoreCase(nome)) {
                System.out.println("O item \"" + i.getNome() + "\" que está tentando adicionar já existe. " +
                    "A quantidade será somada ao já existente.");
                i.setQuantidade(i.getQuantidade() + quantidade);
                itemExiste = true;
                break;
            }
        }

        if (!itemExiste) {
            itemList.add(new Item(nome, preco, quantidade));
        }
    }

    public void removerItem(String nome) {
        List<Item> itensParaRemover = new ArrayList<>();
        for (Item i : itemList) {
            if (i.getNome().equalsIgnoreCase(nome)) {
                itensParaRemover.add(i);
            }
        }
        itemList.removeAll(itensParaRemover);
    }

    //retorna o valor total do carrinho
    public double calcularValorTotal() {
        double total = 0;
        for (Item i : itemList) {
            total += i.getPreco() * i.getQuantidade();
        }
        return total;
    }

    public void exibirItens() {
        //System.out.println(itemList);
        int numeroItem = itemList.size();
        for (Item i : itemList) {
            System.out.println("Item número " + (++numeroItem - itemList.size()) + ":" +
            "\n\tNome: " + i.getNome() +
            "\n\tPreço: R$" + i.getPreco() +
            "\n\tQuantidade: " + i.getQuantidade());
        }
    }

    public int obterTotalItens() {
        return itemList.size();
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoCompras = new CarrinhoDeCompras();
        System.out.println("\n\nO número total de itens do carrinho é de " + carrinhoCompras.obterTotalItens());

        carrinhoCompras.adicionarItem("Produto 1", 52, 1);
        carrinhoCompras.adicionarItem("Produto 2", 10, 1);
        carrinhoCompras.adicionarItem("Produto 3", 10, 1);
        carrinhoCompras.adicionarItem("Produto 1", 10, 1);
        System.out.println("\n");
        carrinhoCompras.exibirItens();
        System.out.println("O número total de itens do carrinho é de " + carrinhoCompras.obterTotalItens());

        carrinhoCompras.removerItem("Produto 2");
        System.out.println("O número total de itens do carrinho é de " + carrinhoCompras.obterTotalItens());

        System.out.println("\n");
        carrinhoCompras.exibirItens();

        System.out.println("\nO valor total do carrinho é de R$" + carrinhoCompras.calcularValorTotal() + ".");
        
    }
}
