package leonardots_lojaferramentas;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

// A Loja dará início ao cenário do sistema, possui a lista inicial de produtos e o valor em caixa.

public class Loja {
    
    // Atributos
    private String nomeLoja;
    private Produto prod;
    private List<Produto> inventario;
    private double saldoLoja;
    DecimalFormat df = new DecimalFormat("#.##");
    
    // Método Construtor
    public Loja (String nomeLoja, double saldoLoja){
        this.nomeLoja = nomeLoja;
        this.saldoLoja = saldoLoja;
        
        Produto[] item = new Produto[5];
        item[0] = new Produto("Martelo", "Bater pregos e outras coisas", 13.50);
        item[1] = new Produto("Kit Alicate Universal", "Útil para reparos variados", 34.99);
        item[2] = new Produto("Furadeira", "Faz buracos em superfícies", 229.99);
        item[3] = new Produto("Trena", "Faz medições", 13.50);
        item[4] = new Produto("Kit pregos e parafusos", "Prende as coisas no lugar", 40.00);
        
        inventario = new ArrayList<>();
        inventario.add(item[0]);
        inventario.add(item[1]);
        inventario.add(item[2]);
        inventario.add(item[3]);
        inventario.add(item[4]);
        
             
    }
    
    // Métodos Especiais (Getter/Setter)
    public String getNomeLoja(){
        return nomeLoja;
    }
    public void setNomeLoja(String nomeLoja){
        this.nomeLoja = nomeLoja;
    }
    
    public Produto getProd() {
        return prod;
    }
    public void setProd(Produto prod) {
        this.prod = prod;
    }

    public List<Produto> getInventario() {
        return inventario;
    }
    public void setInventario(List<Produto> listaProd) {
        this.inventario = listaProd;
    }

    public double getSaldoLoja() {
        return saldoLoja;
    }
    public void setSaldoLoja(double saldoLoja) {
        this.saldoLoja = saldoLoja;
    }
    
    // Métodos Personalizados
    @Override
    public String toString() {
        df.setRoundingMode(RoundingMode.FLOOR);
        return "Loja{" + "nomeLoja=" + nomeLoja + ",\n inventario=" + inventario + ",\n saldoLoja=" + df.format(saldoLoja) + '}';
    }

    
}
