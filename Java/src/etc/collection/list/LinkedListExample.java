package etc.collection.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<>();
		
		//추가
		list.add("홍길동");
		list.add("김철수");
		list.add("박영희");
		
		list.addFirst("맨 앞");
		list.addLast("맨 뒤");
		System.out.println(list);
		
		System.out.println(list.get(3));
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		
		list.remove(0);
		System.out.println(list);
		
		
		//LIFO = last in first out -> stack 자료구조
		  // 마지막으로 들어왔던 게 먼저 나간다. (java 블록 구조와 비슷
		// push, pop, peek
		list.push("김뽀삐"); //앞에서부터 추가
		System.out.println(list);
		
		//삭제하면서 데이터 읽기
		System.out.println(list.pop()); //가장 첫번째 값이 (삭제되며) 튀어나옴. 
		System.out.println(list);

		
		//삭제하지 않으면서 데이터 읽기
		System.out.println(list.peek()); //가장 첫번째 값이 튀어나옴. 
		System.out.println(list);
		
		//FIFO -> first in first out -> Queue 자료구조
		  // 처음으로 들어온게 먼저 나간다. (대기열과 비슷)
		//offer, poll, peek
		list.offer("a"); //마지막부터 추가
		list.offer("b"); //마지막부터 추가
		list.addLast("맨 뒤");
		
		System.out.println(list);
		
		System.out.println(list.poll());
		System.out.println(list);
		
		
		
		
		
	}

}























