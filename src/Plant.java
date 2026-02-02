public class Plant {
    public int numWeeksOld;
    public String color;
    public boolean isEdible;

    public void Plant1(int xnumWeeksOld, String xcolor, boolean xisEdible){
        numWeeksOld = xnumWeeksOld;
        color = xcolor;
        isEdible = xisEdible;
        System.out.println("The plant is " + xnumWeeksOld + " weeks old. Its color is " + xcolor + ", and it is " + xisEdible + " that this plant is edible.");
    }



}
