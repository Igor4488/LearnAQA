package Homework_4;

public class Task6_MyProgram {

// Создайте класс MyProgram + метод psvm. - В методе создайте новую карту;
// - Вызовите сначала метод печати с маской; - Потом метод печати с пин-кодом;
// - Убедитесь, что нельзя получить никакие данные карты напрямую через поля (используйте private)

    public static void main(String[] args) {
        // Создание новой карты
        Card card1 = new Card("1234 5678 9012 3456", "1234", "456", "7890");

        card1.printCard(); // Вызов метода печати номера карты с маской

        System.out.println(card1.printCardPrivate("456")); // Вызов метода печати номера карты.
        // CVV код верный

        System.out.println(card1.printCardPrivate("458")); // Вызов метода печати номера карты.
        // СММ код неверный

    }
}
