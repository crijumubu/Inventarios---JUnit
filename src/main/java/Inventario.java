import java.util.LinkedList;

public class Inventario {

    private LinkedList<Productos> inventario = new LinkedList<Productos>();

    public boolean agregarProducto(Productos p){

        if (p.getId() >= 0 && p.getCategoria()>=1 && p.getCategoria() <= 3 && p.getPrecio() > 0 && p.getStock() >= 0){

            inventario.add(p);
            System.out.println("\n¡FELICITACIONES! -> PRODUCTO AÑADIDO EXITOSAMENTE\n");
            return true;

        }

        System.out.println("\n¡ERROR! -> INCOHERENCIA EN LOS DATOS DEL PRODUCTO A CREAR\n");
        return false;
    }

    public boolean eliminarProducto(int id){
        try{

            inventario.remove(id);
            System.out.println("\n¡FELICITACIONES! -> PRODUCTO ELIMINADO EXITOSAMENTE\n");
            return true;

        }catch(Exception e){

            System.out.println("\n¡ERROR! -> EL PRODUCTO AL CUAL QUIERES MODIFICAR NO EXISTE\n");
            return false;

        }
    }

    public boolean modificarProducto(int id, String data, int opcion){

        try{

            switch (opcion){
                case 1:
                    inventario.get(id).setNombre(data);
                    break;
                case 2:
                    int precio = Integer.parseInt(data);
                    if (precio > 0){
                        inventario.get(id).setPrecio(precio);
                    }
                    break;
                case 3:
                    int stock = Integer.parseInt(data);
                    if (stock >= 0){
                        inventario.get(id).setStock(stock);
                    }
                    break;
            }

            System.out.println("\n¡FELICITACIONES! -> PRODUCTO MODIFICADO EXITOSAMENTE\n");
            return true;

        }catch(Exception e){

            System.out.println("\n¡ERROR! -> EL PRODUCTO AL CUAL QUIERES MODIFICAR NO EXISTE\n");
            return false;

        }

    }

    public void imprimirInventario(){
        System.out.println("Este es tu inventario:");

        if (inventario.size() != 0){
            for (int i=0; i<inventario.size(); i++){
                System.out.println("\t" + inventario.get(i).toString());
            }
            System.out.println("");
        }else{
            System.out.println("\t¡VACIO! -> TU INVENTARIO SE ENCUENTRA VACIO\n");
        }

    }

    public int elementosInventario(){
        return inventario.size();
    }

    public LinkedList<Productos> getInventario() {
        return inventario;
    }

}
