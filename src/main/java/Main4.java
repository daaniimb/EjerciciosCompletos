void main() {
    String usuario, contraseña;
    Scanner entrada = new Scanner(System.in);

    for (int i = 0; i < 3; i++) {
        System.out.println("Escribe el usuario: ");
        usuario = entrada.next();
        System.out.println("Escribe la contraseña: ");
        contraseña = entrada.next();
        if (usuario.equals("admin") && contraseña.equals("1234")) {
            System.out.println("Acceso concedido");
            i = 3;
        }
        else {
            System.out.println("Acceso denegado");
            }
        }
    }



