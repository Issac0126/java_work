package etc.collection.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LottoCreate {

	public static void main(String[] args) {
		
		
		
		Set<Integer> lotto = new HashSet<>();
		
		
		
		
		while(lotto.size()<6) {
			int num = (int) ((Math.random()*45)+1);
			lotto.add(num);
		}
		
		
		List<Integer> list = new ArrayList<>(lotto);
		Collections.sort(list);
		
		System.out.println(list);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}






























