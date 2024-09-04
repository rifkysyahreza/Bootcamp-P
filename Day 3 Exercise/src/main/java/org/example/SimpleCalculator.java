package org.example;

public class SimpleCalculator {
    public static double doTheCalc(String stringOfNumberAndOperand){
        String[] arrayOfSimpleCalcInput = stringOfNumberAndOperand.split("[*/+-]");

        if (stringOfNumberAndOperand.contains("+")){
            return Double.parseDouble(arrayOfSimpleCalcInput[0])+Double.parseDouble(arrayOfSimpleCalcInput[1]);
        } else if (stringOfNumberAndOperand.contains("-")){
            return Double.parseDouble(arrayOfSimpleCalcInput[0])-Double.parseDouble(arrayOfSimpleCalcInput[1]);
        } else if (stringOfNumberAndOperand.contains("/")) {
            return Double.parseDouble(arrayOfSimpleCalcInput[0])/Double.parseDouble(arrayOfSimpleCalcInput[1]);
        } else if (stringOfNumberAndOperand.contains("*")) {
            return Double.parseDouble(arrayOfSimpleCalcInput[0])*Double.parseDouble(arrayOfSimpleCalcInput[1]);
        }else {
            return 0;
        }
    }
}
