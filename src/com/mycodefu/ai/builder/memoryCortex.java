package com.mycodefu.ai.builder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class memoryCortex {
private List<memoryCell> memories = new ArrayList<>();
public List<memoryCell> getCells(){
	return memories;
}
public List<RankedThought> search(String arg1) {
	char[] letters = arg1.toCharArray();
	List<RankedThought> results = new ArrayList<>();
	for(memoryCell s : memories) {
		thought th = s.dataCollect();
		boolean isExact = false;
		boolean isPartial = false;
		if(arg1.equals(th.getS())) {
			results.add(new RankedThought(100D, th));
			isExact = true;
		}
		if(th.getS().contains(arg1) && !isExact) {
			results.add(new RankedThought(10D, th));
			isPartial = true;
		}
		int let = 0;
		for(char c : letters) {
		if(th.getS().contains(c + "")) {
			let += 1;
		}
		}
		if(!(isExact || isPartial) && let > 2) {
			results.add(new RankedThought(0.001D*let, th));
		}
	}
	Collections.sort(results, new Comparator<RankedThought>() {
		@Override
		public int compare(RankedThought o1, RankedThought o2) {
			return Double.compare(o2.getNum(), o1.getNum());
		}
	});
	return results;
}
public void addMemory(thought memory) {
	memoryCell store = new memoryCell();
	store.dataInput(memory);
	memories.add(store);
}
}
