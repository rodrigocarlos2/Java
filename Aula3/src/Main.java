
import java.util.ArrayList;

public class Main {
	
	public static void main(String args[]){
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(4);
		list.add(3);
		list.add(5);
		
		list.remove(2);
		
		for(int i=0; i<list.size(); i++){
			System.out.println("Element "+(i+1)+": "+list.get(i));
		}
		
		int search_index = list.indexOf(3);
		
		System.out.println(list.get(search_index));
		
	}

}
