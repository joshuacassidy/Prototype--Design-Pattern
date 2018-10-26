public class Main {
        public static void main(String[] args) {
            ToolCache.loadCache();

            Tool clone1 = (Tool) ToolCache.getTool(1);
            System.out.println("Tool : " + clone1.getType());

            Tool clone2 = (Tool) ToolCache.getTool(2);
            System.out.println("Tool : " + clone2.getType());

            Tool clone3 = (Tool) ToolCache.getTool(3);
            System.out.println("Tool : " + clone3.getType());

        }
}
