package arrays.two_d;

import java.util.*;

public class ChessAndQueen {

    public static void main(String[] args) {
        // Example input
        int n = 8;  // board size
        int k = 1;  // number of obstacles
        int r_q = 4; // queen's row
        int c_q = 4; // queen's column

        List<List<Integer>> obstacles = new ArrayList<>();
        obstacles.add(Arrays.asList(3, 5));  // example obstacle

        int result = queensAttack(n, k, r_q, c_q, obstacles);
        System.out.println("Total squares queen can attack: " + result);
    }

    public static int queensAttack(int n, int k, int r_q, int c_q, List<List<Integer>> obstacles) {
        int count = 0;

        for (int i = r_q + 1; i <= n; i++) {
            if (isObstacle(Arrays.asList(i, c_q), obstacles)) break;
            count++;
        }
        for (int i = r_q - 1; i > 0; i--) {
            if (isObstacle(Arrays.asList(i, c_q), obstacles)) break;
            count++;
        }
        for (int i = c_q - 1; i > 0; i--) {
            if (isObstacle(Arrays.asList(r_q, i), obstacles)) break;
            count++;
        }
        for (int i = c_q + 1; i <= n; i++) {
            if (isObstacle(Arrays.asList(r_q, i), obstacles)) break;
            count++;
        }

        int i = r_q + 1;
        int j = c_q + 1;
        while (i <= n && j <= n) {
            if (isObstacle(Arrays.asList(i, j), obstacles)) break;
            count++;
            i++;
            j++;
        }

        i = r_q - 1;
        j = c_q - 1;
        while (i > 0 && j > 0) {
            if (isObstacle(Arrays.asList(i, j), obstacles)) break;
            count++;
            i--;
            j--;
        }

        i = r_q + 1;
        j = c_q - 1;
        while (i <= n && j > 0) {
            if (isObstacle(Arrays.asList(i, j), obstacles)) break;
            count++;
            i++;
            j--;
        }

        i = r_q - 1;
        j = c_q + 1;
        while (i > 0 && j <= n) {
            if (isObstacle(Arrays.asList(i, j), obstacles)) break;
            count++;
            i--;
            j++;
        }

        return count;
    }

    public static boolean isObstacle(List<Integer> position, List<List<Integer>> obstacles) {
        return obstacles.contains(position);
    }
}
