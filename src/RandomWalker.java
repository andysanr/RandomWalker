public class RandomWalker {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int x = 0;
        int y = 0;
        int steps = 0;
        double distance = 0;

        System.out.println("(0, 0)");

        while (distance < r) {
            int randomNum = (int) (Math.random() * 4);
            switch(randomNum) {
                case 0: //north
                    y++;
                    break;
                case 1: //east
                    x++;
                    break;
                case 2: //south
                    y--;
                    break;
                case 3: //west
                    x--;
                    break;
            }
            steps++;
            distance = Math.abs(x) + Math.abs(y);
            System.out.println("(" + x + ", " + y + ")");
        }

        System.out.println("steps = " + steps);
    }
}
