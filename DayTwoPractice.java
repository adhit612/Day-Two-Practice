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


	public static void main (String [] args){

		System.out.print(convertToArrayList(895));









	}

}