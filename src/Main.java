public class Main {
    public static void main(String[] args) {

        int price = 9000; // стоимость билета
        int bonus = 20; // количество рублей для одной бонусной мили
        int miles = price / bonus;
        System.out.println("Количество бонусных миль:");
        System.out.println(miles);
    }
}