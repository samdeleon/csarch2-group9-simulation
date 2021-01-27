import java.util.Arrays;
import java.util.ArrayList;
import java.awt.*;
import java.awt.event.*;
public class restoring_division {

    /*
        What we have so far:
        1. filling A with one extra bit
        2. twos compliment
        3. shifting the string to the left with the insert
        4. sign extension
        5. the division step
        6. validation for strings

        What we don't have:
        1. output to text file
        2. adapt these methods into GUI (we have to remove the
        static keyword iirc)
        3. functionality of step-by-step button

        tbh i have only tested for the first two examples in the slides
        feel free to test the methods and edit if theres any errors
        hopefully my comments help yalls understand
    */

    public static RUDSimulator gui;
    public ArrayList<String> steps;
    public String initialization;
    public int stepCtr;
    public ArrayList<String> answerKey;

    public restoring_division() {
        gui = new RUDSimulator();

        // checks if Enter button in Input Menu has been clicked
		gui.btnEnter.addActionListener(new ActionListener() {
    		@Override
    		public void actionPerformed(ActionEvent event) {
				String dividend = gui.inputDividend.getText();
                String divisor = gui.inputDivisor.getText();
                Boolean radiobtn = false;

                // checks if radio buttons are empty (will be passed to validation function)
                if( !(gui.radiobtnAll.isSelected() || gui.radiobtnSteps.isSelected()) ) {
                    radiobtn = true;
                }

                // validation checking
                String [] arrayAnswer = validationCheck(dividend, divisor, radiobtn);

                boolean valid = Boolean.parseBoolean(arrayAnswer[0]);
                String message = arrayAnswer[1];
                String title = arrayAnswer[2];

                if(valid) {
                    boolean mode = true;mode = false;
                    if (gui.radiobtnAll.isSelected()){
                        mode = false;
                        CardLayout layout = (CardLayout)gui.card_container.getLayout();
                        layout.show(gui.card_container, "card3");

                    }
                    else if (gui.radiobtnSteps.isSelected()){
                        mode = true;
                        CardLayout layout = (CardLayout)gui.card_container.getLayout();
                        layout.show(gui.card_container, "card2");
                    }

                    dibision(dividend, divisor, mode); //will be replaced by display to the output page
                    gui.inputDividend.setText("");
                    gui.inputDivisor.setText("");
                    gui.btngroup.clearSelection();

                    gui.btnGenerateFile.setEnabled(false);

                    if(mode) { // step by step
                        gui.textAreaOutput1.append(initialization + "\n");
                    }
                    else { // show all
                        gui.textAreaOutput2.append(initialization + "\n");

                        int i=0;

                        for(i=0; i<steps.size(); i++) {
                            gui.textAreaOutput2.append(steps.get(i) + "\n");
                        }
                    }

                    stepCtr = 0;
                }
                else {
                    // shows errors in pop up message
                    gui.showErrorMessage(message, title);
                }
    		}
        });

        // checks if Next Step button in Output Steps has been clicked
        gui.btnNextStep.addActionListener(new ActionListener() {
    		@Override
    		public void actionPerformed(ActionEvent event) {
                // checks if steps arraylist is empty
                if(stepCtr < steps.size()) {
                    // gets string of step
                    String toPrint = steps.get(stepCtr);

                    // prints out the step
                    gui.textAreaOutput1.append(toPrint + "\n");

                    // increases stepctr
                    stepCtr++;

                    if(stepCtr == steps.size()) {
                        gui.btnNextStep.setEnabled(false);
                        gui.btnGenerateFile.setEnabled(true);
                    }
                }
                else {
                    gui.btnNextStep.setEnabled(false);
                    gui.btnGenerateFile.setEnabled(true);
                }

            }
        });

        // checks if Generate File button in Output Steps has been clicked
        gui.btnGenerateFile.addActionListener(new ActionListener() {
    		@Override
    		public void actionPerformed(ActionEvent event) {
                // code here for text file

                // shows message that it has successfully generated a text file
                gui.showSuccessMessage();
            }
        });

        // checks if Generate File button in Output All has been clicked - copy the same code above
        gui.btnGenerateFile2.addActionListener(new ActionListener() {
    		@Override
    		public void actionPerformed(ActionEvent event) {
                // code here for text file

                // shows message that it has successfully generated a text file
                gui.showSuccessMessage();
            }
        });
    }

    public String temp_print_row(String A, String Q){

        return "";
    }

    public String fill_A (int str_length){
        /*
            One way to fill a string with a specific character

            the function initializes a string that has a +1 size
            to represent the extra bit needed by A
        */
        char[] arr = new char[str_length + 1];
        /*
            Fills the new string with 0s
        */
        Arrays.fill(arr, '0');

        return new String(arr);
    }

