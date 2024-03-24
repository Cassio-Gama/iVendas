package iVenda;

abstract class Veiculo {
	protected String modelo;
    protected int anoFabricacao;
    protected double preco;
    protected boolean disponivel;
    
    public Veiculo(String modelo, int anoFabricacao, double preco) {
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.preco = preco;
        this.disponivel = true;
    }
    
    public abstract void vender(); // Método abstrato
}
