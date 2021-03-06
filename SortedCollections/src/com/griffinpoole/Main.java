package com.griffinpoole;

public class Main {
    private static StockList stockList = new StockList();

    public static void main(String[] args) {
        StockItem temp = new StockItem("bread", 0.86, 100);
        stockList.addStock(temp);

        temp = new StockItem("cake", 1.10, 7);
        stockList.addStock(temp);
        temp = new StockItem("car", 12.50, 2);
        stockList.addStock(temp);
        temp = new StockItem("chair", 62.00, 10);
        stockList.addStock(temp);
        temp = new StockItem("cup", 0.50, 200);
        stockList.addStock(temp);
        temp = new StockItem("cup", 0.45, 7);
        stockList.addStock(temp);
        temp = new StockItem("door", 72.95, 4);
        stockList.addStock(temp);
        temp = new StockItem("juice", 2.50, 36);
        stockList.addStock(temp);
        temp = new StockItem("phone", 96.99, 35);
        stockList.addStock(temp);
        temp = new StockItem("towel", 2.40, 80);
        stockList.addStock(temp);
        temp = new StockItem("vase", 8.76, 40);
        stockList.addStock(temp);

        System.out.println(stockList);

        Basket griffsBasket = new Basket("Griff");
        reserveItem(griffsBasket, "car", 1);
        System.out.println(griffsBasket);

        reserveItem(griffsBasket, "car", 1);
        System.out.println(griffsBasket);

        reserveItem(griffsBasket, "car", 1);
        System.out.println(griffsBasket);

        reserveItem(griffsBasket, "spanner", 5);
        System.out.println(griffsBasket);

        reserveItem(griffsBasket, "juice", 4);
        reserveItem(griffsBasket, "cup", 12);
        reserveItem(griffsBasket, "bread", 1);
        System.out.println(griffsBasket);
        System.out.println(stockList);

//        temp = new StockItem("pen", 1.12);
//        stockList.Items().put(temp.getName(), temp);
        stockList.Items().get("car").adjustStock(2000);
        System.out.println(stockList);

    }

    public static int reserveItem(Basket basket, String item, int quantity){
        //retrieve item from stock list
        StockItem stockItem = stockList.get(item);
        if(stockItem == null){
            System.out.println("We don't sell " + item);
            return 0;
        }
        if(stockList.reserveStock(item, quantity) != 0){
            basket.addToBasket(stockItem, quantity);
            return quantity;
        }
        return 0;
    }


}
