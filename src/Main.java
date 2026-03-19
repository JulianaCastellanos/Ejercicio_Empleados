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

            System.out.println("\nSeleccione una opción");
            op = teclado.nextInt();

            switch (op){
                case 1:
                    System.out.println("\nIngrese el nombre del empleado");
                    String nombree = teclado.next();
                    System.out.println("Ingrese la edad del empleado");
                    int edade = teclado.nextInt();
                    System.out.println("Ingrese el Salario Base del empleado");
                    double salarioe = teclado.nextDouble();

                    System.out.println("\nSeleccione el tipo de empleado");
                    int opc;
                    System.out.println("\n1. Empleado Administrativo");
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
                    int opcionn;
                    System.out.println("\n1.Mostrar todos los empleados");
                    System.out.println("2. Mostrar empleados administrativos");
                    System.out.println("3. Mostrar empleados por ventas");
                    System.out.println("4. Mostrar empleados por horas");
                    opcionn = teclado.nextInt();

                    switch (opcionn){
                        case 1:
                            for(Empleado e: lstEmpleados){
                                System.out.println(e.mostrarInfo());
                            }
                            break;
                        case 2:
                            for(Empleado e: lstEmpleados){
                                if (e instanceof EmpleadoAdministrativo){
                                    System.out.println("\n" + e.mostrarInfo());
                                }
                            }
                            break;
                        case 3:
                            for(Empleado e: lstEmpleados){
                                if (e instanceof EmpleadoVentas){
                                    System.out.println("\n" + e.mostrarInfo());
                                }
                            }
                            break;
                        case 4:
                            for(Empleado e: lstEmpleados){
                                if (e instanceof EmpleadoHoras){
                                    System.out.println("\n" + e.mostrarInfo());
                                }
                            }
                            break;
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

                    int opci;

                    do {
                        System.out.println("\n------- Menu --------");

                        System.out.println("\n1. Calcular salario");
                        System.out.println("2. Aumentar salario");
                        System.out.println("3. Mostrar empleados mayores de edad");
                        System.out.println("4. Salir");

                        System.out.println("\n Seleccione una opción");
                        opci = teclado.nextInt();

                        switch (opci){
                            case 1:
                                System.out.println("El salario del empleado es: " + e1.calcularSalario());
                                break;
                            case 2:
                                int opcion;
                                System.out.println("1. Aumentar salario base");
                                if (e1 instanceof EmpleadoAdministrativo){
                                    System.out.println("2. Aumentar bonificación");
                                } else if (e1 instanceof EmpleadoVentas){
                                    System.out.println("2. Aumentar porcentaje de comisión por venta");
                                } else if (e1 instanceof EmpleadoHoras) {
                                    System.out.println("2. Aumentar el valor de la hora");
                                }
                                opcion = teclado.nextInt();

                                if (opcion == 1) {
                                    System.out.println("¿Cuánto desea aumentar?");
                                    double aumento = teclado.nextDouble();
                                    e1.aumentarSalario(aumento);
                                } else if (opcion == 2) {
                                    System.out.println("¿Cuánto desea aumentar?");
                                    double aumentar = teclado.nextDouble();
                                    e1.aumentarExtra(aumentar);
                                } else {
                                    System.out.println("Error");
                                    break;
                                }
                                System.out.println("Salario actual: " + e1.calcularSalario());

                                break;
                            case 3:
                                System.out.println("Empleados mayores de edad: ");
                                for (Empleado e: lstEmpleados){
                                    if(e.getEdad() >= 18){
                                        System.out.println(e.getNombre());
                                    }
                                }
                                break;
                        }

                    } while (opci != 4);

                    break;

            }

        } while (op != 4);



    }
}