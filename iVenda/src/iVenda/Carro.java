package iVenda;

class Carro extends Veiculo {
    private int numPortas;
    
    public Carro(String modelo, int anoFabricacao, double preco, int numPortas) {
        super(modelo, anoFabricacao, preco);
        this.numPortas = numPortas;
    }
    
    @Override
    public void vender() {
        if (super.disponivel) {
            super.disponivel = false;
            System.out.println("Carro vendido:");
            System.out.println("Modelo: " + super.modelo);
            System.out.println("Preço: " + super.preco);
        } else {
            System.out.println("Carro não está disponível para venda.");
        }
    }
}