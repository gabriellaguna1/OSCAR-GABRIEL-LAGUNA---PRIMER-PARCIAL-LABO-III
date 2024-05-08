import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    ///punto 3 - crear instancia de cada clase y mostrarla por pantalla
        Sillas silla = new Sillas(5, "de roble", 250000f, "no");
        Sillas silla1= new Sillas(10, "gamer", 300000f, "si");
        List<Sillas> s1= new ArrayList<>();
        s1.add(silla);
        s1.add(silla1);

        Escritorios esc= new Escritorios(4, "melamina", 500000f, 1.50f, 2f);
        Escritorios esc1= new Escritorios(2, "de roble", 520000f, 1.25f, 3f);
        List<Escritorios>e1= new ArrayList<>();
        e1.add(esc);
        e1.add(esc1);

        Impresoras imp=new Impresoras(6, "chorro de tinta", 150000f, "Epson", 30);
        Impresoras imp1= new Impresoras(5, "Laser", 225000f, "Canon", 50);
        List<Impresoras>i1= new ArrayList<>();
        i1.add(imp);
        i1.add(imp1);

        Notebooks not= new Notebooks(8, "laptop", 800000f, "Lenovo", 32);
        Notebooks not1= new Notebooks(10, "gamer", 1200000f, "Asus", 64);
        List<Notebooks>n1= new ArrayList<>();
        n1.add(not);
        n1.add(not1);

        Empresa empresa= new Empresa(s1,e1,n1,i1);

        Integer opc;
        Scanner sr= new Scanner(System.in);

        do{
            System.out.println("Menu de la empresa");
            System.out.println("1 - Listado de Sillas disponibles");
            System.out.println("2 - listado de escritorios disponibles");
            System.out.println("3 - listado de impresoras disponibles");
            System.out.println("4 - listado de notebooks disponibles");
            System.out.println("5 - compra de Sillas con descuento");
            System.out.println("6 - compra de Impresoras con descuento");
            System.out.println("7 - subir el precio de los productos");
            System.out.println("8 - salir");

            opc=sr.nextInt();
            Scanner sc= new Scanner(System.in);
            Scanner ss= new Scanner(System.in);

            switch(opc){
                case 1:
                    System.out.println("listado de sillas disponibles: ");
                    empresa.listadoDeSillas();
                    break;
                case 2:
                    System.out.println("Listado de escritorios disponibles: ");
                    empresa.listadoDeEscritorios();
                    break;
                case 3:
                    System.out.println("Listado de Impresoras disponibles: ");
                    empresa.listadoDeImpresoras();
                    break;
                case 4:
                    System.out.println("Listado de notebooks disponibles: ");
                    empresa.listadoDeNotebooks();
                    break;
                case 5:
                    System.out.println("Ingrese el nombre de la silla a realizar el descuento");
                    String nombre= sc.nextLine();
                    Sillas s= empresa.buscarSilla(nombre);
                    System.out.println("Ingrese el descuento a otorgar: ");
                    Integer desc= ss.nextInt();
                    if(s!=null){
                        System.out.println("el precio final de la silla es de: " + s.descuento(desc));
                    }
                    break;
                case 6:
                    System.out.println("Ingrese el nombre de la impresora a realizar el descuento");
                    nombre=sc.nextLine();
                    Impresoras i= empresa.buscarImpresora(nombre);
                    System.out.println("Ingrese el descuento a otorgar: ");
                    desc= ss.nextInt();
                    if(i!=null){
                        System.out.println("el precio final de la silla es de: " + i.descuento(desc));
                    }
                    break;
                case 7:
                    empresa.modificarPrecios(empresa);
                    break;
                default:
                    System.out.println("opcion incorrecta");
                    break;
            }
        }while(opc!=8);


    }
}