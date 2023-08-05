import java.util.ArrayList;
import java.util.List;

public class Carritodecompras {
    private List<Producto> productos;

    public Carritodecompras(){
        productos = new ArrayList<>();
    }

    public void Agregar(Producto producto){
        productos.add(producto);
    }

    public double Total(){
        double calcular = 0;
        for(Producto producto : productos){
            calcular += producto.getPrecio() * producto.getCantidad();
        }
        return calcular;
    }

    public void Mostrar(){
        System.out.println("Detalles de la orden: ");
        for(Producto producto : productos){
            System.out.println("Productos: "+producto.getNombre()+", Precio Unitario: "+producto.getPrecio()+", Cantidad: "+producto.getCantidad());
        }
        System.out.println("Total de la orden: "+Total());
    }
}



