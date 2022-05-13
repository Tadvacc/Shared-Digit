public class SharedDigit {
    
    public static boolean hasSharedDigit (int x, int y) {
        
        int x1 = 0;
        int y1 = 0;
        
        if ((x < 10) || (x > 99) || (y < 10) || (y > 99)) {
            return false;
        }
        
        while ((x > 10) && (y > 10)) {
            x1 = x % 10;
            y1 = y % 10;
            x /= 10;
            y /= 10;
            
            if ((x == y) || (x1 == y1) || (x == y1) || (x1 == y)) {
                break;
            } else {
                return false;
            }
        }
        return true;
    }
}
