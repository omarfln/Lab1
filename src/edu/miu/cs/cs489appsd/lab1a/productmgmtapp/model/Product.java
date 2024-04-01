package edu.miu.cs.cs489appsd.lab1a.productmgmtapp.model;

public class Product {
    private long productId;
    private String name;
    private String dateSupplied;
    private int quantityInStock;
    private double unitPrice;

    public Product() {}

    public Product(long productId, String name) {
        this.productId = productId;
        this.name = name;
    }

    public Product(long productId, String name, String dateSupplied, int quantityInStock, double unitPrice) {
        this.productId = productId;
        this.name = name;
        this.dateSupplied = dateSupplied;
        this.quantityInStock = quantityInStock;
        this.unitPrice = unitPrice;
    }

    // Getters and setters
    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateSupplied() {
        return dateSupplied;
    }

    public void setDateSupplied(String dateSupplied) {
        this.dateSupplied = dateSupplied;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
    public String toJson() {
        return String.format("\n{\"productId\": %d, \"name\": \"%s\", \"dateSupplied\": \"%s\", \"quantityInStock\": %d, \"unitPrice\": %.2f}",
                this.productId, this.name, this.dateSupplied, this.quantityInStock, this.unitPrice);
    }

    public String toXml() {
        return String.format("<product productId=\"%d\" name=\"%s\" dateSupplied=\"%s\" quantityInStock=\"%d\" unitPrice=\"%.2f\"/>",
                this.productId, this.name, this.dateSupplied, this.quantityInStock, this.unitPrice);
    }

    public String toCsv() {
        return String.format("%d, %s, %s, %d, %.2f",
                this.productId, this.name, this.dateSupplied, this.quantityInStock, this.unitPrice);
    }

    @Override
    public String toString() {
        return String.format("%d, %s, %s, %d, %.2f",
                this.productId, this.name, this.dateSupplied, this.quantityInStock, this.unitPrice);
    }
}
