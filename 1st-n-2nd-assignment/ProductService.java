import java.time.Year;
import java.util.ArrayList;
import java.util.List;

public class ProductService
{
    List<Product> products = new ArrayList<>(); //here in this list we are storing every data.
    public void addProduct(Product p)
    {
        products.add(p);
    }
/*
    public List<Product> getAllProducts() //here as we are returning list of product that's why the type is List<>.
    {
        return products;
    } 

    public Product getProduct(String name){
        for(Product p : products){
            if(p.getName().equals(name))
                return p;
        }

        return null;
    }

    public List<Product> getProductWithText(String Text) 
    {
        String str = Text.toLowerCase();
        List<Product> prod = new ArrayList<>();
        for(Product p : products)
        {
            String name = p.getName().toLowerCase();
            String Type = p.getType().toLowerCase();
            String Place = p.getPlace().toLowerCase();

            if(name.contains(str)||Type.contains(str)||Place.contains(str))
            {
                prod.add(p);
            }
        }
        return prod;
    }
*/
//1st Assignment
    public List<Product> getProductAtPlace(String Place) {
        String str = Place.toLowerCase();
        List<Product> prodatplace = new ArrayList<>();

        for(Product p : products)
        {
            String commonPlace = p.getPlace().toLowerCase();

            if(commonPlace.contains(str))
            {
                prodatplace.add(p);
            }
        }
        return prodatplace;
    }

//2nd Assignment
    public List<Product> getProductOutOfWarranty() {
        Year year = Year.now();
        int currentYear = year.getValue();
        List<Product> prodOutOfWarranty = new ArrayList<>();

        for(Product p : products)
        {
            int prodwaranty = p.getWaranty();
            if(prodwaranty< currentYear)
                prodOutOfWarranty.add(p);
        }

        return prodOutOfWarranty;
    }

}