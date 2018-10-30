package barking.mad.kennels;
// * @author Leite

public class Dog {

    private String name;
    private int id;
    private String owner;
    private int numDays;
    private double fare;
    
//    public Dog(String nameIn, int idIn, String ownerIn, int numDaysIn){
//        name = nameIn;
//        id = idIn;
//        owner = ownerIn;
//        numDays = numDaysIn;
//    }
    
    public String getName()
    {
        return name;
    }
    public int getId()
    {
        return id;
    }
    public String getOwner()
        {
            return owner;
        }
    public int getNumDays()
    {
        return numDays;
    }
    public double getFare()
    {
        return fare;
    }
    
    public void setName(String setName)
    {
        setName = name;
    }
    public void setId(int setId)
    {
        setId = id;
    }
    public void setOwner(String setOwner)
    {
        setOwner = owner;
    }
    public void setNumDays(int setNumDays)
    {
        setNumDays = numDays;
    }
    public void setFare(double setFare)
    {
        setFare = fare;
    }
    
    @Override
    public String toString() {
        return "Dog{" + "Name= " + name + ", Owner= " + owner + ", fare= " + fare + "Staying = " + numDays + "To pay = " + fare + "}";
    }
    
    
}
