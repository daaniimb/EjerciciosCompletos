void main() {
    int num;
    int suma = 0;
    do {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        num = entrada.nextInt();

        if (num >= 0)
            suma += num;
    }
    while (num >= 0); {
    }

    System.out.println("La suma total es " + suma);

}



