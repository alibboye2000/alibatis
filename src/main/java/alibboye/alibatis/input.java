/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alibboye.alibatis;
        
import javax.servlet.http.HttpServletRequest;



/**
 *
 * @author Ali B
 */
public class input {
    String getName;
 int getPrice, getAmount, getPay;
 public void getData(HttpServletRequest data){
 getName = data.getParameter("nmVegetable");
 getPrice = Integer.parseInt(data.getParameter("price"));
 getAmount = Integer.parseInt(data.getParameter("number"));
 getPay = Integer.parseInt(data.getParameter("pay"));
 }
}
    

