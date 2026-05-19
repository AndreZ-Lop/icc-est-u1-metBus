import models.Product;
public class BusquedaBinaria {
    public static int findByName(Product [] products,String nombre){
        int inicio = 0;
        int fin = products.length-1;
        while(inicio<=fin){
            int medio=(inicio + fin)/2;
            if(nombre.compareTo(products[medio].getNombre())==0){
                return medio;
            }else if(nombre.compareTo(products[medio].getNombre())>0){
                inicio = medio+1;
            }else{
                fin = medio-1;
            }
        }
        //por conveciones cuando se devuelve indices y no se encuentra se debe devolver -1;
        //pero su es busqueda por objetos se devuelve null
        return -1;
    }

    public static void sortInsec(Product [] products){
        for(int i = 1;i<products.length;i++){
            Product key = products[i];
            int j = i-1;
            while(j>=0 && (products[j].getNombre().compareTo(key.getNombre())>0)){
                products[j+1] = products[j]; 
                j--;
            }
            products[j+1]=key;
        }
    }
}
