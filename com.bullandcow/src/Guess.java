/**
 * Created with IntelliJ IDEA.
 * User: STU
 * Date: 12-10-21
 * Time: 下午4:12
 * To change this template use File | Settings | File Templates.
 */
public class Guess {
    private String standardNumber;
    public Guess(String s) {
        this.standardNumber = s;
    }

    public String compare(String s, String s1) {
        return null;  //To change body of created methods use File | Settings | File Templates.
    }

    public String validate(String s) {
          int a = 0;
          int b = 0;
        for (int i = 0; i < this.standardNumber.length(); i++){
            if (this.standardNumber.charAt(i) == s.charAt(i))
                a++;
            else
               if (s.contains(this.standardNumber.substring(i,i+1)))
                   b++;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(a);
        sb.append("A");
        sb.append(b);
        sb.append("B");
        return sb.toString();
       // return "4A0B";
       // return null;  //To change body of created methods use File | Settings | File Templates.
    }
}
