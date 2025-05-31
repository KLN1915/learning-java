public class Empleado extends Persona{
    int codigo_empresa;
    String cargo;
    Double suledo;

    public Empleado(){}

    public Empleado(int codigo_empresa, String cargo, Double suledo) {
        this.codigo_empresa = codigo_empresa;
        this.cargo = cargo;
        this.suledo = suledo;
    }

    public Empleado(int id, String dni, String nombre, String apellido, String domicilio, String telefono, int codigo_empresa, String cargo, Double suledo) {
        super(id, dni, nombre, apellido, domicilio, telefono);
        this.codigo_empresa = codigo_empresa;
        this.cargo = cargo;
        this.suledo = suledo;
    }

    public int getCodigo_empresa() {
        return codigo_empresa;
    }

    public void setCodigo_empresa(int codigo_empresa) {
        this.codigo_empresa = codigo_empresa;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSuledo() {
        return suledo;
    }

    public void setSuledo(Double suledo) {
        this.suledo = suledo;
    }
}
