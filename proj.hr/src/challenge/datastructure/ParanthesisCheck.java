package challenge.datastructure;

public class ParanthesisCheck {
    public static void main(String[] args) {
        ParanthesisCheck pc = new ParanthesisCheck();
        //System.out.println(pc.checkValidString("(*))"));
        //System.out.println(pc.checkValidString("(*)))"));
        //System.out.println(pc.checkValidString(""));
        System.out.println(pc.checkValidString("(*)))"));
        System.out.println(pc.checkValidString("(*))"));
    }
    public boolean checkValidString(String s) {
        int max_open_left = 0, min_open_left = 0;
        char[] charr = s.toCharArray();
        for(char c: charr){
            if(c == '(')
                min_open_left++;
            else if(min_open_left > 0)
                min_open_left--;
            if(c != ')')
                max_open_left++;
            else if (max_open_left == 0)
                return false;
            else
                max_open_left--;
        }

        return min_open_left == 0;
    }
}
