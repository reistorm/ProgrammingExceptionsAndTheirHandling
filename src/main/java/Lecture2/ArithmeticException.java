package Lecture2;
// ArithmeticException -арифметическая ошибка
// NullPounterException -обращение к несуществующему объекту
// обработка сразу двух исключений
public class ArithmeticException {
    public static void main(String[] args) {
        int number = 1;
        try {
            number = 10 / 0;
            String test = null;
            System.out.println(test.length());
//        } catch (Exception e){
//            System.out.println("exception");
//        }
        }
        // сначала узкие exception, потом широкие, смотреть по коду
        catch (java.lang.ArithmeticException e) {
            System.out.println("Upporation divide by zero not supported");
        }
        catch (java.lang.NullPointerException e){
            System.out.println("nullPointerException");
        }
        System.out.println(number);
    }
}
