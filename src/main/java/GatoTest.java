
public class GatoTest {

    public static void main(String[] args) {

        Veterinario vet = new Veterinario();

        Gato unGato = new Gato(vet, 1, 5);

        assert unGato.esUnGatoSaludable();  // falla si es false

        Gato unGatoMuyViejo = new Gato(vet, 16, 5);

        assert unGatoMuyViejo.esUnGatoSaludable();
    }
}
