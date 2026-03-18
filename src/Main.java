import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Construir el menú interactivo que permita interactuar con las opciones
        // Crear, mostrar y buscar empleados

        List<Empleado> lstEmpleados = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);

        int op;
        do {

            System.out.println("\n------- Menu --------");

            System.out.println("\n1. Crear empleado");
            System.out.println("2. Mostrar empleados");
            System.out.println("3. Buscar empleado");
            System.out.println("4. Salir");

            System.out.println("\n Seleccione una opción");
            op = teclado.nextInt();

            switch (op){
                case 1:
                    System.out.println("Ingrese el nombre del empleado");
                    String nombree = teclado.next();
                    System.out.println("Ingrese la edad del empleado");
                    int edade = teclado.nextInt();
                    System.out.println("Ingrese el Salario Base del empleado");
                    double salarioe = teclado.nextDouble();

                    System.out.println("\n Seleccione el tipo de empleado");
                    int opc;
                    System.out.println("1. Empleado Administrativo");
                    System.out.println("2. Empleado por Ventas");
                    System.out.println("3. Empleado por horas");
                    opc = teclado.nextInt();

                    if (opc == 1){
                        System.out.println("Ingrese el valor de la bonificación fija");
                        double boni = teclado.nextDouble();

                        EmpleadoAdministrativo ea1 = new EmpleadoAdministrativo(nombree, edade, salarioe, boni);
                        lstEmpleados.add(ea1);
                    } else if (opc == 2) {
                        System.out.println("Ingrese el total de ventas del mes");
                        double ventasMes = teclado.nextDouble();
                        System.out.println("Ingrese el porcentaje de comisión");
                        double comi = teclado.nextDouble();

                        EmpleadoVentas ev1 = new EmpleadoVentas(nombree, edade, salarioe, ventasMes, comi);
                        lstEmpleados.add(ev1);
                    } else if (opc == 3) {
                        System.out.println("Ingrese la cantidad de horas trabajadas");
                        int horasTrab = teclado.nextInt();
                        System.out.println("Ingrese el valor de la hora");
                        double valorh = teclado.nextDouble();

                        EmpleadoHoras eh1 = new EmpleadoHoras(nombree, edade, salarioe, horasTrab, valorh);
                        lstEmpleados.add(eh1);
                    } else {
                        System.out.println("Error opción invalida");
                    }
                    break;

                case 2:
                    for(Empleado e: lstEmpleados){
                        System.out.println(e.mostrarInfo());
                    }
                    break;

                case 3:
                    String nombre1;
                    System.out.println("Ingrese el nombre del empleado");
                    nombre1 = teclado.next();
                    if (lstEmpleados.isEmpty()){
                        System.out.println("La lista no tiene elementos");
                        break;
                    }

                    Empleado e1 = null;

                    for (Empleado e: lstEmpleados) {
                        if (e.getNombre().equalsIgnoreCase(nombre1)) {
                            e1 = e;
                            System.out.println(e1.mostrarInfo());
                            break;
                        }
                    }

                    if (e1 == null) {
                        System.out.println("Empleado no encontrado");
                        break;
                    }

                    break;

            }

        } while (op != 4);
















    }
}