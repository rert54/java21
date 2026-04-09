package 워크샵07_app1;


public class CalcTest {

    public static void main(String[] args) {

    	if(args.length != 3) {
    		System.out.println("다시 입력하세요");
    		return;
    	}

        try {
        	int num1 = Integer.parseInt(args[0]);
        	String operator = args[1];
        	int num2 = Integer.parseInt(args[2]);
        	
        	Calculator calc = new Calculator();
        	
        	switch (operator) {
        		case "+":
        		calc.plus(num1, num2);
        		break;
        		case "-":
        		calc.minus(num1, num2);
        		break;
        		case "x":
        		calc.multiplication(num1, num2);
        		break;
        		case "*":
        		calc.multiplication(num1, num2);
        		break;
        		case "/":
        		calc.divide(num1, num2);
        		break;
        		default:
        			System.out.println("연산 기호를 확인하세요");
        	}
        	
        }catch(NumberFormatException e) {
        			System.out.println("숫자를 확인하세요");
        		
        }
    }
}
