public class ProductosInformaticos extends Productos{
    private String NombreFabricante;

    public ProductosInformaticos(Integer stock, String nombre, Float precio, String nombreFabricante) {
        super(stock, nombre, precio);
        NombreFabricante = nombreFabricante;
    }

    public String getNombreFabricante() {
        return NombreFabricante;
    }

    public void setNombreFabricante(String nombreFabricante) {
        NombreFabricante = nombreFabricante;
    }
}
