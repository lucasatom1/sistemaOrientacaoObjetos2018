
package Padaria;

import javax.swing.JOptionPane;

public class Empregado extends Pessoa implements Interface  {
    private String nome;
    private String idade;
    private  double pis;
    private String ultimo_emprego;
    private double valor_inss;
    private double salario;
    public static int total=0;
    
  public  Empregado(String nome,String idade,double pis,String ultimo_emprego,double valor_inss,double salario){
        super(nome, idade);
        this.pis=pis;
        this.ultimo_emprego=ultimo_emprego;
        this.valor_inss=valor_inss;
        this.salario=salario;
       
        
    }
  public  Empregado(){
        this.pis=0;
        this.ultimo_emprego="";
        this.valor_inss=0;
        this.salario=0;
       
        
    }
  
  

   
    public double getPis() {
        return pis;
    }

    /**
     * @param pis the pis to set
     */
    public void setPis(double pis) {
        this.pis = pis;
    }

    /**
     * @return the ultimo_emprego
     */
    public String getUltimo_emprego() {
        return ultimo_emprego;
    }

    /**
     * @param ultimo_emprego the ultimo_emprego to set
     */
    public void setUltimo_emprego(String ultimo_emprego) {
        this.ultimo_emprego = ultimo_emprego;
    }

    /**
     * @return the valor_inss
     */
    public double getValor_inss() {
        return valor_inss;
    }

    /**
     * @param valor_inss the valor_inss to set
     */
    public void setValor_inss(double valor_inss) {
        this.valor_inss = valor_inss;
    }

    /**
     * @return the salario
     */
    public double getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public  double calculo(double  salario){
        double desconto,valor;
        if(salario>=2000){
            desconto = salario*0.5;
            valor=salario-desconto;
            return valor;
        }else
                        desconto = salario*0.4;
                        valor=salario-desconto;
                        return valor;
    }
    public void ocupação(String ultimo_emprego){
        System.out.println(ultimo_emprego);
      }
    
    public void contar(){
        total++;
    }
    @Override
    public void cadastrarDados(){
        String sal,sal1;
        super.setNome(JOptionPane.showInputDialog(null,"Digite seu Nome"));
        super.setIdade(JOptionPane.showInputDialog(null,"Digite seu Idade"));
        sal = JOptionPane.showInputDialog(null,"Digite seu Salário");
        this.salario = Double.parseDouble(sal);
        this.ultimo_emprego=JOptionPane.showInputDialog(null,"ultimo emprego");
        sal1= JOptionPane.showInputDialog(null,"Informe o valor inss");
        this.valor_inss=Double.parseDouble(sal1);
        
        
    }
    @Override
     public void imprimir(){
        JOptionPane.showMessageDialog(null,"valor calculo-inss"+calculo(salario));
        JOptionPane.showMessageDialog(null, "Nome: " + super.getNome() + "\nIdade:" + super.getIdade()+"\nUltimo Emprego"+ ultimo_emprego +"valor_inss"+valor_inss+"salario"+salario);
    }

        
}
