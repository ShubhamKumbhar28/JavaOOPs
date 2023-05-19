import java.util.*;
public class Main {

	public static void main(String []args) {
		
		Scanner sc=new Scanner(System.in);
		Book []barr=new Book[2];
		for(int i=0 ; i<2;i++) {
			
			System.out.println("Enter bid");
			int bookid=sc.nextInt();
			System.out.println("Enter title");
			String title=sc.next();
			System.out.println("Enter price");
			float price=sc.nextFloat();
			System.out.println("Enter Author id");
			int id=sc.nextInt();
			System.out.println("Enter Author name");
			String name=sc.next();
			System.out.println("Enter Author city");
			String city=sc.next();
			
			barr[i]=new Book(bookid,title,price,id,name,city);	
			
			
		}
		
		for (Book i :barr){
			
			
			System.out.println(i);
		
		}
		for (Book i : barr) {
			
			if(i.getPrice()<50) {
				System.out.println("Low price");
				
			}else if (i.getPrice()<250) {
				System.out.println("Medium price");
			}else {
				System.out.println("High price");
			}
		}
		for (Book i :barr) {
			
			if(i.getAuthor().getCity().equals("Pune")) {
				System.out.println("Authors from location Pune are");
				System.out.println(i);
		}
		
		
			
		
		}}}
				


