package Homework_2;

public class Task3 {

//	1. Создать класс Homework_2.Item (товар интернет-магазина)
//  2. Добавить в конструктор параметры:
//  	название
//  	артикул
//  	цена
//      количество.
//      остальные поля класса на ваше усмотрение
//  3. В классе Homework_2.Task3 -> psvm создать объект типа Товар (5 товаров)
//  4. Вывести в консоль инфо по каждому товару в формате
//     "Артикул - Название - цена - количество - [Цвет]"

    public static void main(String[] args) {

        //Создаём объект "Товар1"
        Item item1 = new Item("Чайник", "00010001", 1500.50F,
                              25,1.5F,"Белый");
        //Создаём объект "Товар2"
        Item item2 = new Item("Стиральная машина", "00010025", 25021.40F,
                              24,56F,"Белый");

        //Создаём объект "Товар3"
        Item item3 = new Item("Смартфон", "00010044", 55077.00F,
                              4,0.250F,"Синий");

        //Создаём объект "Товар4"
        Item item4 = new Item("Телевизор", "00020345", 8004.50F,
                              67,10.50F,"Серый");

        //Создаём объект "Товар5"
        Item item5 = new Item("Велосипед", "00040258", 25000.00F,
                              47,12.50F,"Красный");

        //Вывод на консоль Товар1
        System.out.println("Артикул товара: " + item1.articleOfItem + "; Наименование товара: " + item1.nameOfItem +
                           "; Цена товара: " + item1.priceOfItem + "; Количество товара " + item1.quantityOfItem +
                           "; Цвет товара: " + item1.colorOfItem + "; Масса товара: " + item1.massOfItem );

        //Вывод на консоль Товар2
        System.out.println("Артикул товара: " + item2.articleOfItem + "; Наименование товара: " + item2.nameOfItem +
                           "; Цена товара: " + item2.priceOfItem + "; Количество товара " + item2.quantityOfItem +
                           "; Цвет товара: " + item2.colorOfItem + "; Масса товара: " + item2.massOfItem );

        //Вывод на консоль Товар3
        System.out.println("Артикул товара: " + item3.articleOfItem + "; Наименование товара: " + item3.nameOfItem +
                           "; Цена товара: " + item3.priceOfItem + "; Количество товара " + item3.quantityOfItem +
                           "; Цвет товара: " + item3.colorOfItem + "; Масса товара: " + item3.massOfItem );

        //Вывод на консоль Товар4
        System.out.println("Артикул товара: " + item4.articleOfItem + "; Наименование товара: " + item4.nameOfItem +
                           "; Цена товара: " + item4.priceOfItem + "; Количество товара " + item4.quantityOfItem +
                           "; Цвет товара: " + item4.colorOfItem + "; Масса товара: " + item4.massOfItem );

        //Вывод на консоль Товар5
        System.out.println("Артикул товара: " + item5.articleOfItem + "; Наименование товара: " + item5.nameOfItem +
                           "; Цена товара: " + item5.priceOfItem + "; Количество товара " + item5.quantityOfItem +
                           "; Цвет товара: " + item5.colorOfItem + "; Масса товара: " + item5.massOfItem );

    }
}
