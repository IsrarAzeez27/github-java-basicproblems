public class PrintMaxNumFromMinNumRow {
    public static void main(String[] args) {


        int [][] a = {{2,3,4},{5,6,7},{8,9,1}};
        int min = a[0][0];
        int minColumn = 0;

        for(int i=0; i<3; i++){ // row
            for(int j=0; j<3; j++){ // column
                if(a[i][j]<min){
                    min = a[i][j];
                    minColumn = j;
                }
            }
        }

        int max = a[0][minColumn];
        int k = 0;
        while(k<3){
            if(a[k][minColumn] > max){
                max = a[k][minColumn];
            }
            k++;
        }
        System.out.println(max);
    }

}