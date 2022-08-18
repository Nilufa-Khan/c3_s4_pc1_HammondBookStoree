package data;

public class Book extends Author {
    private long isbnNo;
    private String title;
    private String description;
    private double price;

    public long getIsbnNo() {
        return isbnNo;
    }

    public void setIsbnNo(long isbnNo) {
        this.isbnNo = isbnNo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void display(){
        System.out.println("isbnNo = " + isbnNo);
        System.out.println("title = " + title);
        System.out.println("description = " + description);
        System.out.println("price = " + price);
    }
}
