public class Greenhouse {
    String name;
    boolean sprinklersOn;
    int numberOfFlowers;


    double randomNum;
    private Plant typeOfPlant;

    public static void main(String[] args) {
        Greenhouse greenhouse = new Greenhouse();
    }

    public Greenhouse(){
        System.out.println("Hello World! Good luck on you exams!");

        name = "Planting Parameters at the CSG";
        sprinklersOn = true;
        numberOfFlowers = 31;
        System.out.println("Welcome to " + name + "! It is " + sprinklersOn + " that we are watering plants right now. We have " + numberOfFlowers + " flowers!");

        numberOfFlowers = 71;
        System.out.println("Welcome to " + name + "! It is " + sprinklersOn + " that we are watering plants right not. We have " + numberOfFlowers + " flowers!");

        randomReplant();
        veggieOfTheDay("broccoli");
        countFlowers();
        changeTemperature();
        printInfo();
        starTriangle( 5);
        perimeterTriangle(5);
    }

    public void randomReplant(){
        int randomInt = (int)(Math.random()*16);
        System.out.println("We are replanting " + randomInt + " vegetables today!");
    }

    public void veggieOfTheDay(String veggie){
        System.out.println("Today's chosen veggie is " + veggie + ".");
    }

    public void countFlowers(){
        for (int x = 2; x< 7; x=x+1){
            System.out.println(x);
        }
        System.out.println(" "); //extra to help recognize where pattern ends

        for (int x = 20; x< 111; x=x+30){
            System.out.println(x);
        }
        System.out.println(" "); //extra to help recognize where pattern ends

        for (int x = 8; x>-1; x=x-1){
            System.out.print(x+", ");
        }
        System.out.println(" "); //extra to help recognize where pattern end
    }

    public void changeTemperature(){
        randomNum = (Math.random());

        if(randomNum<0.25){
            System.out.println("The temperature has decreased by 2 degrees.");
        }

        if(randomNum>=0.25 && randomNum<0.5){
            System.out.println("The temperature has decreased by 1 degree.");
        }

        if(randomNum>=0.5 && randomNum<0.75){
            System.out.println("The temperature has increased by 1 degree.");
        }

        if(randomNum>=0.75){
            System.out.println("The temperature has increased by 2 degree.");
        }
    }

    public void printInfo(){
        Plant kimPlant = new Plant();
        kimPlant.Plant1(3, "orange", true);

        Plant myPlant = new Plant();
        myPlant.Plant1(13, "blue", true);
    }

    public void starTriangle(int size){
        for (int y = 1; y<=size-1; y=y+1){
            System.out.println("*");
            for (int x =1; x<=y; x=x+1){
                System.out.print("* ");

            }

        }
        System.out.print("*");
        System.out.println(" ");
        System.out.println(" ");
    }

    public void perimeterTriangle(int size){
        for (int y = 1; y<=size-2; y=y+1){
            System.out.println("- ");
            System.out.print( "- ");

            for (int x =2; x<=y; x=x+1){
                System.out.print( "* ");

            }

        }
        System.out.print("-");
        System.out.println( );
        for(int z = 1; z<=size; z=z+1 ){
            System.out.print("- ");
        }
       // System.out.println("- -");
        System.out.println();


    }



}
