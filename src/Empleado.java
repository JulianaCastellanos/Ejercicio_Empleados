public class Empleado {


    protected String nombre;
    protected int edad;
    protected double salarioBase;

    public Empleado() {
    }

    public Empleado(String nombre, int edad, double salarioBase) {
        this.nombre = nombre;
        this.edad = edad;
        this.salarioBase = salarioBase;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", salarioBase=" + salarioBase +
                '}';
    }

    //Métodos

    public String  mostrarInfo (){
        return "Empleado: " +
                "\n nombre: " + nombre +
                "\n edad: " + edad +
                "\n salario base: " + salarioBase;
    }

    public double calcularSalario (){
        double salario = salarioBase;
        return salario;
    }

    public double aumentarSalario (double aumento){
        salarioBase += aumento;
        return salarioBase;
    }

    public double aumentarExtra (double aumentar){
        return salarioBase;
    }

}
