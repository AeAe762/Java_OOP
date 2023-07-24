package Lessons01.Seminar;

import Lessons01.Seminar.Product.Bottle;
import Lessons01.Seminar.Product.Product;
//import Lessons01.Seminar.VendingMachine;
public class Main {
  public static void main(String[] args) {
    // Создаем объект класса продукт
    Product product = new Product("twix", 80); // Product - тип данных, product - название(имя) переменной
    // product.setName("twix"); // При создании конструктора данная команда не нужна
    Product product1 = new Bottle("cоса-сола", 100, 1.5);
    Product product2 = new Product("tic-tac", 45);
    Product product3 = new Product("snikers", 95);
    Product product4 = new Product("dsaf", 33);
    // Создаем торговый аппарат
    VendingMachine vendingMachine = new VendingMachine(); // Метод который создает объект класса, отвечает за сборку класса
    /* Иницилизируем данный метод в файле VendingMachine при помощи конструктора */

    vendingMachine.addProduct(product); // добавили в автомат продукт
    vendingMachine.addProduct(product1);
    vendingMachine.addProduct(product2);
    vendingMachine.addProduct(product3);
    vendingMachine.addProduct(product4);
    System.out.println(vendingMachine.getProductsInfo());
  }


   
}
