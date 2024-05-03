

enum OperatorType {
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
            if(y==0){throw new ArithmeticException("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");}
            return (x / y);
        }
    };

    private final char symbol;

    OperatorType(char symbol) {
        this.symbol = symbol;
    }

    public static int fromOperator(int x, int y, char operator) {
        for (OperatorType type : OperatorType.values()) {
            if (type.symbol == operator) {
                return type.OPERATE(x, y);
            }
        }
        return 0;
    }

    public abstract int OPERATE(int x, int y);
}

