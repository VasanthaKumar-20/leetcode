class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int row = 0, col = 0;
        for (int i = 0; i < commands.size(); i++) {
            switch (commands.get(i)) {
                case "LEFT":
                    col--;
                    break;
                case "RIGHT":
                    col++;
                    break;
                case "DOWN":
                    row++;
                    break;
                case "UP":
                    row--;
            }
        }
        return row * n + col;
    }
}