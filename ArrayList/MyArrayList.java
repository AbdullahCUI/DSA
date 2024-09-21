import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collection;
import java.util.Collections;

public class MyArrayList {
	public static void main(String[] args) {

		ArrayList<Integer> list= new ArrayList<Integer>();

		list.add(0);
		list.add(1);
		list.add(3);
		list.add(4);
		list.add(4);
		list.add(5);

		System.out.println("sort list:"+ list);

		//get method

		int element=list.get(4);

		System.out.println("Element At Index 4: "+element);

		//get element by loop

		System.out.println("get all list Element");
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i)+ " ");
		}

		System.out.println();

		Scanner reader= new Scanner(System.in);

		System.out.print("Enter Number of Element:");
		int arrayNumber=reader.nextInt();

		for(int i=0; i<=arrayNumber; i++){
			System.out.print("Enter Element: "+ (i+1)+ ":");

			int listElement =reader.nextInt();
			list.add(listElement);
		}

		reader.close();

		System.out.println("user List Element: "+ list);

		//sorting list after user input
		Collections.sort(list);
		System.out.println("after sorting: "+list);
}
}