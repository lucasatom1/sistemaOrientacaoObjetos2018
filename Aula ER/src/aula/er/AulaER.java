
package aula.er;

/**
 *
 * @author aluno
 */
public class AulaER {

   
    public static void main(String[] args) {
        ExpressaoRegular ER = new ExpressaoRegular();
        
        //teste 1, expressao regular: DIGITOS
      //  ER.confere(ER.DIGITOS, "00051120021");
       
       // teste 2, expressao regular:LETRAS 
        
     // ER.confere(ER.LETRAS, "ASDFEAFdafsafdsf");
        
        ER.confere(ER.DATA, "5/12/2000");
        
     //ER.confere(ER.REAL, "4.51E21");
        

     // ER.confere(ER.VETOR, "vet[2]");
    }
    
}
