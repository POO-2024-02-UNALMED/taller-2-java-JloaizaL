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
        cantidad = 0; // Inicializamos el contador en 0

        // Recorremos cada elemento en el array asientos
        for (Asiento asiento : asientos) {
            if (asiento != null) {  // Verifica si el asiento no es null
                cantidad++;         // Si es un objeto Asiento, incrementamos el contador
            }
        }

        return cantidad;  // Retornamos la cantidad total de asientos que no son null
    }

    public String verificarIntegridad() {
        // Verificar que el registro del motor coincida con el del auto
        if (!this.registro.equals(motor.registro)) {
            return "Las piezas no son originales";
        }

        // Verificar que el registro de cada asiento coincida con el del auto
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
