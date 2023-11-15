package javaInterviewQuestions;

public class Employee {
    private String name;
    private int ID;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}
 class Main{
     public static void main(String[] args) {
         Employee e = new Employee();
         e.setID(6);
         e.setName("Aisha");
         System.out.println("Name: " + e.getName() +" =>" + " ID: " + e.getID());

         e.setName("Denis");
         e.setID(5);
         System.out.println("Name: " + e.getName() + " =>" + " ID: " + e.getID());

     }

}
