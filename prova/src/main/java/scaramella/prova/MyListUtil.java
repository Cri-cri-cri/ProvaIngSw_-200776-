package scaramella.prova;

import java.util.List;
import java.util.Comparator;
import java.util.Collections;
public class MyListUtil 
{
	public static List<Integer>  ordinaCrescente (List<Integer> x){
	 Comparator<Integer> compare = new Comparator <Integer> (){
			public int compare (Integer primo, Integer secondo) {
				if (primo>secondo)
					return primo;
					else return secondo;
			}
		};
		
		 Collections.sort(x,compare);
		return x;
		
	}
	
	public static List<Integer> ordinaDecrescente (List<Integer> x){
		 Comparator<Integer> compare = new Comparator <Integer> (){
				public int compare (Integer primo, Integer secondo) {
				if (primo<secondo)
					return primo;
					else return secondo;
				}
			};
			
			 Collections.sort(x,compare);
			return x;
			
		}
	
    public static void main( String[] args )
    {
    }
}
