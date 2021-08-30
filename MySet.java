package aleksa;

import java.util.ArrayList;
import java.util.Iterator;
//Ovo je samo moja verzija koda tako da ne mora da znaci da je ovo validno resenje
public class MySet {
	
	private ArrayList<Integer> set = new ArrayList<Integer>();
	public void add(int x) throws OutOfSegmentException, SameNumberException {
		if(x >= 10 * 10 * 10 * 10 * 10 * 10 * 10 * 10 * 10 || x < 1) {
			throw new OutOfSegmentException("Broj ispada iz opsega " + x);
		}
		if(set.size() == 100) {
			throw new OutOfSegmentException("Ispao iz opsega 100");
		}
		for(int i = 0; i < set.size(); i++) {
			if(set.get(i) == x) {
				throw new SameNumberException("Number " + x + " already exists");
			}
		}
		set.add(x);
	}
	public int remove(int digit) throws OutOfSegmentException, NotDigitException {
		if(set.isEmpty()) {
			throw new OutOfSegmentException("Set is empty");
		}
		if(digit > 9) {
			throw new NotDigitException("Well.. this isnt digit " + digit);
		}
		Iterator<Integer> it = set.iterator();
		int sum = 0;
		while(it.hasNext()) {
			int num = (int) it.next();
			if(num % 10 == digit) {
				sum = sum + num;
				it.remove();
			}
		}
		System.out.println(sum); //samo za testiranje
		return sum;
	}
	//svaki broj u skupu koji sadrzi cifru digit se mnozi sa p
	public void modify(int digit, int p) throws NotDigitException, MultiplyByZeroException { //Done
		if(digit > 9) {
			throw new NotDigitException("Well.. this isnt digit " + digit);
		}
		if(p == 0) {
			throw new MultiplyByZeroException("This is always zero because p is" + p);
		}
		
		for(int i = 0; i < set.size(); i++) {
			int num = set.get(i);
			int pom = 0;
			while(num > 0) {
				pom = num % 10;
				if(pom == digit) {
					num = num * p;
					System.out.println(num);
					break;
				} else num = num / 10;
			}
			
		}
	}
	@Override
	public String toString() {
		String s = " ";
		for(int i = 0; i < set.size(); i++) {
			s = s + set.get(i);
			if(i < set.size() - 1) {
				s = s + " , ";
			}
		}
		return s;
	}
	
	
}


//Pancic Aleksa 121