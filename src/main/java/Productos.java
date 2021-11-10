public class Productos {

    int id, stock, categoria, precio;

    /*
        Categoria:
        1) Corporativo
        2) Educativo
        3) Gaming
        */

    String nombre;

    public Productos(int id, int stock, int categoria, int precio, String nombre) {
        this.id = id;
        this.stock = stock;
        this.categoria = categoria;
        this.precio = precio;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public int getStock() {
        return stock;
    }

    public int getCategoria() {
        return categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Productos{" +
                "id=" + id +
                ", stock=" + stock +
                ", categoria=" + categoria +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
