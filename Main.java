public class Main {
    public static void main(String[] args) {

        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        try {
            int c = calc.devide.apply(a, b);
            calc.println.accept(c); // Ошибка заключалась в том, что происходит деление на 0.
        } catch (ArithmeticException e) {
            System.out.println("Делить на 0 нельзя!");
        }






    }
}