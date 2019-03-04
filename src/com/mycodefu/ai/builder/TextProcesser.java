package com.mycodefu.ai.builder;

public class TextProcesser {
	public TextProcesser() {
		super();
	}
	
	memoryCortex core = new memoryCortex();
	public void createMemory(thought t) {
		
	}
public String thinkAboutIt(String in) {
	RankedThought input = core.search(in).get(0);
	if(input.getNum() == 100) {
	return "You always say that!";
	}else if(input.getNum() > 9) {
		return input.getThought().getS();
	}else {
		return "I don't understand...";
	}
}
}
