package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private Boolean addExtraCheese;
    private Boolean addExtraToppings;
    private Boolean addTakeaway;



    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.addExtraCheese= false;
        this.addExtraToppings= false;
        this.addTakeaway = false;
        if(isVeg){
            this.price= 300;
        }else {
            this.price =400;
        }
        this.bill = "Base Price Of The Pizza: " + this.price + "\n";
    }

    public int getPrice(){
        int extraCheesePrice = 0;
        if (this.addExtraCheese) {
            extraCheesePrice = 80;
        }
        int extraToppingsPrice = 0;
        if (this.addExtraToppings) {
            if (this.isVeg) {
                extraToppingsPrice = 70;
            } else {
                extraToppingsPrice = 120;
            }
        }
        int paperBagPrice = 0;
        if (this.addTakeaway) {
            paperBagPrice = 20;
        }

        return this.price + extraCheesePrice + extraToppingsPrice + paperBagPrice;
    }

    public void addExtraCheese(){
        if (!this.addExtraCheese) {
            this.addExtraCheese = true;
            this.bill += "Extra Cheese Added: 80\n";
        }
    }

    public void addExtraToppings(){
        if (!this.addExtraToppings) {
            this.addExtraToppings = true;
            this.bill += "Extra Toppings Added: ";
            if (this.isVeg) {
                this.bill += "70\n";
            } else {
                this.bill += "120\n";
            }
        }
    }

    public void addTakeaway(){
        if (!this.addTakeaway) {
            this.addTakeaway = true;
            this.bill += "Paperbag Added: 20\n";
        }
    }

    public String getBill(){
        this.bill += "Total Price: " + this.getPrice() + "\n";
        return this.bill;
    }
}
