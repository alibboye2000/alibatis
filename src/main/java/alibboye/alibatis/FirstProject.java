/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alibboye.alibatis;

/**
 *
 * @author Ali B
 */
public class FirstProject {
    String name;
    double price, qty, discount, pay_amount;
    
    public void setDiscount(double discount) {
        this.discount = discount;
        
        System.out.println("---WELCOME TO ALI SHOP----");
        System.out.println("Please select the Item you want to by");

        System.out.print("Enter Fruit Name: ");

        name = nextLine();
        

        System.out.print("Enter Price per Kilo: ");

        price = nextDouble();


        System.out.print("Enter Quantity you want: ");

        qty = nextDouble();

        System.out.println("Total Amount is:  D" + price * qty);

        System.out.print("Enter Discount: ");

        discount = nextDouble();


        System.out.print("Enter Amount Paid: ");

         pay_amount = nextDouble();

        double total = (price * qty) - discount;

        String comment;

        if(pay_amount > total){
            comment = " You have a change of D"+ (pay_amount - total);
        }else if(total > pay_amount){
            comment = " You are short by  D"+ (total - pay_amount);
        }else{
            comment = " Your money is right";
        }


        System.out.println("\n\n\n\n=======PRINT OUTPUT===========\n");

        System.out.println("Fruit Name: "+ name);
        System.out.println("Price: D"+price+" per Kg");
        System.out.println("Quantity: "+qty+" Kg");
        System.out.println("Discount: D"+discount);
        System.out.println("Total Price: D"+  total);
        System.out.println("Money Paid: D"+pay_amount);
        System.out.println("Comment: "+comment);


        

    }
    
    public class Item {

    protected String name;
    protected double qty;
    protected double price;
    protected double discount;
    
    public void getMe(){
    }


    public double getTotal(){
        return this.price * this.qty;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getQty() {
        return qty;
    }
    public void setQty(double qty) {
        this.qty = qty;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public double getDiscount() {
        return discount;
    }
    public void setDiscount(double discount) {
        this.discount = discount;
    }
    

    
}

    private String nextLine() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private double nextDouble() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

