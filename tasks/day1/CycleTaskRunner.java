package tasks.day1;

public class CycleTaskRunner {
    static ForClass task1 = new ForClass();
    static WhileClass task2 = new WhileClass();
    static CreatEmptyArray task3 = new CreatEmptyArray();
    static ShowArrayElements task4 = new ShowArrayElements();
    static ShowArrayElementsMirror task5 = new ShowArrayElementsMirror();
    static MultiplyFive task6 = new MultiplyFive();
    static ToSquare task7 = new ToSquare();
    static SearchMinElement task8 = new SearchMinElement();
    static tasks.ChangeOrder task9 = new ChangeOrder();
    static SortElementsDescendingOrder task10 = new SortElementsDescendingOrder();

    public static void main(String[] args) {
        System.out.println("Sub task 1");
        task1.metFor();
        System.out.println();
        System.out.println("Sub task 2 ");
        new WhileClass().metWhile();
        task2.metWhile();
        System.out.println();
        System.out.println("Sub task 3");
        task3.metCreateNewEmptyArray();
        System.out.println();
        System.out.println("Sub task 4");
        task4.metPrintAllElementsFromArray();
        System.out.println();
        System.out.println("Sub task 5");
        task5.metprintAllElementsMirrorOder();
        System.out.println();
        System.out.println("Sub task 6");
        task6.metMultiplyFiveMethod();
        System.out.println();
        System.out.println("Sub task 7");
        task7.metPrintSquare();
        System.out.println();
        System.out.println("Sub task 8");
        task8.printMinElementArray();
        System.out.println();
        System.out.println("Sub task 9");
        task9.metPrintChangeOrderMethod();
        System.out.println();
        System.out.println("Sub task 10");
        task10.metPrintSortedArray();
        System.out.println();
    }
}
