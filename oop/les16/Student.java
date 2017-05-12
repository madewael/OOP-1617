package oop.les16;

// Klasse Student is een uitbereiding van de klasse Persoon.

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
   
   @Override // dit is een implementatie van de abstracte method uit Person
    protected String getSpecialPropertiesAsString() {
        return this.getName() + " studies at " + this.getSchool() + ".";
    }
    
    // Er is geen eigen toString meer nodig, Person lost dit allemaal op.
    
}
