
package sample;


public class BooleanFunction {
    private Boolean firstOperand;
    private Boolean secondOperand;


    public BooleanFunction() {
    }

    public BooleanFunction(Boolean firstOperand, Boolean secondOperand) {
        this.firstOperand = firstOperand;
        this.secondOperand = secondOperand;
    }

    public Boolean isSecondOperand() {
        return secondOperand;
    }

    public void setSecondOperand(Boolean secondOperand) {
        this.secondOperand = secondOperand;
    }

    public Boolean isFirstOperand() {

        return firstOperand;
    }

    public void setFirstOperand(Boolean firstOperand) {
        this.firstOperand = firstOperand;
    }

    public Boolean falseFunction() {
        return false;
    }

    public Boolean and() {

        if (isFirstOperand() == null && isSecondOperand() == null) return null;
        else if (isFirstOperand() == null) {
            if ((!isSecondOperand())) return false;
            else return null;
        } else if (isSecondOperand() == null) {
            if ((!isFirstOperand())) return false;
            else return null;

        }
        return isFirstOperand() & isSecondOperand();
    }

    public Boolean xAndNotY() {
        if (isFirstOperand() == null && isSecondOperand() == null) return null;
        else if (isFirstOperand() == null) {
            if ((isSecondOperand())) return false;
            else return null;
        } else if (isSecondOperand() == null) {
            if ((!isFirstOperand())) return false;
            else return null;

        }
        return isFirstOperand() & !isSecondOperand();
    }

    public Boolean x() {
        return isFirstOperand();
    }

    public Boolean notXAndY() {
        if (isFirstOperand() == null && isSecondOperand() == null) return null;
        else if (isFirstOperand() == null) {
            if ((!isSecondOperand())) return false;
            else return null;
        } else if (isSecondOperand() == null) {
            if ((isFirstOperand())) return false;
            else return null;

        }
        return !isFirstOperand() & isSecondOperand();
    }

    public Boolean y() {
        return isSecondOperand();
    }

    public Boolean xor() {
        if (isFirstOperand() == null || isSecondOperand() == null) return null;
        else return isSecondOperand() != isFirstOperand();
    }

    public Boolean or() {
        if (isFirstOperand() == null && isSecondOperand() == null) return null;
        else if (isFirstOperand() == null) {
            if ((isSecondOperand())) return true;
            else return null;
        } else if (isSecondOperand() == null) {
            if ((isFirstOperand())) return true;
            else return null;

        }
        return (isFirstOperand() || isSecondOperand());
    }

    public Boolean nor() {
        if (isFirstOperand() == null && isSecondOperand() == null) return null;
        else if (isFirstOperand() == null) {
            if ((isSecondOperand())) return false;
            else return null;
        } else if (isSecondOperand() == null) {
            if ((isFirstOperand())) return false;
            else return null;

        } else return !(isFirstOperand() || isSecondOperand());
    }

    public Boolean xnor() {
        if (isFirstOperand() == null && isSecondOperand() == null) return null;
        return isFirstOperand() == isSecondOperand();
    }

    public Boolean notY() {
        if (isSecondOperand() == null) return null;
        return !isSecondOperand();
    }

    public Boolean xOrNotY() {
        if (isFirstOperand() == null && isSecondOperand() == null) return null;
        else if (isFirstOperand() == null) {
            if ((!isSecondOperand())) return true;
            else return null;
        } else if (isSecondOperand() == null) {
            if ((isFirstOperand())) return true;
            else return null;

        }
        return isFirstOperand() || !isSecondOperand();
    }

    public Boolean notX() {
        if (isFirstOperand() == null) return null;
        return !isFirstOperand();
    }

    public Boolean notXorY() {
        if (isFirstOperand() == null && isSecondOperand() == null) return null;
        else if (isFirstOperand() == null) {
            if ((isSecondOperand())) return true;
            else return null;
        } else if (isSecondOperand() == null) {
            if ((!isFirstOperand())) return true;
            else return null;

        } else return !isFirstOperand() || isSecondOperand();
    }

    public Boolean nand() {
        if (isFirstOperand() == null && isSecondOperand() == null) return null;
        else if (isFirstOperand() == null) {
            if ((!isSecondOperand())) return true;
            else return null;
        } else if (isSecondOperand() == null) {
            if ((!isFirstOperand())) return true;
            else return null;

        } else return false;
    }

    public Boolean trueFunction() {
        return true;
    }
}
