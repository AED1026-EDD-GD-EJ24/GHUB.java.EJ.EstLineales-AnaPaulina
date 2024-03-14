package miPrincipal;

public class DemoDelimitador {
    public static void menu(){
        System.out.println("************************");
        System.out.println("      Delimitadores     ");
        System.out.println("************************");
        System.out.println();

        Delimitadores objDel = new Delimitadores();
        String expr= "(a+b)/2";
        if (objDel.equals(expr)) {
            System.out.println("Expresión correcta");
        }else
            System.out.println("Expresión incorrecta");

    }

    
}