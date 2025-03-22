public class logic {
    public static void main(String[] args) {
        // if-Else statemets - for conditional flow

        boolean completedWork = false;
        // boolean canWatchAnime = true;

        if(completedWork) {
            
            // if the condition inside the if statement () is true then this block of code will be executed
            // operation or return something or print something
            System.out.println("Hey Saif you can watch anime");
        }

        int balance = 500;
        // buy a coffee of $10
        int coffeePrice = 10;

        if(balance > coffeePrice) { 
            System.out.println("You have enough balance to buy a coffee");
        } else {
            // else block will be executed on default if the 'if' condition fails

            System.out.println("You are broke!!!");
        }


        boolean hasInternet = true;

        // true and false - false
        // true and true - true
        // false and flase - false 
        if(balance > coffeePrice && hasInternet) {
            System.out.println("You have internet access and enough balance to buy a coffee");
        } else {
            System.out.println("You either don't have internet or broke!!!");
        }

        if(!hasInternet) {
            System.out.println("You do not have internet");
        } else {
            System.out.println("you have internet");
        }

        // else if to add extra condition to the logic tree
        if(balance > coffeePrice) {
            // do this
            System.out.println("Buy coffee");
        } else if(hasInternet) {
            // do this
            System.out.println("call papa to send money");
        } else { 
            // do this
            System.out.println("Do nothing");
        }

    }
    
}
