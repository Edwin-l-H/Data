public class Main
{

    public static void main(String[] args)
    {
        Data d = new Data(7,5);
        System.out.println(d);
        System.out.println(d.getMax());
        d.repopulate();
        System.out.println(d);
        System.out.println(d.countIncreasingCols());


        System.out.println();

        int[][] list1 = 
        {
            {10, 50, 40},
            {20, 40, 20},
            {30, 50, 30}
        };
        Data set1 = new Data(list1);
        System.out.println(set1);
        System.out.println(set1.countIncreasingCols());

        System.out.println();

        int[][] list2 =
        {
            {10, 540, 440, 400},
            {220, 450, 440, 190}
        };
        Data set2 = new Data(list2);
        System.out.println(set2);
        System.out.println(set2.countIncreasingCols());
    }
}