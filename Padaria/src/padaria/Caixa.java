package Padaria;

import javax.swing.JOptionPane;

public class Caixa extends Empregado implements Interface {
    private double valor;
    private String nome_produto;
    private double valor_produto;
    private String nome;
    private String idade;
    private  double pis;
    private String ultimo_emprego;
    private double valor_inss;
    private double salario;
    
    
    
    
    public Caixa(String nome,String idade,double pis,String ultimo_emprego,double valor_inss,double salario){
        super(nome, idade, pis, ultimo_emprego, valor_inss, salario);
        
    }

     public Caixa(){
        super();
        
        
    }
    
    public Caixa(String nome,String idade,double pis,String ultimo_emprego,double valor_inss,double salario,double valor,String nome_produto,double valor_produto) {
       super(nome, idade, pis, ultimo_emprego, valor_inss, salario);
       Empregado.total++;
       this.valor=valor;
       this.nome_produto=nome_produto;
       this.valor_produto=valor_produto;
       
    }
   
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    public String getNome_produto() {
        return nome_produto;
    }
    
    public void setNome_produto(String nome_produto) {
        this.nome_produto = nome_produto;
    }
    public double getValor_produto() {
        return valor_produto;
    }

    
    public void setValor_produto(double valor_produto) {
        this.valor_produto = valor_produto;
    }
    @Override
     public  double calculo(double  salario){
        double desconto2,valor;
        if(salario>=2000){
            desconto2 = salario*0.9;
            valor=salario-desconto2;
            return valor;
        }else
                        desconto2 = salario*0.4;
                        valor=salario-desconto2;
                        return valor;
    }

    /**
     *
     * @param salario
     * @return 
     */
    public float calculo(float  salario){
        float desconto2,valor1;
        if(salario>=2000){
            desconto2 = salario*9;
            valor1=salario-desconto2;
            //System.out.println(valor1);
            return valor1;
        }else{
                        desconto2 = salario*4;
                        valor1=salario-desconto2;
                        return valor1;
        }
    }
    @Override
    public void contar(){
        total++;
    }
    @Override
    public void cadastrarDados(){
        String sal,sal1;
        super.setNome(JOptionPane.showInputDialog(null,"Digite seu Nome"));
        super.setIdade(JOptionPane.showInputDialog(null,"Digite seu Idade"));
        sal = JOptionPane.showInputDialog(null,"Digite seu Salário");
        super.setSalario(Double.parseDouble(sal));
        super.setUltimo_emprego(JOptionPane.showInputDialog(null,"ultimo emprego"));
        sal1= JOptionPane.showInputDialog(null,"Informe o valor inss");
        super.setValor_inss(Double.parseDouble(sal1));
        
                
        
               
    }
    @Override
    public void imprimir(){
        JOptionPane.showMessageDialog(null,"valor calculo-inss"+calculo(salario));
        JOptionPane.showMessageDialog(null, "Nome: " + super.getNome() + "\nIdade:" + super.getIdade()+"\nUltimo Emprego"+super.getUltimo_emprego()+"valor_inss"+super.getValor_inss()+"salario"+super.getSalario());
        
    }
    public void compra(double valor,String nome){
   
       
           
    }
        
}