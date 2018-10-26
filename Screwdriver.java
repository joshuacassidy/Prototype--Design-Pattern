public class Screwdriver extends Tool {

    public Screwdriver(){
        type = "Screwdriver";
    }

    @Override
    public void create() {
        System.out.println("Created " + type);
    }
}