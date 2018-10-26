public class Hammer extends Tool {

    public Hammer(){
        type = "Hammer";
    }

    @Override
    public void create() {
        System.out.println("Created " + type);
    }
}