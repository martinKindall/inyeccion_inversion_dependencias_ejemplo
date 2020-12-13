public class Gato {

    public int edad;
    public int pesoKg;

    public Gato(int edad, int pesoKg) {
        this.edad = edad;
        this.pesoKg = pesoKg;
    }

    public boolean esUnGatoSaludable() {
        boolean diagnostico = Veterinario.diagnosticar(this);
        return diagnostico;
    }
}
