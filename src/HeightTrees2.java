public class HeightTrees2 {
    public static int heightTree(int[] parent) {
        int res = 0;

        for (int i = 0; i < parent.length; i++) {
            int p = i, current = 1;
            while (parent[p] != -1) {
                current++;
                p = parent[p];
            }
            res = Math.max(res, current);
        }
        return res;
    }

    public static void main(String[] args) {
        int []parent = {9, 7, 5, 5, 2 ,9 ,9, 9, 2 ,-1};
        System.out.println("Длина дерева - "+heightTree(parent));
    }

}


