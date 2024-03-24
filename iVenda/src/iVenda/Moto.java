package iVenda;

class Moto extends Veiculo {
    private int cilindrada;
    
    public Moto(String modelo, int anoFabricacao, double preco, int cilindrada) {
        super(modelo, anoFabricacao, preco);
        this.cilindrada = cilindrada;
    }
    
    @Override
    public void vender() {
        if (super.disponivel) {
            super.disponivel = false;
            System.out.println("Moto vendida:");
            System.out.println("Modelo: " + super.modelo);
            System.out.println("Preço: " + super.preco);
        } else {
            System.out.println("Moto não está disponível para venda.");
        }
    }
}