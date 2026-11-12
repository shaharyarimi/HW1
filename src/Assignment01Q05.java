public class Assignment01Q05 {
    public static int findShortestPath(int[][] m, int i, int j) {
        if (i == j)
            return 0;
        int [] distances = new int[m.length];
        for(int k=0; k<m.length;k++)
            distances[k] = -1;
        distances[i] = 0;
        int [] Q = new int[m.length];
        int headQ = 0 ;
        int tailQ = 1;
        Q[headQ] = i;
        int V;

        while (tailQ > headQ)
        {
            V = Q[headQ];
            headQ ++;
            for (int neighbor = 0 ; neighbor < m.length; neighbor++)
            {
                if (m[V][neighbor] == 1)
                {
                    if(distances[neighbor] == -1)
                    {
                        distances[neighbor] = distances[V]+1;
                        Q[tailQ] = neighbor;
                        tailQ ++ ;
                    }
                }
            }
        }
        if (distances[j] != -1)
            return  distances[j];
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 0, 1)); // -1
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 1, 1)); // 0
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,0}, {0,0,1,0}, {0,0,0,1}, {1,0,0,0}}, 0, 2)); // 2
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,1}, {0,0,0,1}, {0,0,0,0}, {0,0,1,0}}, 0, 2)); // 2
    }
}