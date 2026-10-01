import java.util.Scanner;

void main() {
    Scanner entrada = new Scanner(System.in);
    float total = 0;
    char respuesta = 'S';
    String teclado ="";

    do {
        System.out.println("Inserta un precio:");
        float precio = entrada.nextFloat();
        total += precio;

        do {
            System.out.println("¿Hay mas articulos? (S/N)");
            teclado = entrada.next().toUpperCase();
            respuesta = teclado.charAt(0);
        } while ((respuesta != 'S' && respuesta != 'N') || teclado.length() > 1);

    } while (respuesta == 'S');

    System.out.println("El total a pagar es: " + total + "€");

    float pago;
    do {
        System.out.println("¿Con cuánto paga el cliente?");
        pago = entrada.nextFloat();

        if (pago < total) {
            System.out.println("Error: El dinero entregado (" + pago + "€) es insuficiente. Debe pagar al menos " + total + "€.");
        }
    } while (pago < total);

    float cambio = pago - total;

    System.out.println("El total a pagar son " + total + "€, el cliente entrega " + pago + "€ por lo que el cambio es de " + cambio + "€");
}