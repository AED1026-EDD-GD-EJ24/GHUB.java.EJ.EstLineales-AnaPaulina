package miPrincipal;
/*Proposito: crear arraylist de objetos personas, crearemos mil obj personas deforma 
 * aleatoria considerando q sus alturas fluctuen entre 100 y 200cm
 * finalmente mostrar por consola todos los obj creados asi como la media de sus alturas
 */
import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import java.util.Iterator;
import personas.Persona;
public class DemoArrayListPersonas {
    public static void menu(){
        System.out.println("************************");
        System.out.println("  ARRAY LIST  ");
        System.out.println("   PERSONAS  ");
        System.out.println("************************");
        System.out.println();
        try {
            List<Persona> lp =new ArrayList<Persona>();
            Random r= new Random();
            Persona temp=null;
            int sumaaltura=0;
            for (int i = 0; i < 1000; i++) {
                lp.add(new Persona(i, "Persona "+i, r.nextInt(100)+100));  
            }
            Iterator <Persona> it= lp.iterator();
            while (it.hasNext()) {
                temp=it.next();
                System.out.println(temp);
                sumaaltura+=temp.getAltura();
            }
            System.out.println("La media del conjnto de personas= "+sumaaltura/lp.size());
    
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
   
}
