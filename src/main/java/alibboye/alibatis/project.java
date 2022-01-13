/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alibboye.alibatis;

/**
 *
 * @author Ali B
 */
public class project {
    int Initialtotal, discount;
    String percent;
 
 public void getDiscount(int Price, int Quantity){
    Initialtotal = Price * Quantity; 
    if (Initialtotal < 16000){
    percent = "0%";
    discount = Initialtotal - 0;
 }
 else if (Initialtotal < 25000){
 percent = "10%";
 discount = Initialtotal - (Initialtotal * 10 / 100);
 }
 else {
 percent = "15%";
 discount = Initialtotal - (Initialtotal * 15 / 100);
 }
 }
 
 int returns;
 public void getReturn(int Pay){
     
 }
}
    

