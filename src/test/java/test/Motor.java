package test;

public class Motor {
    Integer numeroCilindros;
    String tipo;
    Integer registro;
    public static void main(String[] args) {
        
    }

    public void cambiarRegistro(int nuevoRegistro) {
        this.registro = nuevoRegistro;
        
    }

    public void asignarTipo(String nuevoTipo) {
        if (nuevoTipo.equals("electrico") || nuevoTipo.equals("gasolina") ) {
            this.tipo = nuevoTipo;
        }
    }
}
