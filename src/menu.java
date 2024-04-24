public class menu
{
    public static void main(String[] args)
    {
        String[] dishes = {"Izgara Tavuk", "Köfte", "Mantı", "Lahmacun", "Pide"};
        double[] prices = {25.0, 30.0, 35.0, 20.0, 28.0};
        int[] popularities = {4, 5, 3, 4, 4};

        System.out.println("Restoran Menüsü:");
        System.out.println("-----------------");
        for (int i = 0; i < dishes.length; i++)
        {
            System.out.println(dishes[i] + " - " + prices[i] + " TL (" + popularities[i] + "/5)");
        }
    }
}

