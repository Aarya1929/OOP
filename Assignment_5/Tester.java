//Arraylist
package Assignment_5;

import java.util.*;
class Order {
	
	private int orderId;
	private List<String> itemName;
	private boolean cashOnDelivery;
	
	public Order(int orderId,List<String> itemName,boolean cashOnDelivery) {
		this.orderId=orderId;
		this.itemName=itemName;
		this.cashOnDelivery=cashOnDelivery;
	}
	
	public int getOrderId() {
		return orderId;
	}
	
	public void setOrderId(int orderId) {
		this.orderId=orderId;
	}
	
	public List<String> getItemName(){
		return itemName;
	}
	
	public void setItemName(List<String> itemName) {
		this.itemName=itemName;
	}
	
	public boolean isCashOnDelivery() {
		return cashOnDelivery;
	}
	
	public void setCashOnDelivery(boolean cashOnDelivery) {
		this.cashOnDelivery=cashOnDelivery;
	}
	
	@Override
	public String toString() {
		return "Order Id: "+getOrderId()+", Item names: "+getItemName()+", Cash on delivery: "+isCashOnDelivery();
	} 
	
}


class Tester{

	public static List<String> getItems(List<Order> orders) {
    	ArrayList<String> items=new ArrayList<String>();
    	for(Order order:orders) {
    		items.addAll(order.getItemName());
    	}
    	System.out.println(items);
		return items;
    }   	
 
public static void main(String[] args) {
		
		List<Order> orders = new ArrayList<Order>();
	
		List<String> items1 = new ArrayList<String>();
		items1.add("Jeans");
		items1.add("Shirt");
		items1.add("Belt");
		orders.add(new Order(101, items1, true));

		List<String> items2 = new ArrayList<String>();
		items2.add("Tie");
		items1.add("Shirt");
		orders.add(new Order(102, items2, true));

		List<String> items3 = new ArrayList<String>();
		items3.add("Tshirt");
		items3.add("Socks");
		items3.add("Tie");
		orders.add(new Order(103, items3, true));
		
		List<String> items = getItems(orders);
	}

}
