package streamtopic;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		List<Product> productsList = new ArrayList<Product>();  
        //Adding Products  
        productsList.add(new Product(1,"HP Laptop",25000f));  
        productsList.add(new Product(2,"Dell Laptop",30000f));  
        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
        productsList.add(new Product(4,"Sony Laptop",98000f));  
        productsList.add(new Product(5,"Apple Laptop",90000f));  
	
        Float totalPrice = productsList.stream()  
                .map(product->product.price)  
                .reduce(0.0f,(sum, price)->sum+price);   // accumulating price  
        System.out.println(totalPrice);  
        
//        productsList.stream()  
//        .filter(product -> product.price == 30000)  
//        .forEach(product -> System.out.println(product.name));   
        
//       Stream<Product> streamObj =  productsList.stream();
//       List<Product> listOfProduct= streamObj.filter(p -> p.price > 30000f ).map(p->p).collect(Collectors.toList());
//       List<Product> listOfProduct=   productsList.stream().filter(p -> p.price > 30000f ).collect(Collectors.toList());
//       System.out.println(listOfProduct);
	}
}
