public class EmpleadoVentas extends Empleado{

    private double totalVentasMes;
    private double comision;

    public EmpleadoVentas() {
    }

    public EmpleadoVentas(String nombre, int edad, double salarioBase, double totalVentasMes, double comision) {
        super(nombre, edad, salarioBase);
        this.totalVentasMes = totalVentasMes;
        this.comision = comision;
    }

    public double getTotalVentasMes() {
        return totalVentasMes;
    }

    public void setTotalVentasMes(double totalVentasMes) {
        this.totalVentasMes = totalVentasMes;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    @Override
    public String toString() {
        return "EmpleadoVentas{" +
                "totalVentasMes=" + totalVentasMes +
                ", comision=" + comision +
                '}';
    }

    public String  mostrarInfo (){
        return "Empleado: " +
                "\n nombre: " + nombre +
                "\n edad: " + edad +
                "\n salario Base=" + salarioBase +
                "\n Total ventas del mes: " + totalVentasMes +
                "\n Porcentaje de comisión: " + comision + "%";
    }

    public double calcularSalario (){
        double salario = salarioBase + totalVentasMes*(comision/100);
        return salario;
    }

    public double aumentarExtra (double aumentar){
        comision += aumentar;
        return comision;
    }

}
