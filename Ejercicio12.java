import java.util.Scanner;
public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int punto = 0;
        System.out.println("Cuestionario básico");
        System.out.println("1. De que esta compueso el sistema informatico:   a)Software  b)Hardware  c)Ambos");
        System.out.print("   Respuesta: ");
        String uno = sc.nextLine();
        uno.toLowerCase();
        if (uno.equals("c")) {
            System.out.println("   Correcta");
            punto++;
        } else {
            System.out.println("   Incorrecto");
        }
        System.out.println("2. ¿Como definimos un numero real con dos decimales en JAVA?:   a)int  b)double  c)float");
        System.out.print("   Respuesta: ");
        String dos = sc.nextLine();
        dos.toLowerCase();
        if (dos.equals("b")) {
            System.out.println("   Correcta");
            punto++;
        } else {
            System.out.println("   Incorrecto");
        }
        System.out.println("3. ¿En el lenguaje HTML5 cual encabezado es mas grande?:   a)h1  b)h3  c)h2");
        System.out.print("   Respuesta: ");
        String tres = sc.nextLine();
        tres.toLowerCase();
        if (tres.equals("a")) {
            System.out.println("   Correcta");
            punto++;
        } else {
            System.out.println("   Incorrecto");
        }
        System.out.println("4. ¿Cual de los siguientes es un lenguaje de marcas?:   a)HTML  b)JAVA  c)PHP");
        System.out.print("   Respuesta: ");
        String cuatro = sc.nextLine();
        cuatro.toLowerCase();
        if (cuatro.equals("a")) {
            System.out.println("   Correcta");
            punto++;
        } else {
            System.out.println("   Incorrecto");
        }
        System.out.println("5. ¿Cual abreviación sirve para introducir datos lógicos?:   a)Float  b)Boolean  c)String");
        System.out.print("   Respuesta: ");
        String cinco = sc.nextLine();
        cinco.toLowerCase();
        if (cinco.equals("b")) {
            System.out.println("   Correcta");
            punto++;
        } else {
            System.out.println("   Incorrecto");
        }
        System.out.println("6. En base de datos, ¿cual correspondencia es mayor?:   a)1:1  b)1:0  c)1:n");
        System.out.print("   Respuesta: ");
        String seis = sc.nextLine();
        seis.toLowerCase();
        if (seis.equals("c")) {
            System.out.println("   Correcta");
            punto++;
        } else {
            System.out.println("   Incorrecto");
        }
        System.out.println("7. ¿Que tipo de organizacion de fichero, va accediendo de uno en uno a los registros?:   a)Sencuencial  b)Directa  c)Secuencial Indexada");
        System.out.print("   Respuesta: ");
        String siete = sc.nextLine();
        siete.toLowerCase();
        if (siete.equals("a")) {
            System.out.println("   Correcta");
            punto++;
        } else {
            System.out.println("   Incorrecto");
        }
        System.out.println("8. Cual tarea se hace al final en la modelación de un base de datos:   a)DLD  b)DFD  c)DCD");
        System.out.print("   Respuesta: ");
        String ocho = sc.nextLine();
        ocho.toLowerCase();
        if (ocho.equals("b")) {
            System.out.println("   Correcta");
            punto++;
        } else {
            System.out.println("   Incorrecto");
        }
        System.out.println("9. ¿Qué significa las siglas RAM?:   a)Random Memory Access  b)Random Memorial Access  c)Random Memory Accept");
        System.out.print("   Respuesta: ");
        String nueve = sc.nextLine();
        nueve.toLowerCase();
        if (nueve.equals("a")) {
            System.out.println("   Correcta");
            punto++;
        } else {
            System.out.println("   Incorrecto");
        }
        System.out.println("10. ¿En qué unida se mide la tecnología del procesador?:   a)Nm  b)Cm  c)Mm");
        System.out.print("   Respuesta: ");
        String diez = sc.nextLine();
        diez.toLowerCase();
        if (diez.equals("a")) {
            System.out.println("   Correcta");
            punto++;
        } else {
            System.out.println("   Incorrecto");
        }

        System.out.print("Tu puntuación es igual a: "+punto);
        sc.close();
    }
}
