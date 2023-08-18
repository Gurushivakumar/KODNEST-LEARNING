package javapractice1;

public class LogicalOperatorValidator {	
	    private static boolean InputmeetsCondition;

		public static void main(String[] args) {
	        boolean isInputValid = true;
	        boolean InputmeetsCondition = true;

	        boolean isValid = isValidInput(isInputValid, InputmeetsCondition);

	        if (isValid) {
	            System.out.println("Input is valid.");
	        } else {
	            System.out.println("Input is not valid.");
	        }
	    }

	    public static boolean isValidInput(boolean isInputValid, boolean InputmeetsCondition) {	        
	        return isInputValid && InputmeetsCondition;
	    }
	}



