package com.yedam.generic;

public class Pair1 <K,V>{
	private K key;
	private V value;
	
	public Pair1(K key, V value) {
		this.key = key;
		this.value = value;
	}
	
	public K getKey() {return key;}
	public V getValue() {return value;}
}
