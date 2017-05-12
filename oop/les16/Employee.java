package oop.les16;

// Klasse Student is een uitbereiding van de klasse Persoon.

// Klasse Student is een uitbereiding van de klasse Persoon.
// Alles wat in persoon zit (fields) en alles wat een persoon kan (methods) kan een Student ook ... en meer (zie get/set School)
public class Employee extends Person {
    
    private int wage;
    
    public Employee(String name, int age, int wage) {
        super(name, age); // Roep de constructor op van de super-klasse. name en age worden daar opgeslaan.
        this.wage = wage;
    }
    
   public int getWage(){
       return wage;
   }
   
   public void setWage(int newWage) {
       wage = newWage;
   }
   
   @Override // dit is een implementatie van de abstracte method uit Person
    protected String getSpecialPropertiesAsString() {
        return this.getName() + " earns " + this.getWage() + "€ a month.";
    }
    
    // Er is geen eigen toString meer nodig, Person lost dit allemaal op.
    
}
