/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumcalculator;

/**
 *
 * @author Sydnee
 */
public class SimpleCalculator 
{

    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }
    double firstNumber;
    double secondNumber;
    
    public double getAdditionResult()
    {
        return firstNumber + secondNumber;
    }
    
    public double getSubtractionResult()
    {
        return secondNumber - firstNumber;
    }
   
    public double getMultiplicationResult()
    {
        return firstNumber * secondNumber;
    }
    
    public double getDivisionResult()
    {
        if(secondNumber == 0)
            return 0;
        
        return firstNumber / secondNumber;
    }
}
