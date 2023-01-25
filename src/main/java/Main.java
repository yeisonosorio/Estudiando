import java.util.*;

public class Main {


    public static void main(String[] args) {

        /**
         //creamos la lista
         List<Persona> lista = new ArrayList<Persona>();
         //agg la persona con el objeto
         lista.add(new Persona(1, "pedro", 2));
         lista.add(new Persona(2, "juan", 3));
         lista.add(new Persona(3, "yeison", 4));
         lista.add(new Persona(4, "yuli", 5));


         for (int i = 0; i < lista.size(); i++) {
         System.out.println("prueba:" + lista.get(2).getNombre());
         }

         System.out.println("----------------------------separando-----------------");


         for (Persona perso : lista) {
         System.out.println("prueba" + perso.getNombre());

         }

         //probando las listas
         */

        /**
         * importamos la linkendList

         List<Persona> lista = new LinkedList<>();


         //agg la persona con el objeto
         lista.add(new Persona(1, "pedro", 2));
         lista.add(new Persona(2, "juan", 3));
         lista.add(new Persona(3, "yeison", 4));
         lista.add(new Persona(4, "yuli", 5));

         //agragar al principio

         lista.add(0, new Persona(1, "juan probando", 12));


         System.out.println("------------------se recorre con el forEach-----------------");


         for (Persona perso : lista) {
         System.out.println("prueba" + " :  " + perso.getNombre());

         }



         */


        //declarar un array
        String[] personas = new String[4];
        //lo inicializamos

        personas[0] = "juan";
        personas[1] = "pedro";
        personas[2] = "jului";
        personas[3] = "yuli";

        for (int i = 0; i < personas.length; i++) {
            System.out.println("prueba: " + personas[i]);

        }

    }


}

