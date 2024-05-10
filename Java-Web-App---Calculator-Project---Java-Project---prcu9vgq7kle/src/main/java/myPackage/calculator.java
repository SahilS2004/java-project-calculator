package myPackage;

public class calculator {
	protected double performOperation (double operand1, double operand2, String operation) {
		try{
			if (operation.equals("add") ) {
				Addition sum = new Addition();
				return sum.add(operand1, operand2);
			}
			else if (operation.equals("subtract") ) {
				Subtraction sub = new Subtraction();
				return sub.sub(operand1, operand2);
			}
			else if (operation.equals("multiply") ) {
				Multiplication mul = new Multiplication();
				return mul.mul(operand1, operand2);
			}
			else if (operation.equals("divide") ) {
				Division div = new Division();
				return div.div(operand1, operand2);
			}
			else if (operation.equals("power") ) {
				Power pow = new Power();
				return pow.power(operand1, operand2);
			}
		}catch(Exception err) {
			System.out.println("IllegalArgumentException.");
		}
		return -1;
	}
}