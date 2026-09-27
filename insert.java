	public class Main {
    public static void main(String[] args) {
        int[ ][ ] numbers = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };
        numbers[1][1] = 100;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}
