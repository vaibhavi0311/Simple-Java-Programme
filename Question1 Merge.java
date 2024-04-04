public class Question1 {
    
    public static void mergeArrays(int[] X, int[] Y) {
        int m = X.length;
        int n = Y.length;
        
        int k = m - 1;
        for (int i = m - 1; i >= 0; i--) {
            if (X[i] != 0) {
                X[k] = X[i];
                k--;
            }
        }
        
        int i = n;
        int j = 0;
        int idx = 0;
        while (i < m && j < n) {
            if (X[i] < Y[j]) {
                X[idx++] = X[i++];
            } else {
                X[idx++] = Y[j++];
            }
        }
        
        while (j < n) {
            X[idx++] = Y[j++];
        }
    }
    
    public static void main(String[] args) {
        int[] X = { 0, 2, 0, 3, 0, 5, 6, 0, 0 };
        int[] Y = { 1, 8, 9, 10, 15 };
        
        mergeArrays(X, Y);
        
        System.out.print("Merged Array X[] = { ");
        for (int i = 0; i < X.length; i++) {
            System.out.print(X[i] + (i == X.length - 1 ? " }\n" : ", "));
        }
    }
}
