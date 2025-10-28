public class App {
    public static void main(String[] args) throws Exception {
        int[] numeros = new int[]{5, 0, 8, 4, 9, 6, 7, 2, 3};
        SortShell sortshell = new SortShell();
        View view = new View();

        System.out.println("Original: ");
        view.printArray(numeros);
        sortshell.sort(numeros, false);
        System.out.println("Ordenado: ");
        view.printArray(numeros);
    }
}
