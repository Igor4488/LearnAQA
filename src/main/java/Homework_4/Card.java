package Homework_4;

// Создайте класс Card. У класса должны быть поля:
// - номер
// - срок годности
// - cvv
// - pinCode
// Поля класса должны задаваться через конструктор.
// Опишите в классе метод, который печатает номер карты в формате "**** **** **** 3456".
// Опишите в классе метод, который принимает на вход пин-код. Если переданный пин-код
// совпал с пин-кодом карты, напечатать в консоль номер карты без маски (все цифры)

public class Card {

    private String cardNumber;      // - номер карты
    private String cardExpiration;  // - срок годности карты
    private String cardCvv;         // - cvv карты
    private String cardPinCode;     // - pinCode карты

    public Card(String cardNumber, String cardExpiration, String cardCvv, String cardPinCode) {
        this.cardNumber = cardNumber;
        this.cardExpiration = cardExpiration;
        this.cardCvv = cardCvv;
        this.cardPinCode = cardPinCode;
    }

    // Метод печати номера карты с маской
    public void printCard() {
        System.out.println("Ваша карта: " + "**** **** **** " + this.cardNumber.substring
                (this.cardNumber.length() - 4));
    }

    // Метод печати номера карты без маски при условии введения правильного CVV кода
    public String printCardPrivate(String cardCvvIn) {
        String cardNumberReturn = "CVV введён неверно!";
        if (cardCvvIn.equals(this.cardCvv)) {
            cardNumberReturn = this.cardNumber;
        }
        return cardNumberReturn;
    }
}






