/**
 * Greete Class File Implementing Greeter Interface
 */
public class Greete implements Greeter {

    String name ;

    /**
     * Setting String name
     * @param name
     */
    public void setName(String name)
    {
        this.name = name ;
    }

    /**
     * Getting Member varaiable
     * @return
     */
    public String getGreeting()
    {
        return name;
    }
}
