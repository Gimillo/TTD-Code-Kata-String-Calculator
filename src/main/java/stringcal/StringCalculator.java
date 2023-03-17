package stringcal;

/**
 * Calculator class.
 * @author Jaime Gimillo Bonaque
*/
public class StringCalculator {
    /**
     * Main calculator.
     * @param arg operation to execute
     * @return result of operation
     */
    public int calculator(String arg) {
        int res = 0;
        String regex = ",\n";
        String str = arg;
        final int maxlegth = 1000;
        final int extrapos = 2;
        
        if (str == null) {
            return res;
        }
        
        if (str.length() == 1) {
            return Integer.parseInt(str);
        }
        
        if (str.length() > 2 && str.substring(0, extrapos).equals("//")) {
            regex += str.charAt(extrapos);
            str = str.substring(extrapos + 1);
        }
        
        String[] operands = str.split("[" + regex + "]");
        
        for (String operand : operands) {
            int number = Integer.parseInt(operand);
            
            if (number <= maxlegth) {
                res += number;
            }
        }
        
        return res;
    }
}
