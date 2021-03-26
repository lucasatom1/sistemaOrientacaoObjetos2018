
package Padaria;

import javax.swing.JOptionPane;

public class cliente extends Pessoa implements Interface {
    private double valor_da_compra;
    private String nome;
    private String idade;
    private double codigodacompra;
    
    
    public cliente(String nome, String idade,double valor_da_compra){
        
        super(nome, idade);
        this.valor_da_compra=valor_da_compra;
        this.codigodacompra=codigodacompra;
        
    }

    /**
     * @return the valor_da_compra
     */
    public double getValor_da_compra() {
        return valor_da_compra;
    }

    /**
     * @param valor_da_compra the valor_da_compra to set
     */
    public void setValor_da_compra(double valor_da_compra) {
        this.valor_da_compra = valor_da_compra;
    }

    /**
     * @return the nome
     */
    @Override
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the idade
     */
    @Override
    public String getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    @Override
    public void setIdade(String idade) {
        this.idade = idade;
    }
    @Override
     public void cadastrarDados(){
         String sal;
        this.nome = JOptionPane.showInputDialog(null, "Digite su nome");
        this.idade = JOptionPane.showInputDialog(null, "Digite sua idade");
        sal= JOptionPane.showInputDialog(null,"informe o valor da comprea");
        this.valor_da_compra= Double.parseDouble(sal);
        
    }
    @Override
    public void imprimir(){
        JOptionPane.showMessageDialog(null, "Nome: " + nome + "\nIdade: R$" + idade );
        JOptionPane.showMessageDialog(null,"valor da compra" +valor_da_compra);
    }

    /**
     * @return the codigodacompra
     */
    public double getCodigodacompra() {
        return codigodacompra;
    }

    /**
     * @param codigodacompra the codigodacompra to set
     */
    public void setCodigodacompra(double codigodacompra) {
        this.codigodacompra = codigodacompra;
    }
public void Comprar(double valor_da_compra){
    valor_da_compra = Integer.parseInt(JOptionPane.showInputDialog("o que deja comprar:"));
    System.out.format("valor da compra eh: %s", valor_da_compra);
    
}

}