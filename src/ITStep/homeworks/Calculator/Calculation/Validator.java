package ITStep.homeworks.Calculator.Calculation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static ITStep.homeworks.Calculator.Calculation.Operation.OPERATORPATTERN;

class Validator {

    private static final String NUMBERPATTERN;
    private static final String STRINGPATTERN;
    static final Pattern pt;

    static {
        NUMBERPATTERN = "([-]*[\\d]*)";
        STRINGPATTERN = NUMBERPATTERN + OPERATORPATTERN + NUMBERPATTERN;
        pt = Pattern.compile(STRINGPATTERN);
    }

    String validationString() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String tempString;
        boolean b;
        do {
            System.out.println("Введите выражение вида: a + b либо a - b");
            tempString = reader.readLine().replace(" ", "");
            Matcher m = pt.matcher(tempString);
            b = m.matches();
        } while (!b);
        return tempString;
    }
}
