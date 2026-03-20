import java.util.Arrays;

public class hIndex {
      public static int index(int[] citations) {
        int hIndex = 0;

        Arrays.sort(citations);

        for(int i = 0; i < citations.length; i++) {
            int f = citations.length - i;
            int j = citations[i];
            if(citations.length - i <= citations[i]) {
                hIndex = citations.length - i; 
                break;
            }
        }
        return hIndex;
    }

    public static void main (String[] args) {
        int[] first = {1,2,3,4,4,5,6};
        int[] second = {0,10,10,10};
        System.out.println(index(first));
        System.out.println(index(second));

    }
}
