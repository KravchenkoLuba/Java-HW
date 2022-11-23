
import java.util.ArrayList;

public class Human{
    private String name;
    private String mom;
    private String dad;
    ArrayList <Human> people;
    

    public Human(String name, String mom, String dad){
        this.name = name;
        this.mom = mom;
        this.dad = dad;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void mom(String mom){
        this.mom = mom;
    }

    public String getParent1(){
        return mom;
    }

    public void setParent2(String dad){
        this.dad = dad;
    }

    public String getParent2(){
        return dad;
    }

    public void setPeople(ArrayList<Human> people) {
        this.people = people;
    }
    public ArrayList<Human> getPeople() {
        return people;
    }
    
    @Override
    public String toString() {
        return "name:" + name + ", mom:" + mom + ", dad:" + dad;
    }

    
    
}