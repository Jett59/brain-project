package com.mycodefu.ai.builder;

public class RankedThought {
private double num;
private thought thought;
@Override
public String toString() {
	return thought.getS();
}
public double getNum() {
return num;
}
public thought getThought() {
return thought;
}
public RankedThought(double num, thought thought) {
this.num = num;
this.thought = thought;
}
}
