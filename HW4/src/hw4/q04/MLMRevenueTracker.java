/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hw4.q04;
import hw4.q03.MyHashTable;

/**
 *
 * @author Ramith Jayatilleka / @author Jery
 */
public class MLMRevenueTracker {
    
    public int getNetIncome(String salesmanName, MyHashTable<String, Integer> sales, MyHashTable<String,String> sponsors){
        int netIncome = (int) (0.9*this.getRevenue(salesmanName, sales, sponsors) - sales.get(salesmanName)/2);
        return netIncome;
    }
    
    public int getRevenue(String salesmanName, MyHashTable<String, Integer> sales, MyHashTable<String,String> sponsors){
        int revenue = sales.get(salesmanName);
        for (int i = 0; i < sponsors.getValues().size(); i++) {
            if(sponsors.getValues().get(i).equals(salesmanName)){
                revenue += 0.1* this.getRevenue(sponsors.getKeys().get(i),sales,sponsors);
            }
        }
        return revenue;
    }
}
