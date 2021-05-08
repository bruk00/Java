package pl.wsb.gda.devices;

public class phone
{
    String brand;
    String system;
    boolean isWorking;
    public phone(String brand, String system, boolean isWorking)
    {
        this.brand=brand;
        this.system=system;
        this.isWorking=isWorking;
    }
    @Override
    public String toString() {
        return "Phone{"+"brand='"+brand+'\''+", system='"+system+'\''+", isWorking="+isWorking+'}';
    }
}
