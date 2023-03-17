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
        String regex = ",\n", str = arg;

        if (str == null) {
            return res;
        }

        if (str.length() == 1) {
            return Integer.parseInt(str);
        }

        if (str.length() > 2 && str.substring(0, 2).equals("//")) {
            regex += str.charAt(2);
            str = str.substring(3);
        }

        String[] operands = str.split("[" + regex + "]");

        for (String operand : operands) {
            int number = Integer.parseInt(operand);

            if (number <= 1000) {
                res += number;
            }
        }

        return res;
    }
}
