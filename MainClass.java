package aleksa;

public class MainClass {

	public static void main(String[] args) {
		MySet set = new MySet();
		try {
			//set.add(10);
			//set.add(-1); //test num
			set.add(20);
			set.add(30);
			set.add(40);
			set.add(50);
			set.add(21);
			set.add(22);
			set.add(31);
			set.add(11);
			//set.remove(0);
			set.modify(1, 5);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(set.toString());
	}

}
