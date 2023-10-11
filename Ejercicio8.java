import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor escriba tres notas de examenes separadas por espacios: ");
        double primera = sc.nextDouble();
        double segunda = sc.nextDouble();
        double tercera = sc.nextDouble();
        double media = (primera+segunda+tercera)/3;
        if (media>=9) {
            System.out.printf("La media de %.2f %.2f y %.2f es %.2f, es decir, un sobresaliente.\n",primera,segunda,tercera,media);
        }
        if (media<=8&media>=7) {
            System.out.printf("La media de %.2f %.2f y %.2f es %.2f, es decir, un notable.\n",primera,segunda,tercera,media);
        }     
        if (media>=6&media<7) {
            System.out.printf("La media de %.2f %.2f y %.2f es %.2f, es decir, un bien.\n",primera,segunda,tercera,media);
        }        
        if (media>=5&media<6) {
            System.out.printf("La media de %.2f %.2f y %.2f es %.2f, es decir, un suficiente.\n",primera,segunda,tercera,media);
        }
        if (media<5){
            System.out.printf("La media de %.2f %.2f y %.2f es %.2f, es decir, un insuficiente.\n",primera,segunda,tercera,media);
        }                
        sc.close();
    }
}