    public String twos_compliment (String M){
        /*
            uses the shortuct method:
            - scans left to right
            - copys all the 0s until the first 1
            - copy first 1
            - swap each bit until all bits have been scanned
        */
        char[] arr = M.toCharArray();
        boolean found_first_1 = false;

        for (int i = M.length() - 1 ; i >=0 ; i--){
            /*
                while first 1 is not found
                just copies the zero

                when first 1 is found nothing still happens to the string
                found_first_1 is now true
            */
            if (!found_first_1){
                if(arr[i] == '1')
                {
                    found_first_1 = true;
                }
            }
            /*
                will swap 0s with 1s and vice versa
            */
            else{
                if (arr[i] == '1'){
                    arr[i] = '0';
                }
                else{
                    arr[i] = '1';
                }
            }
        }

        return String.valueOf(arr);
    }

    /*
        This function shifts all the characters of a string to the left
        and inserts a character at the right most postion

        example input: ("11001", 0)

        output should be: "10010"
    */
    public String shift_and_insert (String input_string, char char_to_insert){
        /*
            converts string to a charArray to allow edits to the strings
            since Strings are immutable in Java
        */
        char[] arr = input_string.toCharArray();
        /*
            Starts at 0
            index i copies its value from index i + 1
            stops 1 index before end of string
        */
        int i;
        for (i = 0 ; i < input_string.length() - 1 ; i++){
            arr[i] = arr[i + 1];
        }
        /*
            inserts char into the right most position
            or end of the string
        */
        arr[i] = char_to_insert;

        /*
            returns as string instead of a charArray
        */
        return String.valueOf(arr);
    }

    /*
        Follows the shortcut:
        0 + 0 = 0, carry 0
        0 + 1 = 1, carry 0
        1 + 0 = 1, carry 0
        1 + 1 = 0, carry 1
    */
    public String binary_addition(String A, String B){
        /*
            Creates a temp string to make a char array to change
            the individual characters
        */

        String temp = fill_A(A.length() - 1);
        char[] answer = temp.toCharArray();

        /*
            carry starts at zero
        */
        int carry = 0;

        for (int i = A.length() - 1 ; i > -1 ; i--){

            if (A.charAt(i) == '0' && B.charAt(i) == '0'){
                // 0 + 0 + carry 1 = 1 & carry is always be 0
                if (carry == 1){
                    answer[i] = '1';
                }
                else{
                    answer[i] = '0';
                }
                carry = 0;


            }
            else if (A.charAt(i) == '0' && B.charAt(i) == '1'){
                if (carry == 1){
                    // 0 + 1 + carry 1 = 0 & carry 1
                    answer[i] = '0';
                    carry = 1;
                }
                else {
                    // 1 + 0 + carry 0 = 1 & carry 0
                    answer[i] = '1';
                    carry = 0;
                }
            }
            else if (A.charAt(i) == '1' && B.charAt(i) == '0'){
                if (carry == 1){
                    // 0 + 1 + carry 1 = 0 & carry 1
                    answer[i] = '0';
                    carry = 1;
                }
                else {
                    // 0 + 1 + carry 0 = 1 & carry 0
                    answer[i] = '1';
                    carry = 0;
                }

            }
            else if (A.charAt(i) == '1' && B.charAt(i) == '1'){
                //regardless of result 1 carry is always 1
                if (carry == 1){
                    answer[i] = '1';
                }
                else{
                    answer[i] = '0';
                }
                carry = 1;
            }
        }

        return new String(answer);
    }

    /*
        Appends 0 to the start of the input string until it matches the given length
    */
    public String zero_extend(String string_input, int match_length){

        int diff_length = match_length - string_input.length();

        char[] arr = new char[diff_length];

        Arrays.fill(arr, '0');

        String extension = new String (arr);

        /*
            extention + original ex:
            000 + 101
        */
        extension += string_input;
        return extension;
    }

    /*
     	Function that returns the version of the number with the minimum amount of bits needed (removing 0s in the front)
     */
     public String shave(String num){
		String d1 = new String();

		for (int i=0; i < num.length(); i++) {
			if (num.charAt(i) != '0') {
				d1 = num.substring(i);
				break;
			}
		}
        return d1;
    }

