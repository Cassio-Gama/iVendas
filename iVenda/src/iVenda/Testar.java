package iVenda;

public class Testar {
	
    public static void main(String[] args) {
        Carro carro = new Carro("Fiat", 2022, 50000.00, 4);
        Moto moto = new Moto("Honda", 2021, 30000.00, 250);
        
        Pessoa pessoa = new Pessoa("João", "123.456.789-00", 30);
        
        carro.vender();
        moto.vender();
    }
}

