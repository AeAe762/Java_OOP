package Lessons01.HomeWork;



public class Main {
  public static void main(String[] args) {
    Human man  = new Human("Петя Петров", " Папа", "0");
    //Human human1  = new Human("Вася Васильев", "Питер");
    Human woman  = new Human("Алла Сидорова", "0", "Мама");
    //Human human3  = new Human("Лена Смирнова", "Москва");
    FamilyTree familyTree = new FamilyTree();


    familyTree.addHuman(man);
    //familyTree.addHuman(human1);
    familyTree.addHuman(woman);
    //familyTree.addHuman(human3);

    System.out.println(familyTree.getHumanInfo());
  
  
  
  
  
  }
}  