    /*
        Steps based on slides:
        mode == true == step-by-step mode (there's a "next step" button)
        mode == false == show all in one go mode
        ^my understanding of the specs

        • Initialization
        • A. Requires 1 extra bit for A to be used as a sign bit.
        • Q gets dividend.
        • M gets divisor.
        • Loop for each bit of the dividend Q
        • Shift AQ to the left.
        • Subtract (A = A – M)
        • If negative (An = 1), restore (A = A + M) andreset Q0
            (Q0 = 0)
        • Else set Q0
            (Q0 = 1)
        • Quotient in Q while remainder in A; adjust
        sign as needed

        ***Q0 == Q at index 0
    */
    public void dibision (String Q, String M, Boolean mode){
    	Q = shave(Q);
    	M = shave(M);

    	if (Q.length() < M.length())
    		Q = zero_extend(Q, M.length());

        String A = fill_A(Q.length());
        String Q_dividend = Q;
        String M_divisor;
        String M_compliment;
        String A_added;
        String step; //for use in step by step mode
        steps = new ArrayList<String>();

        // this is the output inside of the text file
        String finalPerPass;

        /*
            is it possible for M to be longer than Q???

            sign extends M to match A
            pero wala pang sign extend to match Q and M
        */

        if (M.length() != A.length()){
            M_divisor = zero_extend(M, A.length());
            M_compliment = twos_compliment(M_divisor);
        }
        else {
            M_divisor = M;
            M_compliment = twos_compliment(M);
        }

        /*
            The loop just follows the steps above
        */
        String tempInit = "A:" + A + "\tQ:" + Q + "\n" + "M:" + M_divisor + "\t-M:" + M_compliment + "\n";
        for (int i = 0 ; i < Q_dividend.length() ; i++){
            A = shift_and_insert(A, Q_dividend.charAt(0));
            A = binary_addition(A, M_compliment);
            A_added = A;

            if (A.charAt(0) == '1'){
                A = binary_addition(A, M_divisor);
                Q_dividend = shift_and_insert(Q_dividend, '0');
            }
            else{
                Q_dividend = shift_and_insert(Q_dividend, '1');
            }
            /*
                This output is just temporary

                but probably at this point we output to GUI
            */
            char[] Q_blank = Q_dividend.toCharArray();
			Q_blank[Q_dividend.length()-1] = '_';
			String Q_nblank = String.valueOf(Q_blank);
			int num = i+1;

	        if (i == 0) {
                // initialization shows up after clicking enter
				if (mode) {
                    initialization = "-STEP BY STEP-\n" + "INITIALIZATION--------" + "\n" + tempInit;
                }
                else {
                    initialization = "-ALL-\n" + "INITIALIZATION--------" + "\n" + tempInit;
                }

                // for steps in text area
	           	step = "Pass #" + num + "---------------\n" + "A:" + A + "\tQ:" + Q_nblank + "\nA:" + A_added + "\n\nFinal:\n" + "A:" + A + "\tQ:" + Q_dividend + "\n";
                steps.add(step);

                // for text file output

            } else {
                // for steps in text area
	           	step = "Pass #" + num + "---------------\n" + "A:" + A + "\tQ:" + Q_nblank + "\nA:" + A_added + "\n\nFinal:\n" + "\nA:" + A + "\tQ:" + Q_dividend + "\n";
                steps.add(step);

                // for text file output

                if (i == Q_dividend.length() - 1) {
					// for steps in text area
	           		step = "END-------------------\n" + "\nFinal Answer:\n" + "Remainder:" + A + "\tQuotient:" + Q_dividend + "\n";
                	steps.add(step);

                	// for text file output
            	}
            }
        }
    }

    public String[] validationCheck(String Q, String M, Boolean isRadioEmpty) {
        /*
            This validation checker is done before the dibision function is
            called to ensure that the 2 inputs are valid inputs, which will
            lead to a valid answer. The validation check function will contain
            4 validations:

            1.) Incomplete Inputs (some are empty)
            2.) #of bits for both Q and M are <= 16
            2.) Dividend and Divisor string only contains 1s and 0s
        */
        //setting up needed variables
        String [] arrayResult = new String [3];

        boolean flag = true;
        String message = "";
        String title = "";

        int i;

        //1.) Incomplete Inputs (some are empty)
        if(flag) {
            if(Q.equals("")) {
                flag = false;
                message = "Please input the dividend";
                title = "Incomplete Input";
            }
        }

        if(flag) {
            if(M.equals("")) {
                flag = false;
                message = "Please input the divisor";
                title = "Incomplete Input";
            }
        }

        if(flag) {
            if(isRadioEmpty) {
                flag = false;
                message = "Please select a radio button for the output type";
                title = "Incomplete Input";
            }
        }

        //2.) #of bits for both Q and M are <= 16
        if (flag) {
            if ( Q.length() > 16 || M.length() > 16 ){
                flag = false;
                message = "Maximum number of bits should be less than or equal to 16";
                title = "Invalid Input";
            }
        }

        //3.) Dividend and Divisor string only contains 1s and 0s
        if (flag) {
            for (i = 0; i < Q.length(); i++)
            {
                if (Q.charAt(i) == '1' || Q.charAt(i) == '0') {
                    // its binary so do nothing
                }
                else {
                    flag = false;
                    message = "Dividend and Divisor should be binary numbers";
                    title = "Invalid Input";
                    break;
                }
            }
        }

        // same as 2 but for divisor
        if (flag){
            for (i = 0; i < M.length(); i++)
            {
                if (M.charAt(i) == '1' || M.charAt(i) == '0') {
                    // its binary so do nothing
                }
                else {
                    flag = false;
                    message = "Dividend and Divisor should be binary numbers";
                    title = "Invalid Input";
                    break;
                }
            }
        }




        arrayResult[0] = ""+flag+"";
        arrayResult[1] = message;

        return arrayResult;
    }

    public static void main (String[] args){
        /*
            These are just to test functions
        */

        String Q_dividend = "00001111";
        String M_divisor = "00001101";

        restoring_division rd = new restoring_division();
    }
}
