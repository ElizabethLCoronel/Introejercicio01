public class Main {
    public static void main(String[] args) {

        suma (12, 4, 8);

        Coche miCoche = new Coche();

        miCoche.TotPuertas();
        miCoche.TotPuertas();
        miCoche.TotPuertas();
        System.out.println("El numero total de puertas es: " + miCoche.numPuertas);

    }
    public static void suma (int a, int b, int c){
        int total = 0;
        total = a + b + c;
        System.out.println("La suma es: " + total);
    }
}
class Coche {
    public int numPuertas = 2;

    public void TotPuertas(){
        this.numPuertas++;
    }
}