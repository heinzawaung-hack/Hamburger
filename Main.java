class Main{
    public static void main(String[] args) {

    Hamburger myHamburger = new Hamburger("Basic","Fish",2.1,
            "White");
        double price = myHamburger.itemsAdditionBurger();
        myHamburger.addHamburgerAddition1("Tomato",0.22);
        myHamburger.addHamburgerAddition2("Lettuce",0.45);
        myHamburger.addHamburgerAddition3("Cheese", 1.32);
        System.out.println("Total hamburger price is " + myHamburger.itemsAdditionBurger());


    }
}