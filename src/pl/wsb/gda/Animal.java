package pl.wsb.gda;

public class Animal
{
    static boolean isAlive=true;
    String race;
    int age;
    String name;
    private Double weight;
    final String species;

    public Animal(String race, int age, String name, Double weight, final String species)
    {
        this.race=race;
        this.age=age;
        this.name=name;
        this.weight=weight;
        this.species=species;
        if(species=="pies") this.weight=30.0;
        if(species=="kot") this.weight=10.0;
    }
    public Double getWeight()
    {
        return weight;
    }
    void feed()
    {
        if (this.weight > 0) this.weight++;
        else System.out.println(this.name+" nie żyje");
    }
    void takeForAWalk()
    {
        if(this.weight>0)this.weight--;
        else System.out.println(this.name+" nie żyje");
    }

    @Override
    public String toString() {
        return "Animal{"+"race='"+race+'\''+", age='"+age+", name='"+name+ '\''+", weight="+weight+", species='"+species+'\''+'}';
    }
}
