package pl.wsb.gda.devices;

public class car
{
    final String producer;
    final String model;
    String color;
    public car(String model, String producer, String color)
    {
        this.model = model;
        this.producer = producer;
        this.color = color;
    }
    public String getModel()
    {
        return model;
    }
    public String getProducer()
    {
        return producer;
    }
    public String toString() {
        return "Car{"+", producer="+producer+'\''+"model='"+model+", color='"+color+'}';
    }
}
