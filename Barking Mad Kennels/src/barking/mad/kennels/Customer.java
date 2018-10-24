
package barking.mad.kennels;
// * @author Leite
public class Customer {
    private String name;
    private int id;
    private Dog dog;
    private int numberOfDays;
    private double fare;
    
    //Getters
    public String getName()
    {
        return name;
    }
    public int getId()
    {
        return id;
    }
    public Dog getDog()
    {
        return dog;
    }
    public int numDays()
    {
        return numberOfDays;
    }
    public double getFare()
    {
        return fare;
    }
    
    //Setters
    public void setName(String setName)
    {
        setName = name;
    }
    public void setId(int setId)
    {
        setId = id;
    }
    public void setNumberOfDays(int setNumDays)
    {
        setNumDays = numberOfDays;
    }
    public void setFare(double setFare)
    {
        setFare = fare;
    }
    public void setDog(Dog setDog)
    {
        setDog = dog;
    }
    
}
