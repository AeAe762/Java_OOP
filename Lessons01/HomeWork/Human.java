package Lessons01.HomeWork;

import java.util.List;


public class Human {
  private String name; // имя человека
  private String father;
  private String mother;
  private List<Human> children;


  public String getName() { 
    return name; 
  }
  public String getFather() {
    return father;
  }
  public String getMother() {
    return mother;
  }

  

  public Human (String name, String father, String mother) {
    this.name = name;
    this.father = father;
    this.mother = mother;
  }



  @Override
  public String toString() {
  return "Имя родственника: " + name + ", " + father + ", " + mother;
  }










}
