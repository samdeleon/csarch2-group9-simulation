import java.util.Arrays;
import java.util.ArrayList;
class restorative_division {

    /*
        What we have so far:
        1. filling A with one extra bit
        2. twos compliment
        3. shifting the string to the left with the insert
        4. sign extension
        5. the division step

        what we don't have:
        1. validation for strings
        2. output to text file

        what we have to do soon:
        1. adapt these methods into GUI (we have to remove the
        static keyword iirc)
        2. two modes, show all or show one by one
        3.

        tbh i have only tested for the first two examples in the slides
        feel free to test the methods and edit if theres any errors
        hopefully my comments help yalls understand
    */

    public static String temp_print_row(String A, String Q){

        return "";
    }

    public static String fill_A (int str_length){
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

    public static String twos_compliment (String M){
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
    public static String shift_and_insert (String input_string, char char_to_insert){
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
    public static String binary_addition(String A, String B){
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
        Max 16-bits ata
        and input should only be 1s or 0s
    */
    public static boolean valid_string_input (String X){
        return true;
    }

    /*
        Not sure if needed yung sign extend
    */
    public static String sign_extend(String string_input, int match_length){

        int diff_length = match_length - string_input.length();

        char[] arr = new char[diff_length];

        Arrays.fill(arr, string_input.charAt(0));

        String extension = new String (arr);

        /*
            extention + original ex:
            000 + 101
        */
        extension += string_input;
        return extension;
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
    public static void dibision (String Q, String M, Boolean mode){
        String A = fill_A(Q.length());
        String Q_dividend = Q;
        String M_divisor;
        String M_compliment;
        String A_added;
        ArrayList<String> steps = new ArrayList<String>(); //for use in step by step mode

        /*
            is it possible for M to be longer than Q???

            sign extends M to match A
            pero wala pang sign extend to match Q and M
        */

        if (M.length() != A.length()){
            M_divisor = sign_extend(M, A.length());
            M_compliment = twos_compliment(M_divisor);
        }
        else {
            M_divisor = M;
            M_compliment = twos_compliment(M);
        }

        /*
            The loop just follows the steps above
        */
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
            if (mode == true) {
            	char[] Q_blank = Q_dividend.toCharArray();
				Q_blank[Q_dividend.length()-1] = '_';
				String Q_nblank = String.valueOf(Q_blank);
				int num = i+1;
	            if (i == 0) {
	            	System.out.println("INITIALIZATION--------");
	            	System.out.println("A:" + A + "\t\tQ:" + Q);
	            	System.out.println("M:" + M_divisor + "\t\t-M:" + M_compliment);
	            	System.out.println("");

	            	System.out.println("Pass# " + num + "---------------");
	            	System.out.println("A:" + A + "\t\tQ:" + Q_nblank);
	            	System.out.println("A:" + A_added);
	            	System.out.println("\nFinal:");
	            	System.out.println("A:" + A + "\t\tQ:" + Q_dividend);
	            	System.out.println("");
	            } if (i == Q_dividend.length() - 1) {
	            	System.out.println("END-------------------");
            		System.out.println("\nFinal Answer:");
	            	System.out.println("Remainder:" + A + "\t\tQuotient:" + Q_dividend);
	            	System.out.println("");
	            } else {
	            	System.out.println("Pass# " + num + "---------------");
	            	System.out.println("A:" + A + "\t\tQ:" + Q_nblank);
	            	System.out.println("A:" + A_added);
	            	System.out.println("\nFinal:");
	            	System.out.println("A:" + A + "\t\tQ:" + Q_dividend);
	            	System.out.println("");
	            }
            } else {
            	char[] Q_blank = Q_dividend.toCharArray();
				Q_blank[Q_dividend.length()-1] = '_';
				String Q_nblank = String.valueOf(Q_blank);
				int num = i+1;
	            if (i == 0) {
	            	System.out.println("INITIALIZATION--------");
	            	System.out.println("A:" + A + "\t\tQ:" + Q);
	            	System.out.println("M:" + M_divisor + "\t\t-M:" + M_compliment);
	            	System.out.println("");

	            	System.out.println("Pass# " + num + "---------------");
	            	System.out.println("A:" + A + "\t\tQ:" + Q_nblank);
	            	System.out.println("A:" + A_added);
	            	System.out.println("\nFinal:");
	            	System.out.println("A:" + A + "\t\tQ:" + Q_dividend);
	            	System.out.println("");
	            } if (i == Q_dividend.length() - 1) {
	            	System.out.println("END-------------------");
            		System.out.println("\nFinal Answer:");
	            	System.out.println("Remainder:" + A + "\t\tQuotient:" + Q_dividend);
	            	System.out.println("");
	            } else {
	            	System.out.println("Pass# " + num + "---------------");
	            	System.out.println("A:" + A + "\t\tQ:" + Q_nblank);
	            	System.out.println("A:" + A_added);
	            	System.out.println("\nFinal:");
	            	System.out.println("A:" + A + "\t\tQ:" + Q_dividend);
	            	System.out.println("");
	            }
            }
        }
    }

    public static void main (String[] args){
        /*
            These are just to test functions
        */

        String Q_dividend = "00111";
        String M_divisor = "00011";

        dibision(Q_dividend, M_divisor, false);

    }
}
