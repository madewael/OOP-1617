package oop.les15;

// Klasse Student is een uitbereiding van de klasse Persoon.
// Alles wat in persoon zit (fields) en alles wat een persoon kan (methods) kan een Student ook ... en meer (zie get/set School)
public class Student extends Person {
    
    private String school;
    
    public Student(String name, int age, String school) {
        super(name, age); // Roep de constructor op van de super-klasse. name en age worden daar opgeslaan.
        this.school = school;
    }
    
   public String getSchool(){
       return school;
   }
   
   public void setSchool(String newSchool) {
       school = newSchool; // Je moet geen this gebruiken als de naam van de parameter anders is. (je mag wel)
   }
   
   @Override // deze toString overschrijft de toString van Person.
    public String toString() {
        return super.toString() + " " + // om de toString van Person te kunnen aanroepen gebruik je super.
                this.getName() + // getName komt ook uit Person, maar hier is geen super nodig omdat Student geen eigen versie heeft.
                " studies at " + this.getSchool() + ".";
    }
    
    
}
