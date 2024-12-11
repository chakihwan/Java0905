package _gui.entity;

public class ProductEntity {
    private String productNum;
    private String productName;
    private int StockNum;
    private int unitPrice;
    private String manufacturer;

    public String getProductNum() {
        return productNum;
    }


    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getStockNum() {
        return StockNum;
    }

    public void setStockNum(int stockNum) {
        StockNum = stockNum;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
