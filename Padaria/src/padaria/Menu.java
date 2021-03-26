
package Padaria;

import java.io.IOException;
import java.util.Random;
import javax.swing.JOptionPane;

public class Menu {
    public static void main(String[] args) throws IOException {
	int op, e = 0, c = 0;
        int a1,a2,a3,a4,a5,a6,a7,a8,a9,a10;
        a1=0;
        a2=0;
        a3=0;
        a4=0;
        a5=0;
        a6=0;
        a7=0;
        a8=0;
        a9=0;
        a10=0;
       // Padaria padaria = new Padaria();
       double valor[] = new double[1000];
       String nome[] = new String[1000];
        Padaria padaria[] = new Padaria[1000];
        Empregado empregado[] = new Empregado[1000];
        Caixa caixa[] = new Caixa[1000];
        Padeiro padeiro[] = new Padeiro[1000];
        Padeiro p  = new Padeiro("Lucas","32", 43, "dsa", 32, 32, 34);
        
        
        
         
        try{
            do {
                op = menu();
                switch (op) {
                    case 1:
                        padaria[a1] = new Padaria();
                        padaria[a1].cadastrarDados();
                        a1++;
                        break;
                    case 2:
                        empregado[a2] = new Empregado();
                        empregado[a2].cadastrarDados();
                        a2++;
                        break;
                    case 3:
                        caixa[a3] = new Caixa();
                        caixa[a3].cadastrarDados();
                        a3++;
                        break;
                    case 4:
                        padeiro[a4] = new Padeiro();
                        padeiro[a4].cadastrarDados();
                        a4++;
                    case 5:
                        if (a4 == 0) {
                            JOptionPane.showMessageDialog(null,"Nenhum padeiro cadastrado.");
                        } else {
                            for (int i = 0; i < a4; i++) {
                                padeiro[i].imprimir();
                            }
                        }
                        break;
                   case 6:
                        if (a3 == 0) {
                            JOptionPane.showMessageDialog(null,"Nenhum caixa cadastrado.");
                        } else {
                            for (int i = 0; i < a3; i++) {
                                caixa[i].imprimir();
                            }
                        }
                        break;
                   case 7:
                        if (a2 == 0) {
                            JOptionPane.showMessageDialog(null,"Nenhum empregado cadastrado.");
                        } else {
                            for (int i = 0; i < a2; i++) {
                                empregado[e].imprimir();
                            }
                        }
                        break;
                   case 8:
                        if (a1 == 0) {
                            JOptionPane.showMessageDialog(null,"Nenhum padaria cadastrado.");
                        } else {
                             for (int i = 0; i < a1; i++) {
                                padaria[e].imprimir();
                            }
                                                      
                        }
                   case 9:
                       JOptionPane.showMessageDialog(null, "\nCodigodaCompra:");
                       Random gerador = new Random();
                       int x = gerador.nextInt(101);
                       System.out.println(gerador.nextInt(101));
                       
                       
                        
                        break;
                    case 10:
                       p.escrever();
                       
                       
                       
                       
                        
                        break;
                    case 0:
                        op = 0;
                        break;
                    default:
                         JOptionPane.showMessageDialog(null,"Opção Inválida");
                        
                }
            } while (op != 0);
            
        }catch(Exception a){
         JOptionPane.showMessageDialog(null,"Só se executa com caracters Númericos " + a);

        }
        
    }
    public static int menu() {
        int x;

        Object[] op = { 0, 1, 2, 3, 4, 5, 6,7,8,9, 10};
        x = (int) JOptionPane.showInputDialog(null, "Digite uma opção:\n1- Cadastrar Padaria\n2- Cadastrar Empregado"
                + "\n3- Cadastrar Caixa\n4- Cadastra Padeiro\n5- Ver dados do Padeiro\n6- Ver dados do Caixa\n7- Verdados do empregado\n8- Ver dados da Padaria\n9-Codigo da Compra\n10-gravação\n0-Sair",
                "Menu", JOptionPane.QUESTION_MESSAGE,null,op,null);
        return x;
    }
}
