/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alibboye.alibatis;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Ali B
 */

@Controller
public class ControllerTable {
    input ip = new input();
    project cp = new project();
 

 
 @RequestMapping("/input")
 //@ResponseBody
 public String getResult(HttpServletRequest data,Model model){
    ip.getData(data);
    cp.getDiscount(ip.getPrice, ip.getAmount);
    cp.getReturn(ip.getPay);
 
         ip.getData(data);
        cp.getDiscount(ip.getPrice, ip.getAmount);
        cp.getReturn(ip.getPay);
        //name of vegetables, price per kilo, purchase amount, prepayment amount, discount amount, total discount price, price to be paid
 
        model.addAttribute("vegetablename", ip.getName );
        model.addAttribute("priceperkilo", ip.getPrice );
        model.addAttribute("amountofpurchase", ip.getAmount );
        model.addAttribute("amountpaid", ip.getPay );
        model.addAttribute("initialprice", cp.Initialtotal );
        model.addAttribute("discount", cp.percent );
        model.addAttribute("discountprice", cp.discount );
        model.addAttribute("return", cp.returns);
 
        return "htmlviewer"; 
 }
}
 

    
