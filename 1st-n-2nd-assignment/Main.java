import java.util.List;

public class Main 
{
    public static void main(String[] args) 
    {
        
        ProductService service = new ProductService();

        //hey services, add the products..
        service.addProduct(new Product("Asus Vivobook", "Laptop", "Brown Table",2022));
        service.addProduct(new Product("Type C", "Cable", "Black Drawer", 2024));
        service.addProduct(new Product("Mac Studio", "Computer", "White Table", 2025));
        service.addProduct(new Product("Focusrite Mixer", "Audio System", "White Table", 2025));
        service.addProduct(new Product("Asus Vivobook", "Laptop", "Brown Drawer", 2021));
        service.addProduct(new Product("Asus Rog", "Laptop", "Black Table", 2021));
        service.addProduct(new Product("Macbook pro", "Laptop", "Brown Drawer", 2022));
        service.addProduct(new Product("Wacom Pad", "Writing Pad", "Black Drawer", 2020));
        service.addProduct(new Product("Apple Keyboard", "Keyboard", "White Table", 2022));
        service.addProduct(new Product("Logitech Keyboard", "Keyboard", "Black Table", 2024));
        service.addProduct(new Product("Hdmi cable", "Cable", "Black Drawer", 2024));
        service.addProduct(new Product("Java Black Book", "Cable", "Shelf", 2024));
        service.addProduct(new Product("Logi Mouse", "Mouse", "Black Table", 2022));
        service.addProduct(new Product("Apple Mouse", "Mouse", "White Table", 2022));
        service.addProduct(new Product("Lenovo Mouse", "Mouse", "Black Drawer", 2022));
        service.addProduct(new Product("BlackBeast", "Computer", "White Table", 2020));

        /*List<Product> products = service.getAllProducts();
        //System.out.println(products);  This will print data in a single line 
        for(Product p : products){
            System.out.println(p);
        }

        System.out.println("================================================");

        System.out.println("a particular product");

        Product p = service.getProduct("Logi Mouse");
        System.out.println(p);

        System.out.println("================================================");

        List<Product> prod = service.getProductWithText("Black");
        for(Product productWithText : prod)
        {
            System.out.println(productWithText);
        }*/

        System.out.println(" =================================================================> ");
        System.out.println("1st Assignment");

        List<Product> prod = service.getProductAtPlace("Drawer");
        for(Product prodatplace : prod)
        {
            System.out.println(prodatplace);
        }

        System.out.println(" =================================================================> ");
        System.out.println("2nd Assignment");

        List<Product> prodWarranty = service.getProductOutOfWarranty();
        for(Product prodOutOfWarranty : prodWarranty)
        {
            System.out.println(prodOutOfWarranty);
        }

    }
}