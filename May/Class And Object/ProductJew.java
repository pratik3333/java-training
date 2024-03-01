import java.util.*;


/**
 * Product
 */
 class Product{
    private int id;
    private String name;
    private int price;

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id=id;
    }
    
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }

    public int getPrice()
    {
        return price;
    }

    public void setPrice(int price)
    {
        this.price=price;
    }
}


class ProductRecord{
    private Product product;

    public void setProduct(Product product)
    {
        this.product=product;

    }

    public void getProduct()
    {
        int id=product.getId();
        int price=product.getPrice();
        String name=product.getName();

        System.out.print(id + " " + name + " " + price);
    }
}

public class ProductJew {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Product product=new Product();
        ProductRecord pr=new ProductRecord();

        System.out.println("Enter product name id and price");

        String name=sc.nextLine();
        int id=sc.nextInt();
        int price=sc.nextInt();

        product.setName(name);
        product.setId(id);
        product.setPrice(price);

        pr.setProduct(product);

        pr.getProduct();

    }
}
