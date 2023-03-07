package streamtopic;

public class Product 
{
	int id;  
    String name;  
    float price;  
    public Product(int id, String name, float price) 
    {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
    void disp() 
    {
    	System.out.println(id + " " + name  +" " +price);
    }
    @Override
    public String toString() 
    {
    	return id + " " + name + " "+ price;
    }
}
