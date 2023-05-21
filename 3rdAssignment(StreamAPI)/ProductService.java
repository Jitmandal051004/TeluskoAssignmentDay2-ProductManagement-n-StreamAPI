//Stream API.

import java.time.Year;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProductService
{
    List<Product> products = new ArrayList<>(); //here in this list we are storing every data.
    
    public void addProduct(Product p)
    {
        products.add(p);
    }

    public List<Product> getAllProducts() //here as we are returning list of product that's why the type is List<>.
    {
        return products;
    } 

    public Product getProduct(String name)
    {
        String str = name.toLowerCase();
        return products.stream().filter(p -> p.getName().toLowerCase().contains(str)).findFirst().orElse(null);
    }


    public List<Product> getProductWithText(String Text) 
    {
        String str = Text.toLowerCase();
        return products.stream().filter(p -> p.getName().toLowerCase().contains(str)||p.getType().toLowerCase().contains(str)||p.getPlace().toLowerCase().contains(str)).collect(Collectors.toList());
    }


    public List<Product> getProductAtPlace(String Place) 
    {
        String str = Place.toLowerCase();
        return products.stream().filter(p -> p.getPlace().toLowerCase().contains(str)).collect(Collectors.toList());
    }


    public List<Product> getProductOutOfWarranty() 
    {
        Year year = Year.now();
        int currentYear = year.getValue();
        return products.stream().filter(p -> p.getWaranty()<currentYear).collect(Collectors.toList());
    }

}