public class Notebooks extends ProductosInformaticos{
    private Integer memoria;

    public Notebooks(Integer stock, String nombre, Float precio, String nombreFabricante, Integer memoria) {
        super(stock, nombre, precio, nombreFabricante);
        this.memoria = memoria;
    }

    public Integer getMemoria() {
        return memoria;
    }

    public void setMemoria(Integer memoria) {
        this.memoria = memoria;
    }

    @Override
    public String toString() {
        return "Notebooks{" +
                " Stock: "+ super.getStock()+
                ", Nombre: "+ super.getNombre()+
                ", precio: "+super.getPrecio()+
                ", nombre del fabricante: "+super.getNombreFabricante()+
                ", memoria=" + memoria +
                '}';
    }
}
