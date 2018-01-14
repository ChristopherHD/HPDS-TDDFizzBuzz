package org.ulpgc;

import static java.lang.String.valueOf;

public class FizzBuzz implements IFizzBuzz {

    private int valueToCheck;

    public String checkNumber(int valueToCheck) {
        setValueToCheck(valueToCheck);
        return toString();
    }

    public int getValueToCheck(){
        return this.valueToCheck;
    }

    public String of(int value){
        return checkNumber(value);
    }

    public void setValueToCheck(int value){
        this.valueToCheck = value;
    }

    public String fizzOf(int value){
        return value % 3 == 0 ? "Fizz" : "";
    }

    public String buzzOf(int value){
        return value % 5 == 0 ? "Buzz" : "";
    }

    public String get(String... value){
        return value[0].isEmpty() ? value[1] : value[0];
    }

    @Override
    public String toString(){
        if (getValueToCheck() < 0) throw new NegativeNumberException();
        return get(fizzOf(getValueToCheck())+buzzOf(getValueToCheck()), valueOf(getValueToCheck()));
        /*   //Método 1
        return (getValueToCheck() % 3 == 0 ? "Fizz" : "") +
               (getValueToCheck() % 5 == 0 ? "Buzz" : "") +
               (getValueToCheck() % 5 == 0 || getValueToCheck() % 3 == 0 ? "" :
                       valueOf(getValueToCheck()));
                       //Fin Método 1
                       */
        /*  Método 3 --> Hacer array de 15 elementos y según el módulo 15 devolver x posición, si vacío, devolver número  */
    }


    public static class NegativeNumberException extends RuntimeException{
    }

}
