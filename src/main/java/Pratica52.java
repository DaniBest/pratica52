
import utfpr.ct.dainf.if62c.pratica.Equacao2Grau;

/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * IF62C - Fundamentos de Programação 2
 * 
 * @author Daniel Anderson de Freitas
 */

//continuar a partir do ponto 3.

public class Pratica52 {
    public static void main(String[] args) {
//        System.out.println("Olá, Java!");
        
        Integer a = 1;
        Integer b = -5;
        Integer c = 6;
        Equacao2Grau<Integer> eq1 = new Equacao2Grau<>(a, b, c);
        
        try {
            double r1 = eq1.getRaiz1();
            double r2 = eq1.getRaiz2();
            System.out.println("As raízes da equação 1 são: " + r1 + " e " + r2);
        } catch(RuntimeException ex) {
            System.out.println(ex.getLocalizedMessage() + ". Equação 1");
        }
        
        Integer d = 1;
        Integer e = 2;
        Integer f = 1;
        Equacao2Grau<Integer> eq2 = new Equacao2Grau<>(d, e, f);
        
        try {
            double r3 = eq2.getRaiz1();
            double r4 = eq2.getRaiz2();
            System.out.println("As raízes da equação 2 são: " + r3 + " e " + r4);
        } catch(RuntimeException ex) {
            System.out.println(ex.getLocalizedMessage() + ". Equação 2");
        }
        
        Integer g = 2;
        Integer h = 0;
        Integer i = 2;
        Equacao2Grau<Integer> eq3 = new Equacao2Grau<>(g, h, i);
        
        try {
            double r5 = eq3.getRaiz1();
            double r6 = eq3.getRaiz2();
            System.out.println("As raízes da equação 3 são: " + r5 + " e " + r6);
        } catch(RuntimeException ex) {
            System.out.println(ex.getLocalizedMessage() + ". Equação 3");
        }
                
    }
}
