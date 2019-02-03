package study;

public class Calc {
    public double add(double a, double b){
      double answer = a + b;
      return answer;
    }

    public double substract(double a, double b){
        double answer = a - b;
        return answer;
    }

    public double multiply(double a, double b){
        double answer = a * b;
        return answer;
    }

    public double divide(double a, double b){
        double answer = a / b;
        return answer;
    }

    public double power(double a, double b){
        double answer = a;
        if (b == 1){
            answer = a;
        }else {
            for (int i = 2; i <= b; i++) {
                answer *= a;
            }
        }

        return answer;
    }

    public double superCalc(String operation, double a, double b){
        double answer;
        switch(operation){
            case "+":
                answer = add(a,b);
                break;
            case "-":
                answer = substract(a,b);
                break;
            case "*":
                answer = multiply(a,b);
                break;
            case "/":
                answer = divide(a,b);
                break;
            case "^":
                answer = power(a,b);
                break;
            default:
                throw new IllegalArgumentException("Оператор не найден" + operation);
        }
        return answer;
    }
}
