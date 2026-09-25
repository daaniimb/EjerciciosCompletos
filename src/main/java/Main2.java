void main() {
    int num1 = 100;
    int num2 = 100;
    int num3= 100;

    if (num1 >= num2 && num1 >= num3) {
        System.out.println("El " + num1 + " es el mayor de todos");
    }
    else if (num2 > num1 && num2 > num3) {
        System.out.println("El " + num2 + " es el mayor de todos");

    }

    else if (num3 > num1 && num3 > num2) {
        System.out.println("El " + num3 + " es el mayor de todos");
    }

}