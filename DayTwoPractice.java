import java.util.ArrayList;

public class DayTwoPractice{

	public static ArrayList <Integer> convertToArrayList(int x){
		ArrayList <Integer> list = new ArrayList<>();

		while(x > 0){
			list.add(x%10);
			x /= 10;
		}

		ArrayList <Integer> listB = new ArrayList<>();

		for(int i = list.size() - 1; i >= 0; i --){
			listB.add(list.get(i));
		}
			return listB;
		}

	public static int convertToInt(ArrayList <Integer> list){
		int x = 1;
		int y = 0;

		for(int i = list.size()-1; i >= 0; i --){
			 y += list.get(i) * x;
			 x *= 10;
		}

		return y;
	}



	public static void main (String [] args){

	System.out.println(convertToArrayList(8950));

	ArrayList <Integer> list = new ArrayList<>();

	list.add(8);

	list.add(9);

	list.add(5);

	list.add(0);

	System.out.println(convertToInt(list));


















	}

}