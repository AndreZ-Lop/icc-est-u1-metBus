import models.Product;
public class App {
    public static void main(String[] args) throws Exception {
        Product[] producto = {
            new Product("Laptop",20),
            new Product("Smartphone",25),
            new Product("Tablet",10),
            new Product("Monitor",5),
            new Product("Keyboard",15),
        };

        BusquedaBinaria.sortInsec(producto);

        int res = BusquedaBinaria.findByName(producto, "Laptop");
        if(res>=0){
            System.out.println("Entre en pos = " + res);
        }else{
            System.out.println("no se encontro ");
        }
    }   
}
