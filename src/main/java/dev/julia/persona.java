package dev.julia;




public class persona {
    private String nombre;
    private String apellido;
    private String numeroDocumento;
    private int anioNacimiento;


    public persona(String nombre, String apellido, String numeroDocumento, int anioNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroDocumento = numeroDocumento;
        this.anioNacimiento = anioNacimiento;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public int getAnioNacimiento() {
        return anioNacimiento;
    }

    public void setAnioNacimiento(int anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }

    // Método para imprimir los valores de los atributos
    public void imprimirInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Número de documento: " + numeroDocumento);
        System.out.println("Año de nacimiento: " + anioNacimiento);
    }

    public static void main(String[] args) {
        // Crear dos personas
        persona persona1 = new persona("Juan", "Pérez", "12345678", 1990);
        persona persona2 = new persona("María", "González", "98765432", 1985);

        // Mostrar los valores de sus atributos
        System.out.println("Datos de la primera persona:");
        persona1.imprimirInformacion();

        System.out.println("\nDatos de la segunda persona:");
        persona2.imprimirInformacion();
    }
}
