public class Escritorios extends Productos{
    private Float alto;
    private Float ancho;

    public Escritorios(Integer stock, String nombre, Float precio, Float alto, Float ancho) {
        super(stock, nombre, precio);
        this.alto = alto;
        this.ancho = ancho;
    }

    public Float getAlto() {
        return alto;
    }

    public void setAlto(Float alto) {
        this.alto = alto;
    }

    public Float getAncho() {
        return ancho;
    }

    public void setAncho(Float ancho) {
        this.ancho = ancho;
    }

    @Override
    public String toString() {
        return "Escritorios{" +
                " Stock: "+ super.getStock()+
                ", Nombre: "+ super.getNombre()+
                ", precio: "+super.getPrecio()+
                ", alto=" + alto +
                ", ancho=" + ancho +
                '}';
    }
}
