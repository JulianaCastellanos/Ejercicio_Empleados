public class EmpleadoHoras extends Empleado{

    private int horastrabajadas;
    private double valorhora;

    public EmpleadoHoras() {
    }

    public EmpleadoHoras(String nombre, int edad, double salarioBase, int horastrabajadas, double valorhora) {
        super(nombre, edad, salarioBase);
        this.horastrabajadas = horastrabajadas;
        this.valorhora = valorhora;
    }

    public int getHorastrabajadas() {
        return horastrabajadas;
    }

    public void setHorastrabajadas(int horastrabajadas) {
        this.horastrabajadas = horastrabajadas;
    }

    public double getValorhora() {
        return valorhora;
    }

    public void setValorhora(double valorhora) {
        this.valorhora = valorhora;
    }

    @Override
    public String toString() {
        return super.toString() + "EmpleadoHoras{" +
                "horastrabajadas=" + horastrabajadas +
                ", valorhora=" + valorhora +
                '}';
    }

    public String  mostrarInfo (){
        return "Empleado: "  +
                "\n Nombre: " + nombre +
                "\n Edad: " + edad +
                "\n Salario Base=" + salarioBase +
                "\n Horas Trabajadas: " + horastrabajadas +
                "\n Valor Hora: " + valorhora;
    }

}
