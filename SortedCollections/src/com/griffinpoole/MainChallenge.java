package com.griffinpoole;

import java.util.Map;

public class MainChallenge {
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
        Basket scottsBakset = new Basket("Scott");
        reserveItem(griffsBasket, "car", 1);
        System.out.println(griffsBasket);

        reserveItem(griffsBasket, "car", 1);
        System.out.println(griffsBasket);

        reserveItem(griffsBasket, "car", 1);
        reserveItem(scottsBakset, "car", 1);
        reserveItem(scottsBakset, "cup", 1);
        System.out.println(griffsBasket);
        System.out.println(scottsBakset);

        reserveItem(griffsBasket, "spanner", 5);
        System.out.println(griffsBasket);

        reserveItem(griffsBasket, "juice", 4);
        System.out.println(griffsBasket);
        unreserveItem(griffsBasket, "juice", 6);
        System.out.println(griffsBasket);
        unreserveItem(griffsBasket, "juice", 2);
        System.out.println(griffsBasket);
        unreserveItem(griffsBasket, "cup", 20);
        System.out.println(griffsBasket);

        reserveItem(griffsBasket, "cup", 4);
        reserveItem(griffsBasket, "bread", 1);
        System.out.println(griffsBasket);
        System.out.println(stockList);

        System.out.println();

        checkout(griffsBasket);
        System.out.println();

        System.out.println(griffsBasket);
        System.out.println(scottsBakset);
        System.out.println(stockList);
    }


    public static int unreserveItem(Basket basket, String item, int quantity){
        StockItem stockItem = stockList.get(item);
        if(basket.Items().containsKey(stockItem)){
            int quantReserved = basket.Items().get(stockItem);
            if(quantity <= quantReserved){
                stockItem.unreserveStock(quantity);
                return basket.adjustReserved(stockItem, -1*quantity);
            }
        }
        return 0;
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

    public static void checkout(Basket basket){
        double totalCost = 0;
        System.out.println("Checking out:");
        for(Map.Entry entry : basket.Items().entrySet()){
            StockItem item = (StockItem) entry.getKey();
            Integer inBasket = (Integer) entry.getValue();
            stockList.adjustStock(item.getName(), -1*inBasket);
            item.unreserveStock(inBasket);
            System.out.print(item);
            System.out.print(" #: " + inBasket);
            double itemizedPrice = item.getPrice()*inBasket;
            System.out.println(" Total: " + itemizedPrice);
            System.out.println("============================================");
            totalCost += itemizedPrice;
        }
        System.out.println("Final Total: " + totalCost);
        basket.clear();
    }
}
