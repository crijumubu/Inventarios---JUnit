import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InventarioTest {

    Productos p1 = new Productos(0, 50, 3,300000,  "Mouse gamer HyperX");
    Productos p2 = new Productos(1, -20, 100,2000000,  "Laptop de oficina");
    Inventario inventario = new Inventario();

    @Test
    void agregarProducto() {
        System.out.println("LOS OUTPUTS DE A CONTINUACION SON GENERADOS DURANTE LA EJECUCION DE LAS PRUEBAS DEL PROGRAMA\n");

        assertEquals(true, inventario.agregarProducto(p1));
        assertEquals(false, inventario.agregarProducto(p2)); //p2 tiene un valor en stock negativo y una categoria fuera de las dispuestas, por lo cual retornar false
    }

    @Test
    void eliminarProducto() {
        System.out.println("LOS OUTPUTS DE A CONTINUACION SON GENERADOS DURANTE LA EJECUCION DE LAS PRUEBAS DEL PROGRAMA\n");

        inventario.agregarProducto(p1); //Al ser el primer elemento en el inventario su id es 0

        assertEquals(true, inventario.eliminarProducto(0));
        assertEquals(false, inventario.eliminarProducto(0)); //Esta prueba da error debido a que ese elemento ya ha sido eliminado, por lo cual NO existe y no lo podemos volver a eliminar
    }

    @Test
    void modificarProducto() {
        System.out.println("LOS OUTPUTS DE A CONTINUACION SON GENERADOS DURANTE LA EJECUCION DE LAS PRUEBAS DEL PROGRAMA\n");

        inventario.agregarProducto(p1); //Al ser el primer elemento en el inventario su id es 0

        assertEquals(true, inventario.modificarProducto(0, "Mouse gamer Razer", 1)); //La opcion 1 es para modificar el nombre
        assertEquals(false, inventario.modificarProducto(2, "350000", 2)); // La opcion 2 es para modificar el precio
        assertEquals(true, inventario.modificarProducto(0, "2", 3)); // La opcion 3 es para modificar las unidades en stock
    }
}