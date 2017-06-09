package ITStep.homeworks.Calculator.Calculation;

enum Operation {

    addition("+") {
        @Override
        double action(double a, double b) {
            return a + b;
        }
    },
    subtraction("-") {
        @Override
        double action(double a, double b) {
            return a - b;
        }
    },
    multiplication("*") {
        @Override
        double action(double a, double b) {
            return a * b;
        }
    },
    division("/") {
        @Override
        double action(double a, double b) {
            return a / b;
        }
    };

    public static final String OPERATORPATTERN;

    static {
        OPERATORPATTERN = "([+-/*])";
    }

    private String sign;

    abstract double action(double a, double b);

    Operation(String sign) {
        this.sign = sign;
    }

    public static Operation takeOnValue(String sign) {
        for (Operation operation : values()) {
            if (operation.sign.equals(sign)) {
                return operation;
            }
        }
        return null;
    }
}
