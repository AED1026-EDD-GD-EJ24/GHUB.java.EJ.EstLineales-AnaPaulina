package miPrincipal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args)throws PosicionIlegalException {
      Scanner consola = new Scanner(System.in);
      int opc =0;
      do{
          System.out.println("*************************");
          System.out.println("  Estructuras Lineales   ");
          System.out.println("*************************");
          System.out.println(" 1) Pila");
          System.out.println(" 2) Stack");
          System.out.println(" 3) Delimitadores");
          System.out.println(" 4) Expresion Infija-Prefija");
          System.out.println(" 5) Cola");
          System.out.println(" 6) Queue");
          System.out.println(" 7) Tablas de Dispersion");
          System.out.println(" 8) Estructura combinada");
          System.out.println(" 9) Lista simple");
          System.out.println("10) ArrayList yLinkedList");
          System.out.println("11) ArrayList de personas");
          System.out.println("12) LinkedList Cuadrupedos");
          System.out.println("13) Lista de Contactos");
          System.out.println("14) Lista Doblemente Ligada");
          System.out.println("15) Lista Circular");
          System.out.println("16) Lista Doblemente Circular");

          System.out.println();

          System.out.println("0) SALIR");
          System.out.print("Selecciona opción:");
          opc=consola.nextInt();
          switch (opc){
              case 1:
                 DemoPila.menu();
                 break;
              case 2:
                 DemoStack.menu();
                 break;
              case 3:
                 DemoDelimitador.menu();
                 break;
              case 4:
                 //tarea
              case 5:
                 DemoCola.menu();
                 break;
              case 6:
                 DemoQueue.menu();
                 break;
              case 7:
                 DemoTablaDispersion.menu(); break;
                case 8: 
                DemoEstCombinada.menu();break;
                case 9:
                DemoListaSimple.menu();break;
                case 10:
                DemoArrayListyLinkedList.menu();break;
               case 11:
               DemoArrayListPersonas.menu(); break;
               case 12:
               DemoLinkedListCuadrupedos.menu(); break;
               case 13:
               DemoListaDeContactos.menu(); break;
               case 14:
               DemoListaDobleLigada.menu(); break;
               case 15:
               DemoListaCircular.menu(); break;
               case 16:
               DemoListaDobleCircular.menu(); break;

              case 0:
                  System.out.println("ADIOS!");
                  //consola.close();
                  break;
              default:
                  System.out.println("Valor incorrecto, intente de nuevo!");
          }

      } while (opc != 0);

  }
  
}
