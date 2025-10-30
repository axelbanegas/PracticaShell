public class SortShell {
    public SortShell(){
        System.out.println("Metodo Shell");
    }

    public void sort(int[] numeros, boolean ase){
        int n = numeros.length;
        int comparaciones = 0;

        for (int gap = n/2; gap >= 1; gap /= 2) {
            for(int i = gap; i < n; i++){
                int temp = numeros[i];
                int j = i;
                int cambios = 0;

                comparaciones++; 

                while(j >= gap && numeros[j - gap] > temp){
                    comparaciones++; 
                    int origen = numeros[j - gap];
                    numeros[j] = origen;
                    System.out.println(" ");
                    System.out.println(origen + " cambia por " + temp);
                    cambios++;
                    j -= gap;
                }

                if (!(j >= gap && numeros[j - gap] > temp)) {
                }

                numeros[j] = temp;
                if (cambios > 0) {
                    comparaciones++; 
                    System.out.println("Se coloca " + temp + " en posición " + j);
                }
            }
        }

        System.out.println(comparaciones);
    }
}
