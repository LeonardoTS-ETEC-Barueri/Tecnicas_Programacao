package leonardots_lojaferramentas;

import java.util.Scanner;

// O menu é onde as coisas ficam interessantes, onde as classes "conversam" entre si.

public class Menu {
    
    // Atributos
    private Atendente atendente;
    private Cliente cliente;
    private Visitante visitante;
    private Negociacao negociacao;
    private Loja cenario;
    private String nomeUser;
    private int idadeUser;

    // Método Construtor
    public Menu(){
        cenario = new Loja("Loja de Ferramentas", 2000.54687900);
        
        atendente = new Atendente("Alfino Tende", 30, this.getCenario());
        
        cliente = new Cliente("Betino Compratudo", 20, this.getCenario(), "Autônomo", 150.00);
        
        visitante = new Visitante("Diana Curiosa", 32, this.getCenario());
        this.getVisitante().setInteresse();
    }
    // Métodos Especiais (Getter/Setter)
    private Atendente getAtendente() {
        return atendente;
    }
    private void setAtendente(Atendente atendente) {
        this.atendente = atendente;
    }

    private Cliente getCliente() {
        return cliente;
    }
    private void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    private Visitante getVisitante() {
        return visitante;
    }
    private void setVisitante(Visitante visitante) {
        this.visitante = visitante;
    }

    private Negociacao getNegociacao() {
        return negociacao;
    }
    private void setNegociacao(Negociacao negociacao) {
        this.negociacao = negociacao;
    }

    private String getNomeUser() {
        return nomeUser;
    }
    private void setNomeUser(String nome) {
        this.nomeUser = nome;
    }

    private int getIdadeUser() {
        return idadeUser;
    }
    private void setIdadeUser(int idade) {
        this.idadeUser = idade;
    }
    
    private Loja getCenario(){
        return this.cenario;
    }
    private void setCenario(Loja cenario){
        this.cenario = cenario;
    }
    
    // Métodos Personalizados
    public void login(){
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("===================================");
        System.out.println("= Atividade Final TP (28.06.2020) =");
        System.out.println("=---------------------------------=");
        System.out.println("= Antes de começar, registre-se.  =");
        System.out.println("===================================");
        System.out.print("Digite seu nome: ");
        this.nomeUser = teclado.nextLine();
        System.out.print("Digite sua idade: ");
        String resp = teclado.nextLine();
        while (!resp.matches("[0-9]+")){
            System.out.print("Por favor digite apenas números: ");
            resp = teclado.nextLine();
        }
        this.idadeUser = Integer.parseInt(resp);
        System.out.println("Obrigado, vamos começar!");
        
        iniciar();
    }
    
    public void iniciar(){
        Scanner teclado = new Scanner(System.in);
        boolean fimLoop = false;
        int opc = -1;
        
        System.out.println("===================================");
        System.out.println("= Atividade Final TP (28.06.2020) =");
        System.out.println("=       Loja de Ferramentas       =");
        System.out.println("=---------------------------------=");
        System.out.println("=  Qual papel você deseja tomar?  =");
        System.out.println("=---------------------------------=");
        System.out.println("= 1. Atendente                    =");
        System.out.println("= 2. Cliente                      =");
        System.out.println("= 3. Visitante                    =");
        System.out.println("= 0. Encerrar                     =");
        System.out.println("=---------------------------------=");
        System.out.print("Digite o Nº da sua escolha: ");
        do {
            try {
                opc = teclado.nextInt();
            } catch (Exception InputMismatchException){
                //System.out.print("Digite apenas números: ");
                teclado.next();
            }
            
            switch (opc){
                case 0:
                    System.out.println("Okay, até a próxima!");
                    fimLoop = true;
                    break;
                case 1:
                    System.out.println();
                    atendente();
                    fimLoop = true;
                    break;
                case 2:
                    System.out.println();
                    cliente();
                    fimLoop = true;
                    break;
                case 3:
                    System.out.println();
                    visitante();
                    fimLoop = true;
                    break;
                default:
                    System.out.print("Digite apenas as opções da lista: ");
                    fimLoop = false;
                    break;    
            }
        } while (fimLoop == false);
    }
    
