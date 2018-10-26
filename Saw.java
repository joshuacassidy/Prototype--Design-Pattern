public class Saw extends Tool {

    public Saw(){
        type = "Saw";
    }

    @Override
    public void create() {
        System.out.println("Created " + type);
    }
}