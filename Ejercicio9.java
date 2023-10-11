public class Ejercicio9 {
    public static void main(String[] args) {
        System.out.println("Vamos a resolver una ecuación de segundo grado del tipo ax2 + bx + c = 0");
        System.out.print("Introduzca el valor de a: ");
        Double a = Double.parseDouble(System.console().readLine());
        System.out.print("Introduzca el valor de b: ");
        Double b = Double.parseDouble(System.console().readLine());
        System.out.print("Introduzca el valor de c: ");
        Double c = Double.parseDouble(System.console().readLine());
        double raiz;
        raiz = ((b*b)-4*a*c);
        if (a==0&&b==0&&c==0) {
            System.out.println("Esta ecuación tiene infinitas soluciones, puesto que 0=0");
        } else {
            if (a!=0&&b!=0&&c==0) {
                System.out.println("x = 0 y x = "+(-b/a));
            }
            if (a==0&&b!=0&&c!=0){
                System.out.println("x = "+(-c/b));
            }
            if(a==0&&b==0&&c!=0){
                System.out.println("La ecuación no tiene soluciones");
            }
            if (a!=0&b!=0&c!=0){
                if (raiz<0) {
                    System.out.println("La ecuación no tiene solución de número reales");
                } else {
                    System.out.println("x = "+((-b+Math.sqrt(raiz)/2*a))+" y x = "+((-b-Math.sqrt(raiz)/2*a)));
                }
            }
        }
    }
}
