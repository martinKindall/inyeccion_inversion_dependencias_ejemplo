
public class GatoTest {

    public static void main(String[] args) {

        Gato unGato = new Gato(1, 5);

        assert unGato.esUnGatoSaludable();  // falla si es false

        Gato unGatoMuyViejo = new Gato(16, 5);

        assert unGatoMuyViejo.esUnGatoSaludable();
    }
}
