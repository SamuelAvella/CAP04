import java.util.Scanner;
public class Ejerciciorepaso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vamos a compar el IMC de dos personas, a continuación le pedire diversos datos de dichas personas:");
        System.out.println("Ahora introduce los datos de la primera persona");
        System.out.print("Nombre primera persona: ");
        String nombre1 = sc.nextLine();
        System.out.print("Apellidos primera persona: ");
        String apellidos1 = sc.nextLine();
        System.out.print("Edad primera persona: ");
        int edad1 = Integer.parseInt(System.console().readLine());
        System.out.print("Altura primera persona en m: ");
        double altura1 = Double.parseDouble(System.console().readLine());
        System.out.print("Peso primera persona en KG: ");
        double peso1 = Double.parseDouble(System.console().readLine());
        System.out.println("Ahora introduce los datos de la segunda persona");
        System.out.printf("Nombre segunda persona: ");
        String nombre2 = sc.nextLine();
        System.out.print("Apellidos segunda persona: ");
        String apellidos2 = sc.nextLine();
        System.out.print("Edad segunda persona: ");
        int edad2 = Integer.parseInt(System.console().readLine());
        System.out.print("Altura segunda persona en m: ");
        double altura2 = Double.parseDouble(System.console().readLine());
        System.out.print("Peso segunda persona en KG: ");
        double peso2 = Double.parseDouble(System.console().readLine());
        int longnom = Math.max(nombre1.length(),nombre2.length());
        int longape = Math.max(apellidos1.length(),apellidos2.length());
        longnom++;
        longape++;
        double IMC1 = peso1/(altura1*altura1);
        double IMC2 = peso2/(altura2*altura2);
        System.out.printf("%-"+longnom+"s"+"%-"+longape+"s %-7s %-11s %-11s %-7s\n","Nombre","Apellido","Edad","Altura","Peso","IMC");
        System.out.printf("-----------------------------------------------------------------\n");
        System.out.printf("%-"+longnom+"s %-"+longape+"s %-6d %-10.2f %-10.2f %-6.2f\n",nombre1,apellidos1,edad1,altura1,peso1,IMC1);
        System.out.printf("%-"+longnom+"s %-"+longape+"s %-6d %-10.2f %-10.2f %-6.2f\n",nombre2,apellidos2,edad2,altura2,peso2,IMC2);
        System.out.printf("-----------------------------------------------------------------\n");
        if (IMC1>=30) {
            System.out.printf("El índice de masa corporal de %s %s es %.2f (obesidad).\n",nombre1,apellidos1,IMC1);
        }
        if (IMC1<=29.9&IMC1>=25) {
            System.out.printf("El índice de masa corporal de %s %s es %.2f (peso superior al normal).\n",nombre1,apellidos1,IMC1);
        }     
        if (IMC1<=25.9&IMC1>=18.5) {
            System.out.printf("El índice de masa corporal de %s %s es %.2f (peso normal).\n",nombre1,apellidos1,IMC1);
        }        
        if (IMC1<18.4) {
            System.out.printf("El índice de masa corporal de %s %s es %.2f (peso inferior al normal).\n",nombre1,apellidos1,IMC1);
        }
        if (IMC2>=30) {
            System.out.printf("El índice de masa corporal de %s %s es %.2f (obesidad).\n",nombre2,apellidos2,IMC2);
        }
        if (IMC2<=29.9&IMC2>=25) {
            System.out.printf("El índice de masa corporal de %s %s es %.2f (peso superior al normal).\n",nombre2,apellidos2,IMC2);
        }     
        if (IMC2<=25.9&IMC2>=18.5) {
            System.out.printf("El índice de masa corporal de %s %s es %.2f (peso normal).\n",nombre2,apellidos2,IMC2);
        }        
        if (IMC2<18.4) {
            System.out.printf("El índice de masa corporal de %s %s es %.2f (peso inferior al normal).\n",nombre2,apellidos2,IMC2);
        }
        sc.close();
    }
}
