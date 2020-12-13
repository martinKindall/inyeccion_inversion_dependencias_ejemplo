public class Gato {

    public int edad;
    public int pesoKg;
    private Veterinario veterinario;

    public Gato(
            Veterinario veterinario,
            int edad,
            int pesoKg) {
        this.edad = edad;
        this.pesoKg = pesoKg;
        this.veterinario = veterinario;
    }

    public boolean esUnGatoSaludable() {
        boolean diagnostico = veterinario.diagnosticar(this);
        return diagnostico;
    }
}
