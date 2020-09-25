package list_04_practice;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
//String
    	Pocket p = new Pocket();

    	Book b = new Book();
//    	System.out.println(p);
//    	System.out.println(b);
    	b.setComment("good");
    	b.setPublishDate(new Date());
    	b.setTitle("titile");
//    	System.out.println(b);
    	p.put(b);
    	Book a = (Book) p.get();
//    	p.put(1);
    	System.out.println(p.get());
    	System.out.println(a.getPublishDate());
    	Pocket p1 = new Pocket();

//    	p1.put(214);
//    	p1.put("sda");
//    	int i2 = p1.get();
//    	Pocket<Book>にするとこのコメントの部分がコンパイルエラーになる。

    	System.out.println("p1="+p1.get());

//    	System.out.println("i="+i2);
    }

}
//    class Pocket{
//    	private Object data;
//
//		public Object get() {
//			return data;
//		}
//
//		public void put(Object data) {
//			this.data = data;
//		}
//    }
//    class Pocket<E>{
//    	private E data;
//
//		public E get() {
//			return data;
//		}
//
//		public void put(E data) {
//			this.data = data;
//		}
//    }
//    class Pocket<Book>{
//    	private Book data;
//
//		public Book get() {
//			return data;
//		}
//
//		public void put(Book data) {
//			this.data = data;
//		}
//    }
    class Pocket<E extends Book>{
    	private Book data;

		public Book get() {
			return data;
		}

		public void put(Book data) {
			this.data = data;
		}
    }

//    class Pocket=はどちらもStringを入れた後でもintを入れれる。
//    class Pocket<E>=(String)などのキャストがいらなくなる。
//    class Pocket<Book>=Bookしか入れられるというわけではない。
//    class Pocket<E extends Book>+Pocket<Book>→Bookだけいれれる。
//    <E extends Book>+Pocket<Book>以外、全体的にわりと自由だった。
