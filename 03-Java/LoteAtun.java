public class LoteAtun {
    // Atributos de la clase
    private String codigoLote;
    private double temperatura; // Debe ser <= 4.0 °C
    private double peso;        // Debe ser > 0

    // 1. CONSTRUCTOR POR DEFECTO
    public LoteAtun() {
        this("LOTE-DEF-000", 0.0, 10.0); // Encadenamiento con this(...)
    }

    // 2. CONSTRUCTOR SOBRECARGADO Y PARAMETRIZADO CON VALIDACIÓN FAIL-FAST
    public LoteAtun(String codigoLote, double temperatura, double peso) {
        // Validación de Invariantes (Fail-Fast)
        if (temperatura > 4.0) {
            throw new IllegalArgumentException("Error Fail-Fast: La temperatura (" + temperatura + "°C) debe ser menor o igual a 4.0 °C.");
        }
        if (peso <= 0) {
            throw new IllegalArgumentException("Error Fail-Fast: El peso (" + peso + " kg) debe ser mayor a 0.");
        }

        // Desambiguación de ámbito de atributos con la palabra reservada 'this'
        this.codigoLote = codigoLote;
        this.temperatura = temperatura;
        this.peso = peso;
    }

    // Método para mostrar la información del lote que hemos creado
public void mostrarInformacion() {
        System.out.println("Lote [Código: " + this.codigoLote + 
                           ", Temp: " + this.temperatura + "°C, Peso: " + this.peso + " kg]");
    }
}