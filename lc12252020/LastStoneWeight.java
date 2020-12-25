package lc12252020;

import java.util.PriorityQueue;

class LastStoneWeight{
	public int lastStoneWeight(int[] stones) {
        if(stones == null || stones.length == 0) return 0;
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(stones.length, Collections.reverseOrder());
        
        for(int i : stones) pq.add(i);
        
        while(pq.size() >= 2){
        	int x = pq.poll();
        	int y = pq.poll();
        	
        	if( x != y){
        		pq.add(x - y);	
        	}
        }
        
        if(pq.size() == 0) return 0;
        return pq.poll();
    }	
}