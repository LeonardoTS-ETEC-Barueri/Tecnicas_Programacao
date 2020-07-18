package leonardots_lojaferramentas;

import java.util.Scanner;

// Herança para Diferença.
// Atendente é uma pessoa, porém é um funcionário. Gerenciará produtos e fará negociações.

public class Atendente extends Pessoa{
    
    // Atributos
    private String profissao;
    
    // Método Construtor
    public Atendente(String nome, int idade, Loja ondeEstou){
        super(nome, idade, ondeEstou);
        this.profissao = "Atendente";
    }
    
    // Métodos Especiais (Getters/Setters)
    public String getProfissao() {
        return profissao;
    }
    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
    
    // Métodos Personalizados
    public void adicionarItem(){
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Nome do produto: ");
        String nomeProd = teclado.nextLine();
                    
        System.out.print("Utilidade do produto: ");
        String utilProd = teclado.nextLine();
                    
        System.out.print("Preço do produto: ");
                    
        double preco = 0;
        
        do {
            try {
                preco = teclado.nextDouble();
                if (preco <= 0){
                    System.out.print("Preço não pode ser zero ou negativo: ");
                }
            } catch (Exception InputMismatchException) {
                System.out.print("Digite apenas números (ex:12,34): ");
                teclado.next();
            }
        } while (preco <= 0);
        
        Produto item = new Produto(nomeProd, utilProd, preco);
        this.getOndeEstou().getInventario().add(item);
        System.out.println(item.getNome() + " foi adicionado ao inventário com sucesso.");
    }
    
        //Polimorfismo de Sobrecarga
    public void removerItem(int pos){
        try {
            pos -= 1;
            System.out.println(this.getOndeEstou().getInventario().get(pos).getNome() + " foi removido(a) do inventário com sucesso.");
            this.getOndeEstou().getInventario().remove(pos);
        } catch(Exception IndexOutOfBounds) {
            if ( this.getOndeEstou().getInventario().isEmpty()){
                System.out.println("O inventário está vazio.");
            } else {
                System.out.println("Digite apenas uma posição existente na lista de produtos.");
            }
        }
    }
    
    public void removerItem(String nomeItem){
        int tamanhoLista = this.getOndeEstou().getInventario().size();
        int acumulador = 0;
        String posItem = "";
        
        for (Produto item: this.getOndeEstou().getInventario()){
            if (item.getNome().equalsIgnoreCase(nomeItem)){
                System.out.println(item.getNome() + " foi removido(a) do inventário com sucesso.");
                posItem = Integer.toString(this.getOndeEstou().getInventario().indexOf(item));
            } else {
                acumulador++;
            }
        }
        if (!posItem.isEmpty()){
            this.getOndeEstou().getInventario().remove(Integer.parseInt(posItem));
        }
        if ( this.getOndeEstou().getInventario().isEmpty()){
            System.out.println("O inventário está vazio.");
        }
        if (acumulador >= tamanhoLista){
            System.out.println(nomeItem + " não existe nesta lista.");
        }
    }
    
    public void listarItems(){
        System.out.println("==================================");
        System.out.println("=  Lista dos Itens no Inventário  ");
        System.out.println("=     [Posição] - Nome - Preço    ");
        System.out.println("=---------------------------------");
        int count = 0;
        for (Produto item: this.getOndeEstou().getInventario()){
            System.out.printf("= [%d] - %s - R$: %.2f\n", (count + 1), item.getNome(), item.getPreco());
                    //"= [" + (count + 1) + "] - " + item.getNome() + " ");
            count++;
        }
        System.out.println("==================================");
        
    }

    public void cumprimentarVisitante(Visitante v){
        String nome = v.getNome();
        String interesse = v.getInteresse();
        System.out.println(this.getNome() + ": Olá " + nome + ", procurando por um produto em particular?");
        System.out.println(this.getNome() + ": Vejo que se interessou por " + interesse);
    }

    @Override
    public String toString() {
        return "Atendente " + super.getNome() + ", " + super.getIdade() + " anos {" + "profissao=" + profissao + '}';
    }
    
    
}
