package ChicagoCostumClass;

import java.util.ArrayList;
import java.util.List;

public class BookUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Book b1=new Book();
b1.title="Unbeatable mind";
b1.autor="Mark Devine";
b1.pages=300;
System.out.println(b1.title);

Book b2=new Book();
b2.title="Zero to one";
b2.autor="Blake Masters";
b2.pages=130;



Book b3=new Book();
b3.title="Sell or be Sols";
b3.autor="Grand Cardane";
b3.pages=150;
List<Book> myBook=new ArrayList<>();
myBook.add(b1);
myBook.add(b2);
myBook.add(b3);
for(Book book:myBook) {
	System.out.println(book.autor);
	System.out.println(book.title);
	System.out.println(book.pages);
}
	}

}
