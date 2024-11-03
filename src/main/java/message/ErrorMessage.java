package message;

public enum ErrorMessage {

    IS_EMPTY("[ERROR] 빈 문자가 입력되었습니다."),
    CANNOT_BUY_LOTTO("[ERROR] 입력한 금액이 1,000원 단위로 나누어 떨어지지 않습니다."),
    CONTAINS_LETTER("[ERROR] 입력값에 숫자가 아닌 문자가 포함되어 있습니다.");

    private final String errorMessage;

    ErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
