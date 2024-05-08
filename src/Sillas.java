import java.util.List;

public class Sillas extends Productos implements Descuento{
    private String ruedas;

    public Sillas(Integer stock, String nombre, Float precio, String ruedas) {
        super(stock, nombre, precio);
        this.ruedas = ruedas;
    }

    public String getRuedas() {
        return ruedas;
    }

    public void setRuedas(String ruedas) {
        this.ruedas = ruedas;
    }

    @Override
    public String toString() {
        return "Sillas{" +
                " Stock: "+ super.getStock()+
                ", Nombre: "+ super.getNombre()+
                ", precio: "+super.getPrecio()+
                ", ruedas='" + ruedas + '\'' +
                '}';
    }

    @Override
    public Float descuento(int porcentaje) {
        return (super.getPrecio() - (super.getPrecio()*porcentaje)/100);
    }
}
