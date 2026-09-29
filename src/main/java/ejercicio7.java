void main() {
    int num = 0;
    Scanner entrada = new Scanner(System.in);
    System.out.print("Introduce un numero: ");
    num = entrada.nextInt();

    if (num > 0) {
        for (int i = 1; i <= num; i++) {
            if (i < num) {
                System.out.print(i + ", ");
            } else {
                System.out.print(i);
            }
        }
    }
}
