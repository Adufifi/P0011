package com.mycompany.p0011;

public class Main {

    public static void main(String[] args) {
        Display display = new Display();
        GetInputData getdata = new GetInputData();
        Convert convert = new Convert();
        do {
            //display menu
            display.displayMenu();
            //Input base input convert
            int baseInput = getdata.getBase("Enter base input: ", 1, 4, 0);
            //Input base output convert
            int baseOutput = getdata.getBase("Enter base output: ", 1, 4, baseInput);
            //Input value to convert
            String valueInput = getdata.getInput("Enter value for convert: ", baseInput);
            //Convert number
            String result = convert.convertValue(valueInput, baseInput, baseOutput);
            //Display result convert
            display.displayResult(result);
        } while (true);
    }
}
