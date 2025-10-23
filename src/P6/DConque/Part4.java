package P6.DConque;


public record Part4() {
    public static int [] myArray(int n){
        int [] intArr = new int[n];

        for(int i = 0;i<n;i++){
            intArr[i] = (int) (Math.random()*100);
        }
        return intArr;
    }

    public static void printArray(int [] intArr){
        for(int i = 0;i<intArr.length;i++){
            System.out.print(intArr[i] + " ");
        }
    }

    public static void sortedArray(int [] intArr, boolean isINC){
        byte ori = (byte) (isINC ? 1 : -1);
        int tmp;
        for(int i = 0;i<intArr.length-1;i++){
            for(int j=0;j<intArr.length-1-i;j++){
                if(intArr[j]*ori>intArr[j+1]*ori){
                    tmp = intArr[j];
                    intArr[j] = intArr[j+1];
                    intArr[j+1] = tmp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int [] intArr = Part4.myArray(10);
        
        sortedArray(intArr, true);
        printArray(intArr);
    }
}
