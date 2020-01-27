public class Hamburger {
    private String name;
    private String meat;
    private double prices;
    private String BreadRoll;


    private String addition1Name;
    private double addition1Price;

    private String addition2Name;
    private double addition2Price;

    private String addition3Name;
    private double addition3Price;

    private String addition4Name;
    private double addition4Price;

    public Hamburger(String name, String meat, double prices, String breadRoll) {
        this.name = name;
        this.meat = meat;
        this.prices = prices;
        BreadRoll = breadRoll;
    }

    public void addHamburgerAddition1(String name, double price){
        this.addition1Name = name;
        this.addition1Price = price;
    }

    public void addHamburgerAddition2(String name, double price){
        this.addition2Name = name;
        this.addition2Price = price;
    }

    public void addHamburgerAddition3(String name, double price){
        this.addition3Name = name;
        this.addition3Price = price;
    }

    public void addHamburgerAddition4(String name, double price){
        this.addition4Name = name;
        this.addition4Price =price;
    }

    public double itemsAdditionBurger(){
        double hamburgerPrice = this.prices;
        System.out.println(this.name + " Hamburger on a " + this.BreadRoll +
                " bread roll and  with " + this.meat +  " price is " + this.prices);

         if (this.addition1Name != null){
             hamburgerPrice += this.addition1Price;
             System.out.println("Added " + this.addition1Name + " For an extra " +
                     this.addition1Price);
         }

        if (this.addition2Name != null){
            hamburgerPrice += this.addition2Price;
            System.out.println("Added " + this.addition2Name + " For an extra " +
                    this.addition2Price);
        }

        if (this.addition3Name != null){
            hamburgerPrice += this.addition3Price;
            System.out.println("Added " + this.addition3Name + " For an extra " +
                    this.addition3Price);
        }

        if (this.addition4Name != null){
            hamburgerPrice += this.addition4Price;
            System.out.println("Added " + this.addition4Name + " For an extra " +
                    this.addition4Price);
        }

        return hamburgerPrice;
    }
}
