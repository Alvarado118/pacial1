public class Main {
    public static void main(String[] args) {
        Producto producto_1 = new Producto(1, "huevos", 38, 1);
        articulo producto_2 = new articulo(2, "leche", 17,1, "Pinos");

        System.out.println("Descuento aplicado ala leche: "+producto_2.Calculardescuento(10)+"Q");

        orden orden = new orden();
        orden.Agregar(producto_1);
        orden.Agregar(producto_2);

        orden.Mostrar();
    }
}