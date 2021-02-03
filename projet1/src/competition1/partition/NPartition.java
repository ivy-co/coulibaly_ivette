package competition1.partition;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 *@author COULIBALY Ivette & ADALA Siwar
 *
 * This class implements a List partitioning method @nPartition .
 */


public class NPartition {
	
	
	/**
	 * partitions a list into N segments
	 * @param <T> the type of list's elements
	 * @param objs
	 * @param N the number of segments wanted 
	 * @return a list of segments ( list of lists)
	 */
	public static <T> List<List<T>> nPartition(List<T> objs, final int N) {
		if(N <= 0) {
			throw new IllegalArgumentException("N must be strictly greater than 0 !");
		} 
	    return new ArrayList<>(IntStream.range(0, objs.size()).boxed().collect(
	            Collectors.groupingBy(e->e%N,Collectors.mapping(e->objs.get(e), Collectors.toList()))).values());
	}

}
