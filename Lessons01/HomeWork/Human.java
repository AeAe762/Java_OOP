package Lessons01.HomeWork;

public class Human {
  private String name; // имя родственника
  private String placeOfBirth; // место рождения
  private String relationDegree; // Степень  росдтва


  public String getName() { 
    return name; 
  }

  public String getPlaceOfBirth() { 
    return placeOfBirth; 
  }

  public Human (String name, String placeOfBirth, String relationDegree) {
    this.name = name;
    this.placeOfBirth = placeOfBirth;
    this.relationDegree = relationDegree;
  }


  @Override
  public String toString() { 
    return "Имя родственника: " + name + ", Место рождения: " + "г." + placeOfBirth;
  }










}
