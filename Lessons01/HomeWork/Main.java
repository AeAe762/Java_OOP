package Lessons01.HomeWork;



public class Main {
  public static void main(String[] args) {
    Human human  = new Human("Петя Петров", "Чикаго");
    Human human1  = new Human("Вася Васильев", "Питер");
    Human human2  = new Human("Алла Сидорова", "Москва");
    Human human3  = new Human("Лена Смирнова", "Москва");
    FamilyTree familyTree = new FamilyTree();


    familyTree.addHuman(human);
    familyTree.addHuman(human1);
    familyTree.addHuman(human2);
    familyTree.addHuman(human3);

    System.out.println(familyTree.getHumanInfo());
  
  
  
  
  
  }
}  
