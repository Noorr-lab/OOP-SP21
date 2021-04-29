package com.company;
public class Simple {
    public int num1;
    public int num2;
    public Simple(int n1, int n2){
       num1 = n1;
       num2 = n2;
    }
    public void setNum1(int n1) {
        num1 = n1;
    }
    public int getNum1() {
        return num1;
    }
    public void setNum2(int n2) {
        num2 = n2;
    }
    public int getNum2() {
        return num2;
    }
    public int Add(){
        return (num1 + num2);
    }
    public int Subtract(){
        return (num1 - num2);
    }
    public int Multiply(){
        return (num1 * num2);
    }
    public int Divide(){
        return (num1 / num2);
    }
}
