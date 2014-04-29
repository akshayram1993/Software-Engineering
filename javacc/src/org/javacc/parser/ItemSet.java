package org.javacc.parser;

import java.util.*;

public class ItemSet {
	private int index;
	private List<Item> itemSet = new ArrayList<Item>();
	public List<Item> getItemSet() {
		return itemSet;
	}
	public void setItemSet(List<Item> itemSet) {
		this.itemSet = itemSet;
	}
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
}
