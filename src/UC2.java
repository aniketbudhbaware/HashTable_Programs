import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class UC2 {
	 public static void main(String[] args){
	        String str = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
	        String [] stringArray = str.split(" ");  //identifying what separated it
	        System.out.println(Arrays.toString(stringArray));

	        Map<String,Integer> map = new HashMap<String,Integer>();

	        for( String word : stringArray){
	            Integer number = map.get(word);         //map will iterate through each word.
	            //System.out.println(word);
	            if(number == null){
	                number = 1;                     //Initally everyindex will have null is nothing os we givr it 1 occurance is 1 time that word is present in that index
	            }
	            else{
	                number += 1;                    //later onjust keep adding 1 to it.
	            }
	            map.put(word,number);
	            System.out.println(word +":"+word.hashCode());

	        }

	        System.out.println("\n");
	        System.out.println("Word occurrences are : ");

	        for (Map.Entry<String, Integer> entry : map.entrySet()){

	            LinkedList list = new LinkedList();
	            String strKey = entry.getKey();
	            list.insert(strKey.hashCode());

	            System.out.println(entry.getKey()+ " : "+entry.getValue());
	            System.out.println("HashCode : ");
	            list.viewList();
	            System.out.println("\n");
	        }



	    }

}
