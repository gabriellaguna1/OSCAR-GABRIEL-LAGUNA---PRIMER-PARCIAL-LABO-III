import java.util.List;

public class Empresa {
    private List<Sillas> sillas;
    private List<Escritorios>escritorios;
    private List<Notebooks>notebooks;
    private List<Impresoras>impresoras;

    public Empresa(List<Sillas> sillas, List<Escritorios> escritorios, List<Notebooks> notebooks, List<Impresoras> impresoras) {
        this.sillas = sillas;
        this.escritorios = escritorios;
        this.notebooks = notebooks;
        this.impresoras = impresoras;
    }

    public List<Sillas> getSillas() {
        return sillas;
    }

    public void setSillas(List<Sillas> sillas) {
        this.sillas = sillas;
    }

    public List<Escritorios> getEscritorios() {
        return escritorios;
    }

    public void setEscritorios(List<Escritorios> escritorios) {
        this.escritorios = escritorios;
    }

    public List<Notebooks> getNotebooks() {
        return notebooks;
    }

    public void setNotebooks(List<Notebooks> notebooks) {
        this.notebooks = notebooks;
    }

    public List<Impresoras> getImpresoras() {
        return impresoras;
    }

    public void setImpresoras(List<Impresoras> impresoras) {
        this.impresoras = impresoras;
    }

    public Sillas buscarSilla(String nombre){
        for(Sillas s: sillas){
            if(s.getNombre().equalsIgnoreCase(nombre)){
                return s;
            }
        }
        return null;
    }
    public Impresoras buscarImpresora(String nombre){
        for(Impresoras i: impresoras){
            if(i.getNombre().equalsIgnoreCase(nombre)){
                return i;
            }
        }
        return null;
    }
    public void listadoDeSillas(){
        for(Sillas s: sillas){
            System.out.println(s.toString());
        }
    }
    public void listadoDeImpresoras(){
        for(Impresoras i: impresoras){
            System.out.println(i.toString());
        }
    }
    public void listadoDeEscritorios(){
        for(Escritorios e: escritorios){
            System.out.println(e.toString());
        }
    }
    public void listadoDeNotebooks(){
        for(Notebooks n: notebooks){
            System.out.println(n.toString());
        }
    }

    public void modificarPrecios(Empresa e){
        System.out.println("listado de sillas sin modificar: ");
        listadoDeSillas();
        System.out.println("listado de sillas con precios modificados (+5%): ");
        modificarlistaDeSillas();
        listadoDeSillas();
        System.out.println("Listado de escritorios sin modificar: ");
        listadoDeEscritorios();
        System.out.println("Listado de escritorios mdificados (+10%): ");
        modificarListaDeEscritorios();
        listadoDeEscritorios();
        System.out.println("listado de impresoras sin modificar: ");
        listadoDeImpresoras();
        System.out.println("listado de impresoras modificadas (15%): ");
        modificarListaDeImpresoras();
        listadoDeImpresoras();
        System.out.println("Listado de notebooks sin modificar: ");
        listadoDeNotebooks();
        System.out.println("Listado de notebooks modificadas (20%): ");
        modificarListaDeNotebooks();
        listadoDeNotebooks();

    }
    public void modificarlistaDeSillas(){
        for(Sillas s: sillas){
            s.setPrecio((s.getPrecio()*0.05f)+s.getPrecio());
        }
    }
    public void modificarListaDeEscritorios(){
        for(Escritorios e: escritorios){
            e.setPrecio((e.getPrecio()*0.10f)+e.getPrecio());
        }
    }
    public void modificarListaDeImpresoras(){
        for(Impresoras i: impresoras){
            i.setPrecio((i.getPrecio()*0.15f)+i.getPrecio());
        }
    }
    public void modificarListaDeNotebooks(){
        for(Notebooks n: notebooks){
            n.setPrecio((n.getPrecio()*0.20f)+n.getPrecio());
        }
    }

}
