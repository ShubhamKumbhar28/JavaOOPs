
public class Book {
	private int bookid;
	private String title;
	private float price;
	private Author author;
	
	
	public Book(int bookid, String title,float price,int id, String name,String city) {
		this.bookid=bookid;
		this.title=title;
		this.price=price;
		
		this.author=new Author(id, name,city);
	}


	@Override
	public String toString() {
		return "Book [bookid=" + bookid + ", title=" + title + ", price=" + price + ", author=" + author + "]";
	}


	public float getPrice() {
		return price;
	}
	
	
	public String getCity() {
		return this.getCity();
	}


	public Author getAuthor() {
		return author;
	}
	
	


	

	
	

	
	
	
}