    public void atendente(){
        atendente = new Atendente(this.getNomeUser(), this.getIdadeUser(), this.getCenario());
        
        boolean fimLoop = false;
        
        Scanner teclado = new Scanner(System.in);
        
        do {
            System.out.println("===================================");
            System.out.println("= [Atendente] O que deseja fazer? =");
            System.out.println("=---------------------------------=");
            System.out.println("= 1. Verificar lista de produtos  =");
            System.out.println("= 2. Adicionar produto            =");
            System.out.println("= 3. Remover produto              =");
            System.out.println("= 4. Cumprimentar visitante       =");
            System.out.println("= 5. Meu Status                   =");
            System.out.println("= 6. Status da Loja               =");
            System.out.println("= 7. Vender produto               =");
            System.out.println("= 0. Sair                         =");
            System.out.println("=---------------------------------=");
            System.out.print("Digite o Nº da sua escolha: ");

            int opc = 0;
            do {
                try{
                    opc = teclado.nextInt();
                    System.out.println();
                    fimLoop = true;
                } catch (Exception InputMismatchException){
                    System.out.print("Digite apenas um Número para sua escolha: ");
                    teclado.next();
                }
            } while (fimLoop == false);
            fimLoop = false;

            switch(opc){
                case 0:
                    System.out.println("Okay, voltando ao início...");
                    fimLoop = true;
                    iniciar();
                    break;
                case 1:
                    this.getAtendente().listarItems();
                    System.out.println("Digite qualquer coisa para voltar.");
                    teclado.next();
                    break;
                case 2:
                    this.getAtendente().adicionarItem();
                    System.out.println("Digite qualquer coisa para voltar.");
                    teclado.next();
                    break;
                case 3:
                    System.out.println("Qual produto você deseja remover?");
                    String resp = teclado.next();
                    
                    if (resp.matches("[1-9]+")){
                        this.getAtendente().removerItem(Integer.parseInt(resp));
                    } else {
                        this.getAtendente().removerItem(resp);
                    }
                    
                    System.out.println("Digite qualquer coisa para voltar.");
                    teclado.next();
                    break;
                case 4:
                    visitante = new Visitante("Eliana Curiosa", 33, cenario);
                    this.getVisitante().setInteresse();
                    
                    this.getAtendente().cumprimentarVisitante(this.getVisitante());
                    System.out.println("Digite qualquer coisa para voltar.");
                    teclado.next();
                    break;
                case 5:
                    System.out.println(this.getAtendente().toString());
                    System.out.println("Digite qualquer coisa para voltar.");
                    teclado.next();
                    break;
                case 6:
                    System.out.println(this.getCenario().toString());
                    System.out.println("Digite qualquer coisa para voltar.");
                    teclado.next();
                    break;
                case 7:
                    cliente = new Cliente("Betino Compratudo", 20, cenario, "Autônomo", 150.00);
                    Negociacao venda1 = new Negociacao(this.getAtendente(), this.getCliente(), this.getCenario());
                    this.getCliente().setInteresse();
                    System.out.println(this.getAtendente().getNome() + ": Olá, qual produto deseja?");
                    System.out.println(this.getCliente().getNome() + ": Eu desejo um " + this.getCliente().getInteresse());
                    venda1.negociarItem(this.getCliente().getInteresse());
                    System.out.println("Digite qualquer coisa para voltar.");
                    teclado.next();
                    break;
                    
            }

        } while (fimLoop == false);        
    }
    
