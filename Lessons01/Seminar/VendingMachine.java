// Файл, в котором будет хранить класс, где будет описывать вейдинговый автомат 
package Lessons01.Seminar;


import Lessons01.Seminar.Product.Product;
import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
  private List<Product> productList; // Класс который будет взаимодейстовать с коллекцией Product.

  public void addProduct(Product product){ // Метод который будет добавлять продукт
    productList.add(product); // будет добавлять продукт
/* NullPointerException - исключение которое появляется, когда происходит обращение к неицилизированному проекту.
Для инициализации необходим конструктор.
Конструктор - метод указывает ()*/
  }

// Создаем конструктор 
  public VendingMachine(){
    productList = new ArrayList<>();
  }

  // Метод для поиска продукта 
  public Product findProductByName (String name) {
    for (Product product: productList) {
      if (product.getName().equalsIgnoreCase (name)) {
        return product;
      }
    }
    return null;
  }   
  
  // Метод для вывода всех продуктов 
  public String getProductsInfo(){
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append ("Список продуктов: \n");
    for (Product product: productList){
      stringBuilder.append (product);
      stringBuilder.append ("\n");
    }
    return stringBuilder.toString();
  }







}
