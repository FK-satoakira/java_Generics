package list_04_practice;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    	Object s = new Hero();
    	print((Hero)s,3);

		ArrayList list = new ArrayList(); /*この書き方なら複数の型を一つのlistに入れることが可能*/
    	list.add(1);
    	list.add(2);
    	list.add(3);
    	list.add(4);
    	list.add("a");
    	list.add(s);
    	for (Object o : list) {
			System.out.println(o);
		}
    	System.out.println(list.size());
    }

    public static void print(Hero a,int b) {
    	for (int i = 0; i < (Integer)b; i++) {
    		System.out.println(a);
    	}
    }
}
class Hero{
	String name;

	@Override
	public String toString() {
		return "Hero [name=" + name + "]";
	}

}