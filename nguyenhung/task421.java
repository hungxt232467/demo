public class task421 {
    public static void main(String[] args) {
        int count, square, cube;
        for (count = 1; count < 300; count++) {
            if (count % 3 == 0) {
                continue;
            }
            square = count * count;
            cube = count * count * count;
            System.out.printf("\nSquare of%d is %d and Cube is %d", count, square, cube);
        }
    }
}