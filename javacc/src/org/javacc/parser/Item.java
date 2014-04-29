package org.javacc.parser;

public class Item {
	private NormalProduction p = new NormalProduction();
	private int offset = 0;
	private int la;
	private boolean isFirst = false;
	private boolean isLast = false;

	
	public boolean isFirst() {
		return isFirst;
	}
	public void setFirst(boolean isFirst) {
		this.isFirst = isFirst;
	}
	public boolean isLast() {
		return isLast;
	}
	public void setLast(boolean isLast) {
		this.isLast = isLast;
	}
	public int getOffset() {
		return offset;
	}
	public void setOffset(int offset) {
		this.offset = offset;
	}
	public NormalProduction getP() {
		return p;
	}
	public void setP(NormalProduction p) {
		this.p = p;
	}
	public int getLa() {
		return la;
	}
	public void setLa(int la) {
		this.la = la;
	}
	

}
