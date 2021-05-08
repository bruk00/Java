package pl.wsb.gda;

import pl.wsb.gda.devices.car;
import pl.wsb.gda.devices.phone;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args)
    {
        Animal puszek = new Animal("begalski", 2, "puszek", 13., "kot");
        Animal fafik = new Animal("owczarek", 4, "fafik", 24., "pies");

        car carA = new car("abc", "aa", "Green");
        car carB = new car("def", "dd", "Black");

        Human human = new Human( "Jan",  "Nowak", "Java Developer", 20, true, puszek, carA, 3000.00);
        Human human1 = new Human(  "Adam",  "Nowak", "Cook", 36, false, fafik, carB, 2600.00);
        Human human2 = new Human(  "Adam",  "Nowak", "Cook", 36, false, fafik, carB, 2600.00);
        Human human3 = new Human(  "Adam",  "Nowak", "Cook", 36, false, fafik, carB, 2600.00);

        phone myPhone = new phone("Xiaomi", "Android", true);
        phone friendsPhone = new phone("Samsung", "Android", true);

        System.out.println(puszek);
        System.out.println(human.firstName);

        ArrayList<Human> humans = new ArrayList<>();
        humans.add(human);
        humans.add(human1);

        for(Human abc : humans)
        {
            System.out.println(abc.lastName);
        }

        if(fafik.getWeight()>puszek.getWeight()) System.out.println(fafik.name+" jest cięższy. Waży "+ fafik.getWeight());
        if(puszek.getWeight()>fafik.getWeight()) System.out.println(puszek.name+" jest cięższy. Waży "+ puszek.getWeight());
        for(int i=0; i<10; i++)
        {
            puszek.feed();
        }
        for(int i=0; i<10; i++)
        {
            fafik.takeForAWalk();
        }

        System.out.println(human.car.getModel());
        System.out.println("porównanie " + human2.equals(human3));
        System.out.println(human);
        System.out.println(puszek);
        System.out.println(carA);
        System.out.println(myPhone);

        human.setSalary(-1000.);
        System.out.println("wypłata " + human.getSalary());
        human.setSalary(3800.);
    }
}