    public void cliente(){
        double saldo = (20 + Math.random() * (500-20));
        this.cliente = new Cliente(this.getNomeUser(), this.getIdadeUser(), this.getCenario(),"Autônomo", saldo);
        
        boolean fimLoop = false;
        
        Scanner teclado = new Scanner(System.in);
        
        do {
            System.out.println("===================================");
            System.out.println("= [Cliente] O que deseja fazer?   =");
            System.out.println("=---------------------------------=");
            System.out.println("= 1. Pedir a lista de produtos.   =");
            System.out.println("= 2. Realizar compra.             =");
            System.out.println("= 3. Meu Status                   =");
            System.out.println("= 0. Sair                         =");
            System.out.println("=---------------------------------=");
            System.out.print("Digite o Nº da sua escolha: ");

            int opc = 0;
            do {
                try{
                    opc = teclado.nextInt();
                    System.out.println();
                    fimLoop = true;
                } catch (Exception InputMismatchException){
                    System.out.print("Digite apenas um Número para sua escolha: ");
                    teclado.next();
                }
            } while (fimLoop == false);
            fimLoop = false;

            switch(opc){
                case 0:
                    System.out.println("Okay, voltando ao início...");
                    fimLoop = true;
                    iniciar();
                    break;
                case 1:
                    this.getAtendente().listarItems();
                    System.out.println("Obrigado, vejamos o que vou levar...");
                    System.out.println("Digite qualquer coisa para voltar.");
                    teclado.next();
                    break;
                case 2:
                    atendente = new Atendente("Alfino Tende", 30, cenario);
                    Negociacao venda_01 = new Negociacao(this.getAtendente(), this.getCliente(), this.getCenario());
                    
                    System.out.print(this.getNomeUser() + ": Bom, eu vou querer: ");
                    String resp = teclado.next();
                    
                    if (resp.matches("[1-9]+")){
                        venda_01.negociarItem(Integer.parseInt(resp));
                    } else {
                        venda_01.negociarItem(resp);
                    }
                    
                    System.out.println("Digite qualquer coisa para voltar.");
                    teclado.next();
                    break;
                case 3:
                    System.out.println(cliente.toString());
                    System.out.println("Digite qualquer coisa para voltar.");
                    teclado.next();
                    break;
            }

        } while (fimLoop == false);
    }
    
    public void visitante(){
        //int interesse = (int) ( 1 + Math.random() * (this.getCenario().getInventario().size() - 1) );
        visitante = new Visitante(this.getNomeUser(), this.getIdadeUser(), this.getCenario());
        //this.getVisitante().setInteresse(this.getCenario().getInventario().get(interesse).getNome());
        this.getVisitante().setInteresse();
        
        boolean fimLoop = false;
        
        Scanner teclado = new Scanner(System.in);
        
        do {
            System.out.println("===================================");
            System.out.println("= [Visitante] O que deseja fazer? =");
            System.out.println("=---------------------------------=");
            System.out.println("= 1. Se interessar por produto.   =");
            System.out.println("= 2. Meu Status                   =");
            System.out.println("= 0. Sair                         =");
            System.out.println("=---------------------------------=");
            System.out.print("Digite o Nº da sua escolha: ");

            int opc = 0;
            do {
                try{
                    opc = teclado.nextInt();
                    System.out.println();
                    fimLoop = true;
                } catch (Exception InputMismatchException){
                    System.out.print("Digite apenas um Número para sua escolha: ");
                    teclado.next();
                }
            } while (fimLoop == false);
            fimLoop = false;

            switch(opc){
                case 0:
                    System.out.println("Okay, voltando ao início...");
                    fimLoop = true;
                    iniciar();
                    break;
                case 1:
                    this.getVisitante().setInteresse("nada");
                    
                    this.getAtendente().listarItems();
                    
                    System.out.println(this.getVisitante().getNome() + ": Hmmm, qual produto parece interessante?");
                    System.out.print("Digite qual produto te interessou: ");
                    String resp = teclado.next();
                    
                    if (resp.matches("[1-9]+")){
                        this.getVisitante().setInteresse(Integer.parseInt(resp));
                    } else {
                        this.getVisitante().setInteresse(resp);
                    }
                    
                    System.out.println("Você se interessou por " + this.getVisitante().getInteresse());
                    System.out.println("Digite qualquer coisa para voltar.");
                    teclado.next();
                    break;
                case 2:
                    System.out.println(this.getVisitante().toString());
                    System.out.println("Digite qualquer coisa para voltar.");
                    teclado.next();
                    break;
            }

        } while (fimLoop == false);
    }
    
    
    
    
}
