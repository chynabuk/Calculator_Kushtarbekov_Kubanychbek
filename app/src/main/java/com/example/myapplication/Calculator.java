package com.example.myapplication;

public class Calculator {
    private int firstNumber;
    private int secondNumber;
    private String result;

    public Calculator(){
    }

    public void setNumbers(String firstNumber, String secondNumber){
        try {
            this.firstNumber = Integer.parseInt(firstNumber);
            this.secondNumber = Integer.parseInt(secondNumber);
        }
        catch (Exception e){

        }
    }

    public void summarize(){
        float res = firstNumber + secondNumber;
        result = res + "";
    }

    public void subtract(){
        float res = firstNumber - secondNumber;
        result = res + "";
    }

    public void multiply(){
        float res = firstNumber * secondNumber;
        result = res + "";
    }

    public void divide(){
        if (secondNumber == 0){
            result = "Cannot divide by 0";
        }
        else {
            float res = (float) firstNumber / (float) secondNumber;
            result = String.valueOf(res);
        }
    }

    public String getResult() {
        return result;
    }
}
