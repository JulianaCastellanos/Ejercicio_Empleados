public class EmpleadoAdministrativo extends Empleado{

    private double bonificacion;

    public EmpleadoAdministrativo() {
    }

    public EmpleadoAdministrativo(String nombre, int edad, double salarioBase, double bonificacion) {
        super(nombre, edad, salarioBase);
        this.bonificacion = bonificacion;
    }

    public double getBonificacion() {
        return bonificacion;
    }

    public void setBonificacion(double bonificacion) {
        this.bonificacion = bonificacion;
    }

    @Override
    public String toString() {
        return super.toString() + "EmpleadoAdministrativo{" +
                "bonificacion=" + bonificacion +
                '}';
    }

    //Métodos

    public String  mostrarInfo (){
        return "Empleado: " +
                "\n nombre: " + nombre +
                "\n edad: " + edad +
                "\n salario Base=" + salarioBase +
                "\n bonificación: " + bonificacion;
    }



}
