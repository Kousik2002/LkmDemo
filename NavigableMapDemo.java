package map;
import java.util.*;
import java.util.NavigableMap;

public class NavigableMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NavigableMap<String,Double>map=new TreeMap<>();
		map.put("Morgan", 50000.00);
		map.put("Kousik", 308774.00);
		map.put("Cyril", 4546266.00);
		System.out.println(map.descendingMap());
		System.out.println(map.headMap("Morgan",true));
		System.out.println(map.tailMap("Cyril",true));
		System.out.println(map.subMap("Cyril",true,"Morgan",false));

	}

}
