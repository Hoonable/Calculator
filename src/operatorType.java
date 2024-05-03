

enum operatorType {
    ADD('+') {
        public int OPERATE(int x, int y) {
            return (x + y);
        }
    },
    SUB('-') {
        public int OPERATE(int x, int y) {
            return (x - y);
        }
    },
    MUL('*') {
        public int OPERATE(int x, int y) {
            return (x * y);
        }
    },
    DIV('/') {
        public int OPERATE(int x, int y) {
            return (x / y);
        }
    };

    private final char symbol;

    operatorType(char symbol) {
        this.symbol = symbol;
    }

    public static int fromOperator(int x, int y, char operator) {
        for (operatorType type : operatorType.values()) {
            if (type.symbol == operator) {
                return type.OPERATE(x, y);
            }
        }
        return 0;
    }

    public abstract int OPERATE(int x, int y);
}

