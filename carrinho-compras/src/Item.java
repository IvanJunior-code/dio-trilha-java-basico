public class Item {
    private String nome;
    private double preco;
    private int quantidade;

    public Item(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }
    
    public Double getPreco() {
        return preco;
    }
    
    public Integer getQuantidade() {
        return quantidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setPreco(Double preco) {
        this.preco = preco;
    }
    
    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

}
