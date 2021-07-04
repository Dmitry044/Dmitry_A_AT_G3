package project.bubble;

//создать класс Bubble

public class BubbleClass {
    private double volume;
    private String composition;

    public Bubble03(String composition){
        this.volume = 0.3;
        this.composition = composition;
    }
    public static void burst(){
        System.out.println("Cramp");
    }

    public void setComposition(String composition) {
        this.composition = composition;
    }

    public String getComposition(){
        return composition:
    }

    public boolean getVolume(){
        return volume;
    }
}
