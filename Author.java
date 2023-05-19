
public class Author {
	private int id;
	private String name;
	private String city;
	
	
	public Author(int id,String name, String city) {
		this.id=id;
		this.name=name;
		this.city=city;
	}


	@Override
	public String toString() {
		return "Author [id=" + id + ", name=" + name + ", city=" + city + "]";
	}


	public String getCity() {
		return city;
	}
	
	


	
	
	

}

