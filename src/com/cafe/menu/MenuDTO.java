package com.cafe.menu;

public class MenuDTO {
	private int menuNum;
	private int categoryNum;
	private String menuName;
	private String thumbnail;
	private String text;
	private int price;
	private int quantity=1; //�ֹ�����
	
	public int getMenuNum() {
		return menuNum;
	}
	public void setMenuNum(int menuNum) {
		this.menuNum = menuNum;
	}
	public int getCategoryNum() {
		return categoryNum;
	}
	public void setCategoryNum(int categoryNum) {
		this.categoryNum = categoryNum;
	}
	public String getMenuName() {
		return menuName;
	}
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	public String getThumbnail() {
		return thumbnail;
	}
	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	
}
