public class Book {
    String title;
    String author;
    double price;
    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;

    }
    public Book(String title,String author,double price) {
        this.title = title;
        this.author = author;
        this.price = price;

    }
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("author: " + author);
        System.out.println("price: " + price);
    }
    public void updatePrice(double newPrice) {
        if (newPrice >= 0) {
            System.out.println(price);
            price = newPrice;
        }
        if (newPrice <= 0) {
            System.out.println("Price error");
        }

    }
    public void applyDiscount(double discount) {
   if (discount > 0.0 && discount < 100.0){
       double adddiscount= price*(discount/100);
       price -= adddiscount ;
       System.out.println(" ADD Discount ");
       System.out.println(price);
        }
   else {
       System.out.println(" The discount percentage must be greater than 0.00 and less than 100.00 ");
   }



    }
}




