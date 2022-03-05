package curs3.mostenire;

public class Rectangle {
	private int length;
	private int width;
	
	public Rectangle (int lt, int wd) {
		setLength(lt);
		setWidth(wd);
	}
	
	private int getLength() {
		return length;
	}
	private void setLength(int length) {
		this.length = length;
	}
	private int getWidth() {
		return width;
	}
	private void setWidth(int width) {
		this.width = width;
	}
	public int calculateArea() {
		return length*width;
	}

}
