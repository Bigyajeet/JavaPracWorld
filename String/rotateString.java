public class rotateString {
    public boolean rotateString(String s, String goal) {
           return s.length()==goal.length() && (s+s).contains(goal); // tc=O(n^2)

    }
}
