package test;

public class Auto {
    static int cantidadCreados;
    String modelo;
    Integer precio;
    Asiento[] asientos;
    String marca;
    Motor motor;
    Integer registro;
    public static void main(String[] args) {
        
    }
    
    public int cantidadAsientos() {
        int cantidad = 0;
        for (Asiento asiento : asientos) {
            if (asiento != null) {
                cantidad++;
            }
        }

        return cantidad;
    }

    public String verificarIntegridad() {
        if (!this.registro.equals(motor.registro)) {
            return "Las piezas no son originales";
        }

        for (Asiento asiento : asientos) {
            if (asiento != null && !this.registro.equals(asiento.registro)) {
                return "Las piezas no son originales";
            }
        }

        return "Auto original";
    }

    public Auto() {
        cantidadCreados++;  // Incrementa cada vez que se crea un nuevo Auto
    }
    
}
