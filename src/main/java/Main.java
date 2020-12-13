public class Main {

    public static void main(String[] args) {
        Gato miGato = new Gato(new Veterinario(), 4, 8);

        boolean estaSano = miGato.esUnGatoSaludable();

        if (estaSano) {
            System.out.println("Mi gato esta sano :)");
        } else {
            System.out.println("Mi gato debe bajar de peso.");
        }
    }
}
