package Lessons01.HomeWork;

import java.util.ArrayList;
import java.util.List;
import Lessons01.HomeWork.Human;

public class FamilyTree {
  private List<Human> humanList;

  public void addHuman(Human human){ 
    humanList.add(human); 
  }

  public FamilyTree() {
    humanList = new ArrayList<>();
  }


   public Human findHumanByName (String name) {
    for (Human human: humanList) {
      if (human.getName().equalsIgnoreCase(name)) {
        return human;
      }
    }
    return null;
  }


   public String getHumanInfo(){
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append ("Список родственников: \n");
    for (Human human: humanList){
      stringBuilder.append (human);
      stringBuilder.append ("\n");
    }
    return stringBuilder.toString();
  }

  

  






}
