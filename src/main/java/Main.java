import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        System.out.println("Bienvenido al tu software de inventarios!\n");

        Inventario inventario = new Inventario();

        Scanner sc = new Scanner(System.in);

        int opcion;

        do{
            System.out.println("Estas son las opciones que tienes como administrado de tu inventario:");
            System.out.println("\t1) Agregar un producto\n\t2) Modificar un producto\n\t3) Eliminar un producto\n\t4) Mostrar inventario\n\t5) Salir");
            System.out.print("Selecciona una opcion a continuación: ");

            opcion = sc.nextInt();
            sc.nextLine();
            System.out.println("");

            switch(opcion){

                case 1:

                    int id, stock, categoria = 0, precio;
                    String nombre;

                    id = inventario.elementosInventario();

                    System.out.print("Ingresa el nombre del producto: ");
                    nombre = sc.nextLine();

                    System.out.println("Las categorias para tu producto son las siguientes: ");
                    System.out.println("\t1) Corporativo\n\t2) Educativo\n\t3) Gaming");
                    System.out.print("Selecciona una a continuación: ");
                    categoria = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Ingrese el precio por unidad del producto: ");
                    precio = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Ingresa las unidades en stock del producto: ");
                    stock = sc.nextInt();
                    sc.nextLine();

                    inventario.agregarProducto(new Productos(id, stock, categoria, precio, nombre));

                    break;

                case 2:

                    System.out.print("Ingresa el id del producto que deseas modificar: ");
                    int idMod = sc.nextInt();

                    System.out.println("Las modificaciones que puedes hacer para este producto son las siguientes: ");
                    System.out.println("\t1) Cambiar el nombre del producto\n\t2) Modificar el precio del producto\n\t3) Agregar o eliminar unidades en stock");
                    System.out.print("Selecciona una a continuación: ");

                    int opcionMod = sc.nextInt();
                    sc.nextLine();
                    String data;

                    switch(opcion) {

                        case 1:

                            System.out.print("Ingresa el nuevo nombre del producto: ");
                            data = sc.nextLine();
                            inventario.modificarProducto(idMod, data, opcionMod);
                            break;

                        case 2:

                            System.out.print("Ingresa el nuevo precio del producto: ");
                            data = sc.nextLine();
                            inventario.modificarProducto(idMod, data, opcionMod);
                            break;

                        case 3:

                            System.out.print("Ingresa las unidades actuales en stock del producto: ");
                            data = sc.nextLine();
                            inventario.modificarProducto(idMod, data, opcionMod);
                            break;

                        default:

                            System.out.println("\n¡ERROR! -> MODIFICACION NO VALIDA\n");
                            break;
                    }
                    break;

                case 3:

                    System.out.print("Ingresa el id del producto que deseas eliminar: ");
                    inventario.eliminarProducto(sc.nextInt());
                    sc.nextLine();
                    break;

                case 4:
                    inventario.imprimirInventario();
                    break;
                case 5:
                    System.out.println("¡HASTA PRONTO! -> BUEN DIA :D");
                    break;
                default:
                    System.out.println("\n¡ERROR! -> OPCION NO VALIDA\n");
                    break;
            }
        }while(opcion != 5);


    }
}
