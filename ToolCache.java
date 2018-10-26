import java.util.Hashtable;

public class ToolCache {

    private static Hashtable<Integer, Tool> toolMap  = new Hashtable<>();

    public static Tool getTool(int toolId) {
        Tool cachedTool = toolMap.get(toolId);
        return (Tool) cachedTool.clone();
    }

    public static void loadCache() {
        int id = 0;
        Saw saw = new Saw();
        saw.setId(++id);
        toolMap.put(saw.getId(),saw);

        Hammer hammer = new Hammer();
        hammer.setId(++id);
        toolMap.put(hammer.getId(),hammer);

        Screwdriver screwdriver = new Screwdriver();
        screwdriver.setId(++id);
        toolMap.put(screwdriver.getId(),screwdriver);

    }
}