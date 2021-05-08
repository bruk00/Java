package pl.wsb.gda;
import pl.wsb.gda.devices.car;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;
public class Human {
    SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
    Date date=new Date(System.currentTimeMillis());
    String firstName;
    String lastName;
    String position;
    int age;
    boolean isWorking;
    Animal pet;
    car car;
    private Double salary;
    public Human(String firstName, String lastName, String position, int age, boolean isWorking, Animal pet, car car, Double salary)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.age=age;
        this.isWorking=isWorking;
        this.pet=pet;
        this.car=car;
        this.salary=salary;
    }

    @Override
    public boolean equals(Object o)
    {
        if(this==o) return true;
        if(!(o instanceof Human)) return false;
        Human human=(Human) o;
        return age==human.age && isWorking==human.isWorking && Objects.equals(firstName, human.firstName) && Objects.equals(lastName, human.lastName) && Objects.equals(position, human.position) && Objects.equals(pet, human.pet) && Objects.equals(car, human.car);
    }
    @Override
    public int hashCode()
    {
        return Objects.hash(firstName, lastName, position, age, isWorking, pet, car);
    }
    public Double getSalary()
    {
        System.out.println(date + " Pobrano dane użytkownika " + this.lastName);
        return salary;
    }
    public void setSalary(Double salary) {
        if(salary>0){
            this.salary = salary;
            System.out.println("Wysłano dane do systemu");
            System.out.println("Czeka nowy aneks");
            System.out.println("Dane zostały wysłane do ZUS i US");
        }
        else System.out.println("Wypłata nie może być ujemna");
    }
    @Override
    public String toString()
    {
        return "Human "+"firstName'="+firstName+'\''+", lastName='"+lastName+'\''+", position='"+position+'\''+", age="+age+", isWorking="+isWorking+", pet="+pet+", car="+car+'}';
    }
}
