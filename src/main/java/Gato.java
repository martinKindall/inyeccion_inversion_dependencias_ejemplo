public class Gato {

    public int edad;
    public int pesoKg;
    private Diagnosticador diagnosticador;

    public Gato(
            Diagnosticador diagnosticador,
            int edad,
            int pesoKg) {
        this.edad = edad;
        this.pesoKg = pesoKg;
        this.diagnosticador = diagnosticador;
    }

    public boolean esUnGatoSaludable() {
        boolean diagnostico = diagnosticador.diagnosticar(this);
        return diagnostico;
    }
}
