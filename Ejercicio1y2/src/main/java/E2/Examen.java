package E2;

public class Examen {
    public static void main (String [] args){
        case1();
    }

    /*
    * Justificación: Añadimos un bloque try en el código donde se podría lanzar una excepción.
    * Cachamos la excepción, agregamos su tipo e imprimimos el mensaje de error
    * */
    public static void case1(){
        System.out.println("Intentamos ejecutar el bloque de instrucciones:");
        System.out.println("Instrucción 1.");
        try{
            int n = Integer.parseInt("M"); //error forzado en tiempo de ejecución.
            System.out.println("Instrucción 2.");
            System.out.println("Instrucción 3, etc.");
        }catch(NumberFormatException error){
            System.out.println("Falla debido a: "+error.getMessage());
        }
    }

}

