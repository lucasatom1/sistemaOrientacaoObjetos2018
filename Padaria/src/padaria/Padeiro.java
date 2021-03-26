
package Padaria;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Padeiro extends Empregado implements Interface  {
    private String nome;
    private int idade;
    private  double pis;
    private String ultimo_emprego;
    private double valor_inss;
    private double salario;
    private double produção;

    public Padeiro(String nome,String idade,double pis,String ultimo_emprego,double valor_inss,double salario,double produção) {
        super(nome, idade, pis, ultimo_emprego, valor_inss, salario);
        this.produção=this.produção;
    }
    public Padeiro() {
        super();
        this.produção=this.produção;
    }

    /**
     * @return the produção
     */
    public double getProdução() {
        return produção;
    }

    /**
     * @param produção the produção to set
     */
    public void setProdução(double produção) {
        this.produção = produção;
    }
    
    @Override
     public  double calculo(double  salario){
        double desconto1,valor;
        if(salario>=2000){
            desconto1 = salario*0.1;
            valor=salario-desconto1;
            return valor;
        }else
                        desconto1 = salario*0.4;
                        valor=(desconto1)-(salario);
                        return valor;
    }
    @Override
    public void contar(){
        total++;
    }
    @Override
     public void cadastrarDados(){
        String entrada;
        double sal4;
        String sal,sal1,sal2;
        super.setNome(JOptionPane.showInputDialog(null,"Digite seu Nome"));
        super.setIdade(JOptionPane.showInputDialog(null,"Digite seu Idade"));
        entrada = JOptionPane.showInputDialog(null,"Salário");
        sal4 = Double.parseDouble(entrada);
        super.setSalario(sal4);
        super.setUltimo_emprego(JOptionPane.showInputDialog(null,"ultimo emprego"));
        sal1= JOptionPane.showInputDialog(null,"Informe o valor inss");
        super.setValor_inss(Double.parseDouble(sal1)); 
        sal2 = JOptionPane.showInputDialog(null,"\ninforme a produção do padeiro:");
        this.produção=Double.parseDouble(sal2);
    }
    @Override
     public void imprimir(){
        
        JOptionPane.showMessageDialog(null, "Nome: " + super.getNome() + "\nIdade:" + super.getIdade()+"\nUltimo Emprego"+ getUltimo_emprego() +"valor_inss"+ getValor_inss() +"salario"+ getSalario() +"\nprodução"+ getProdução());
    }
    
     public void escrever() throws IOException{
             String nome1 = JOptionPane.showInputDialog("Nome");
             
             FileWriter arq = new FileWriter("padaria.txt"); 
             PrintWriter gravarArq = new PrintWriter(arq);
             gravarArq.print(nome1);
             arq.close();
             
             
             try{
                 FileReader f = new FileReader("padaria.txt");
                 Scanner arquivoLido = new Scanner(f);
        arquivoLido.useDelimiter(","); //vai ler até ponto e virgula
        //String aux = arquivoLido.next();

        while(arquivoLido.hasNext()) //enquanto tiver proxima palavra
        {
            String lido = arquivoLido.next();
            System.out.println(lido);
        }
       arquivoLido.close();
         }catch(Exception a){
         JOptionPane.showMessageDialog(null,"Coloque o nome do arquivo correto " + a);

        } 
             }
            
             
    
     }            
           

