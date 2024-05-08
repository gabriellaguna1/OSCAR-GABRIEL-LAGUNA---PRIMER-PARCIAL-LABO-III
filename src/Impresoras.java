public class Impresoras extends  ProductosInformaticos implements Descuento{
    private Integer impresionesXMinuto;

    public Impresoras(Integer stock, String nombre, Float precio, String nombreFabricante, Integer impresionesXMinuto) {
        super(stock, nombre, precio, nombreFabricante);
        this.impresionesXMinuto = impresionesXMinuto;
    }

    public Integer getImpresionesXMinuto() {
        return impresionesXMinuto;
    }

    public void setImpresionesXMinuto(Integer impresionesXMinuto) {
        this.impresionesXMinuto = impresionesXMinuto;
    }

    @Override
    public String toString() {
        return "Impresoras{" +
                " Stock: "+ super.getStock()+
                ", Nombre: "+ super.getNombre()+
                ", precio: "+super.getPrecio()+
                ", nombre del fabricante: "+super.getNombreFabricante()+
                ", impresionesXMinuto=" + impresionesXMinuto +
                '}';
    }

    @Override
    public Float descuento(int porcentaje) {
        return (super.getPrecio() - (super.getPrecio()*porcentaje)/100);
    }
}
