package com.yedam.generic;

public class OtherPair1 <K, V> {
	private K key;
	private V value;
	
	public OtherPair1(K key, V value) {
		this.key = key;
		this.value = value;
	}
	
	public K getKey() {return key;}
	public V value() {return value;}
}
