package leonardots_lojaferramentas;

import java.util.Scanner;

// Permitirá a compra segura dos produtos da Loja pelo Cliente através do Atendente.

public class Negociacao {
    
    // Atributos
    private Atendente vendedor;
    private Cliente comprador;
    private Loja localNegocio;
    private Scanner teclado;
    
    // Método Construtor
    public Negociacao(Atendente vendedor, Cliente comprador, Loja localNegocio){
        this.vendedor = vendedor;
        this.comprador = comprador;
        this.localNegocio = localNegocio;
        this.teclado = new Scanner(System.in);
    }
    
    // Métodos Especiais (Getters/Setters)
    public Atendente getVendedor() {
        return vendedor;
    }
    public void setVendedor(Atendente vendedor) {
        this.vendedor = vendedor;
    }

    public Cliente getComprador() {
        return comprador;
    }
    public void setComprador(Cliente comprador) {
        this.comprador = comprador;
    }

    public Loja getLocalNegocio(){
        return this.localNegocio;
    }
    public void setLocalNegocio(Loja localNegocio) {
        this.localNegocio = localNegocio;
    }
    
    // Métodos Personalizados
    public void negociarItem(int pos){
        pos -= 1;
        
        try {
            Produto item = this.getLocalNegocio().getInventario().get(pos);

            if (item != null){
                System.out.println(this.getVendedor().getNome() + ": Okay " + this.getComprador().getNome() + ".");
                System.out.println("[" + item.getNome() + "] custa R$: " + item.getPreco());
                System.out.print("Deseja realmente comprar? S/N: ");

                boolean fimLoop = false;
                while (fimLoop == false) {
                    String resp = teclado.nextLine().toLowerCase();
                    if (resp.equals("s") ^ resp.equals("n")){
                        if (resp.equals("s")){

                            if ( this.getComprador().getSaldo() >= item.getPreco() ){
                                    this.getComprador().setSaldo(this.getComprador().getSaldo() - item.getPreco());
                                    this.getLocalNegocio().setSaldoLoja(this.getLocalNegocio().getSaldoLoja() + item.getPreco());
                                    System.out.println(this.getVendedor().getNome() + " entregou um(a) " + item.getNome() + " conforme o pedido de " + this.getComprador().getNome() + ".");
                                    fimLoop = true;
                                } else {
                                    System.out.println("Você não tem dinheiro para pagar o produto.");
                                    fimLoop = true;
                                }

                        } else if (resp.equals("n")) {
                                System.out.println(this.getComprador().getNome() + " desistiu da compra.");
                                fimLoop = true;
                        }
                    } else {
                         System.out.print("Por favor, digite apenas [S] ou [N]: ");
                    }
                }
            }           
        } catch (Exception IndexOutOfBoundsException){
            System.out.println("Escolha apenas um produto que esteja dentro da lista.");
        }
        
    }
    
    public void negociarItem(String produto){
        int tamanhoLista = this.getLocalNegocio().getInventario().size();
        int acumulador = 0;
        
        for (Produto item: this.getLocalNegocio().getInventario()){
            if (item.getNome().equalsIgnoreCase(produto)){
                System.out.println(this.getVendedor().getNome() + ": Okay " + this.getComprador().getNome() + ".");
                System.out.println("[" + item.getNome() + "] custa R$: " + item.getPreco());
                System.out.print("Deseja realmente comprar? S/N: ");
                
                boolean fimLoop = false;
                while (fimLoop == false) {
                    String resp = teclado.nextLine().toLowerCase();
                    if (resp.equals("s") ^ resp.equals("n")){
                        if (resp.equals("s")){
                 
                            if ( this.getComprador().getSaldo() >= item.getPreco() ){
                                this.getComprador().setSaldo(this.getComprador().getSaldo() - item.getPreco());
                                this.getLocalNegocio().setSaldoLoja(this.getLocalNegocio().getSaldoLoja() + item.getPreco());
                                System.out.println(this.getVendedor().getNome() + " entregou um(a) " + item.getNome() + " conforme o pedido de " + this.getComprador().getNome() + ".");
                                fimLoop = true;
                            } else {
                                System.out.println("Você não tem dinheiro para pagar o produto.");
                                fimLoop = true;
                            }
                            
                        } else if (resp.equals("n")) {
                            System.out.println(this.getComprador().getNome() + " desistiu da compra.");
                            fimLoop = true;
                        }
                    } else {
                        System.out.print("Por favor, digite apenas [S] ou [N]: ");
                    }
                }
            } else {
                acumulador += 1;
            }

        }
        
        if (acumulador >= tamanhoLista){
            System.out.println("Infelizmente não temos o produto que você procura.");
        }
        
    }
    
    
}
