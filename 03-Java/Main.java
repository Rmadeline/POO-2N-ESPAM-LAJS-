public class Main {
    public static void main(String[] args) {
        System.out.println("=== CASO VÁLIDO ===");
        try {
            // Creación exitosa de un lote apto
            LoteAtun loteValido = new LoteAtun("LOTE-2026-001", 2.5, 150.0);
            loteValido.mostrarInformacion();
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\n=== CASO INVÁLIDO ===");
        try {
            // Intento de instanciar un lote no apto (temperatura > 4.0 °C)
            LoteAtun loteInvalido = new LoteAtun("LOTE-2026-002", 6.5, 200.0);
            loteInvalido.mostrarInformacion();
        } catch (IllegalArgumentException e) {
            System.out.println("Excepción capturada correctamente: " + e.getMessage());
        }
    }
}
