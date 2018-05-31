package com.basic;

public class Invoice {
	String partNumber;
	String partDescripition;
	int quantityOfItem;
	double pricePerItem;
	double totalInvoiceAmount;
	public String getPartNumber() {
		return partNumber;
	}
	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}
	public String getPartDescripition() {
		return partDescripition;
	}
	public void setPartDescripition(String partDescripition) {
		this.partDescripition = partDescripition;
	}
	public int getQuantityOfItem() {
		return quantityOfItem;
	}
	public void setQuantityOfItem(int quantityOfItem) {
		if(quantityOfItem<0){
			this.quantityOfItem=0;
		}else
		this.quantityOfItem = quantityOfItem;
	}
	
	public double getPricePerItem() {
		return pricePerItem;
	}
	public void setPricePerItem(double pricePerItem) {
		if(pricePerItem<0)
		{
			this.pricePerItem=0;
		}else
		this.pricePerItem = pricePerItem;
	}
	public double getInvoiceAmount(){
		totalInvoiceAmount=quantityOfItem*pricePerItem;
		return totalInvoiceAmount;

	}



	public static void main(String[] args){
		Invoice Invoice1=new Invoice();
		Invoice Invoice2=new Invoice();
		Invoice Invoice3=new Invoice();
		Invoice1.setPartDescripition("chocolate");
		Invoice1.setPartNumber("1234");
		Invoice1.setQuantityOfItem(7);
		Invoice1.setPricePerItem(15);
		System.out.println("First InvoiceAmount is" +" " +Invoice1.getInvoiceAmount());
		Invoice2.setPartDescripition("Motor");
		Invoice2.setPartNumber("7316");
		Invoice2.setQuantityOfItem(5);
		Invoice2.setPricePerItem(15000.45);
		System.out.println("Second InvoiceAmount is" +" " +Invoice2.getInvoiceAmount());
		Invoice3.setPartDescripition("Laptop");
		Invoice3.setPartNumber("1456");
		Invoice3.setQuantityOfItem(3);
		Invoice3.setPricePerItem(14567);
		System.out.println("Third InvoiceAmount is" +" " +Invoice3.getInvoiceAmount());
}
}