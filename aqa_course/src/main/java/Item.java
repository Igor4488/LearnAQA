public class Item {
    String nameOfItem; // Наименование товара
    String articleOfItem; // Артикул товара (строковая переменная, так как артикул может начиналься с 0)
    float priceOfItem; // Цена товара
    int quantityOfItem; // Количество товара
    float massOfItem; // Масса товара
    String colorOfItem; // Цвет товара

 public Item (String newNameOfItem, String newArticleOfItem, float newPriceOfItem,
              int newQuantityOfItem, float newMassOfItem, String newColorOfItem){
    nameOfItem = newNameOfItem;
    articleOfItem = newArticleOfItem;
    priceOfItem = newPriceOfItem;
    quantityOfItem = newQuantityOfItem;
    massOfItem = newMassOfItem;
    colorOfItem = newColorOfItem;
 }
}
