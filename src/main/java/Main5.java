void main() {
    int edad = -1;
    Scanner entrada = new Scanner(System.in);

    while (edad < 0 || edad > 100) {
        System.out.print("Escribe tu edad: ");
        edad = entrada.nextInt();
    }
        if (edad <= 17) {
            System.out.println("Con " + edad + " eres menor de edad");
        }
        else {
            if (edad <= 30) {
                System.out.println("Con " + edad + " eres adulto menor");
            }
            else {
                if (edad <= 64) {
                    System.out.println("Con " + edad + " eres adulto");
                } else {
                    System.out.println("Con " + edad + " eres adulto mayor");
                }
            }
        }
    }

