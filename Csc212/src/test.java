
public class test {

	public static void main(String[] args) {
		LinkedList<String> names=new LinkedList<String>();
		names.insert("Mohammed");
		names.insert("Ahmed");
		names.insert("Ali");
		names.insert("Saleh");
		names.findFirst();
		while(!names.last()) {
			System.out.println(names.retrieve());
			names.findNext();
		}
		System.out.print(names.retrieve());
		

	}

}
