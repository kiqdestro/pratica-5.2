
import utfpr.ct.dainf.if62c.pratica.Equacao2Grau;

/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * IF62C - Fundamentos de Programação 2
 * 
 * Template de projeto de programa Java usando Maven.
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 */
public class Pratica52 {
    public static void main(String[] args) {
        try{
        Equacao2Grau duasRaizes = new Equacao2Grau (1, -2, -3);
        Equacao2Grau umaRaiz = new Equacao2Grau (1, 4, 4);
        Equacao2Grau semRaizes = new Equacao2Grau (2, 1, 4);
        
        double Eq1Raiz1, Eq1Raiz2;
        double Eq2Raiz1, Eq2Raiz2;
        double Eq3Raiz1, Eq3Raiz2;
        
        Eq1Raiz1 = duasRaizes.getRaiz1();
        Eq1Raiz2 = duasRaizes.getRaiz2();
        System.out.println("Raizes primeira equacao: " + Eq1Raiz1 + " e " + Eq1Raiz2);
        
        Eq2Raiz1 = umaRaiz.getRaiz1();
        Eq2Raiz2 = umaRaiz.getRaiz2();
        System.out.println("Raizes segunda equacao: " + Eq2Raiz1 + " e "+ Eq2Raiz2);
        
        Eq3Raiz1 = semRaizes.getRaiz1();
        Eq3Raiz2 = semRaizes.getRaiz2();
        System.out.println("Raizes terceira equacao:" + Eq3Raiz1 +" e " + Eq3Raiz2);
        
        } 
        catch (RuntimeException e){
        System.out.println(e.getLocalizedMessage());
        }           
    }
}