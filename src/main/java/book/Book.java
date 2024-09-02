package book;

public class Book {
	
	private String title;
	private String author;
	private double price;
	private int pages;
	
	//Getter and Setters
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	
	public Book(String title, String author, double price, int pages) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
		this.pages = pages;
	}
	
	Book()
	{
		
	}
	
	
	

}
