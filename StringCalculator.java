public class StringCalculator {
    public int Calculator(String arg) /*throws Exception*/ {
        int res = 0;
        String regex = ",\n";

        if (arg == null) {
            return res;
        }

        if (arg.length() == 1) {
            return Integer.parseInt(arg);
        }

        if (arg.length() > 2 && arg.substring(0,2).equals("//")) {
            regex += arg.charAt(2);
            arg = arg.substring(3);
        }

        String[] operands = arg.split("["+regex+"]");

        for (String operand : operands) {
            int number = Integer.parseInt(operand);

            /*if (number < 0) {
                throw new Exception("Negative params are not allowed.");
            }*/

            if (number <= 1000) {
                res += number;
            }
        }

        return res;
    }
}