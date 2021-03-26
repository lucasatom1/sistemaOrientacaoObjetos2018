
package Padaria;

import javax.swing.JOptionPane;


public class Padaria implements Interface  {
    
        private String nome;
        private String cnpj;
        private String endereco;   
       
        public Padaria(){
           this.nome="";
           this.cnpj="";
           this.nome="";
        }
        public Padaria(String nome, String cnpj, String endereco) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.endereco = endereco;
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
     * @return the cnpj
     */
    public String getCnpj() {
        return cnpj;
    }

    /**
     * @param cnpj the cnpj to set
     */
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public void cadastrarDados() {
        this.nome = JOptionPane.showInputDialog(null, "Digite o nome da Empresa:");
        this.cnpj = JOptionPane.showInputDialog(null, "CNPJ:");
        this.endereco = JOptionPane.showInputDialog(null, "Endereço:");
    }
    
    public void imprimir() {
        JOptionPane.showMessageDialog(null, "Razão social: " + nome + "\nCNPJ: " + cnpj + "\nEndereço: " + endereco);
    }
       
 }
    

