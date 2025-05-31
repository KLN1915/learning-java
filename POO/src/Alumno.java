public class Alumno {
    //atributos
    int id;
    String nombre;
    String apellido;

    //constructor vacio
    public Alumno(){}

    //constructor
    public Alumno(int id, String nombre, String apellido){
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    //getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    //metodos
    public void mostrarNombre(){
        System.out.println("Hola, soy un alumno");
    }
}
