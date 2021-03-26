
package Padaria;

import javax.swing.JOptionPane;


public abstract class Pessoa implements Interface  {
    private String nome;
    private String idade;
    
    
    public Pessoa(String nome,String idade){
        this.nome=nome;
        this.idade=idade;
        
}

 public Pessoa(){
        this.nome="";
        this.idade="";
        
}
  

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the idade
     */
    public String getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(String idade) {
        this.idade = idade;
    }

    
    public void cadastrarDados(){
        this.nome = JOptionPane.showInputDialog(null, "Digite su nome");
        this.idade = JOptionPane.showInputDialog(null, "Digite sua idade");
        
        
    }
    public void imprimir(){
        JOptionPane.showMessageDialog(null, "Nome: " + nome + "\nIdade: R$" + idade );
    }

    
}
