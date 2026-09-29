void main() {
    int num;
    char uni = ' ';
    double Celsius = 0, Farenheit = 0;

    Scanner entrada = new Scanner(System.in);
    System.out.println("Celsius o Farenheit? (C/F)");
    uni = entrada.next().toUpperCase().charAt(0);

    System.out.println("Cuantos grados? ");
    num = entrada.nextInt();

    switch (uni) {
        case 'C' -> {
            Celsius = (num - 32) * 5.0 / 9.0;
            System.out.println(num + " grados Farenheit" + " son " + Celsius + " grados celsius");
        }
        case 'F' -> {
            Farenheit = (num * 9.0 / 5.0) + 32;
            System.out.println(num + "grados Celsius" + " son " + Farenheit + " grados Farenheit");
        }
    }
}