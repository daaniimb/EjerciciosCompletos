void main() {
  float num1 = 10;
  float num2 = 18;
  char ope = '/';

  switch (ope) {
      case '+' -> {
          System.out.println(num1 + num2);
      }
      case '-' -> {
          System.out.println(num1 - num2);
      }
      case '*' -> {
          System.out.println(num1 * num2);
      }
      case '/' -> {
          System.out.println(num1 / num2);
      }
      default -> {
          System.out.println("No es una operacion valida");
      }
  }

}