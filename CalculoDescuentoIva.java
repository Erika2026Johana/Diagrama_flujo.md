import java.util.Scanner;

public class CalculoDescuentoIva {
    public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);

         System.out.println("Ingrese el nombre del producto: ");
        String producto = scanner.nextLine();

        System.out.println("Ingrese el precio");
        double precio = scanner.nextDouble();
        double descuento;
        double iva = 19;
    
        if (precio >=500000) {
            descuento =20;
        }else if (precio>= 300000) {
         descuento = 15;

        }else if (precio >= 100000) {
            descuento = 10;
        }else {
            descuento = 0;

        }
        double valordescuento = precio * descuento / 100;
        double subtotal = precio -valordescuento;
        double valoriva =subtotal * iva/ 100;
        double total = subtotal + valoriva;
        
        System.out.println("Precio: $" + precio);
        System.out.println("Descuento: " + descuento + "%");
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Iva: $" + valoriva );
        System.out.println("TOTAL: $" + total);

    }
    
}
