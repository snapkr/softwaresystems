package ss.week5;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapUtil {
	public static <K, V> boolean isOneOnOne(Map<K, V> map) {
		Object[] keyArray = map.keySet().toArray();
		Object[] valueArray = map.values().toArray();
		boolean tmp = true;
		
		for (int i = 0; i<keyArray.length;i++){
			int counter = 0;
			for ( int k = 0; k < valueArray.length;k++){
				if(keyArray[i] == valueArray[k]){
					counter++;
				}
			}
			if (counter != 1){
				tmp = false;
			}
		}

		return tmp;
	}

	public static <K, V> boolean isSurjectiveOnRange(Map<K, V> map, Set<V> range) {

		// TODO: implement, see exercise P-5.2
		return false;
	}

	public static <K, V> Map<V, Set<K>> inverse(Map<K, V> map) {
		// TODO: implement, see exercise P-5.3
		return null;
	}

	public static <K, V> Map<V, K> inverseBijection(Map<K, V> map) {
		// TODO: implement, see exercise P-5.3
		return null;
	}

	public static <K, V, W> boolean compatible(Map<K, V> f, Map<V, W> g) {
		// TODO: implement, see exercise P-5.4
		return false;
	}

	public static <K, V, W> Map<K, W> compose(Map<K, V> f, Map<V, W> g) {
		// TODO: implement, see exercise P-5.5
		return null;
	}
}
