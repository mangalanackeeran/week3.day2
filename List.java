package week3.day2;

import java.util.ArrayList;

public class List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String li= {"Adam","Ben","Zara","Adam","Charlie","James","Ben"};
ArrayList<String> list= new ArrayList<String>();
list.add("Adam");
list.add("Ben");
list.add("Zara");
list.add("Adam");
list.add("Charlie");
list.add("James");
list.add("Ben");
for(int i=0;i<list.size();i++) {
	for(int j=i+1;j<=list.size()-1;j++)
	{
		if(list.get(i).equals(list.get(j)))
		{
		System.out.println(list.get(i));
		}
	}

}}}
	


