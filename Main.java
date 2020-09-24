package list_04_practice;

public class Main {
    public static void main(String[] args) {


    	String q = "777";
    	int qq = Integer.parseInt(q);
    	System.out.println(qq);
//    	Sample num = new Sample(1);
    	Sample str = new Sample("1222");
//    	System.out.println(num.o);
    	System.out.println(str.o);
//    	String ss = String.valueOf(num);
    	String aa = String.valueOf(str);
    	int i = Integer.parseInt(aa);
//    	System.out.println("ss="+ss);
    	System.out.println("aa="+i);
    }
//    これだと文字から数値への変換が例外になる。
}
class Sample{
	Object o;
	public Sample(Object o) {
		this.o=o;
	}
//	@Override
	public int toInsst() {
    	String aa = String.valueOf(o);

		return Integer.parseInt(aa);
	}

}