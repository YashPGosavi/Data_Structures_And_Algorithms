// Que. Given a route containing 4 directions (E, W, N, S), find the shortest path to reach destination.

public class _4_shortestPath {

    public static float shortestPath(String Path) {
        int x = 0, y = 0;
        for (int i = 0; i < Path.length(); i++) {
            char path = Path.charAt(i);

            //West
            if (path == 'W' || path == 'w') {
                x -= 1;
            }
            //East
            else if (path == 'E' || path == 'e') {
                x += 1;
            }
            // South
            else if (path == 'S' || path == 's') {
                y -= 1;

            }
            // North
            else if (path == 'N' || path == 'n') {
                y += 1;
            }
        }
        int x2 = x*x, y2 = y*y;
 
        return (float)Math.sqrt(x2+y2);
    }

    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println(shortestPath(path));
    }
}