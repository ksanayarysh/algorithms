import java.util.Stack;

public class Evaluate {
    public void calc(String string){
        String s;

        Stack<String> ops = new Stack<>();
        Stack<Double> vals = new Stack<>();

        int beginIndex = 0;
        int endIndex;

        while (beginIndex < string.length()) {
            endIndex = (string.indexOf(' ', beginIndex) != -1? string.indexOf(' ', beginIndex) : string.length());

            s = string.substring(beginIndex, endIndex);
            System.out.println("s = " + s);
            beginIndex = endIndex + 1;
            System.out.println("beginIndex = " + beginIndex + "strlen = " + string.length());

            if (s.equals("("))                  ;
            else if (s.equals("+"))         ops.push(s);
            else if (s.equals("-"))         ops.push(s);
            else if (s.equals("*"))         ops.push(s);
            else if (s.equals("/"))         ops.push(s);
            else if (s.equals("sqrt"))         ops.push(s);
            else if (s.equals(")"))         {
                String op  = ops.pop();
                Double v = vals.pop();
                if (op.equals("+")) v = vals.pop() + v;
                else if (op.equals("-")) v = vals.pop() - v;
                else if (op.equals("*")) v = vals.pop() * v;
                else if (op.equals("/")) v = vals.pop() / v;
                else if (op.equals("sqrt")) v = Math.sqrt(v);
                vals.push(v);
                System.out.println("v = " + v);
            }
            else vals.push(Double.parseDouble(s));
        }
        System.out.println(vals.pop());
    }
}
