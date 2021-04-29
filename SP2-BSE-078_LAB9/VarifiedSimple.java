package com.company;
public class VarifiedSimple extends Simple {
    public VarifiedSimple(int num1, int num2){
        super(num1, num2);
    }
    @Override
    public int Add(){

        if (num1 > 0 && num2 > 0){
            return super.Add();
        }
        else {
            return 0;
        }
    }
    @Override
    public int Subtract(){
        if (num1 > 0 && num2 > 0){
            return super.Subtract();
        }
        else {
            return 0;
        }
    }
    @Override
    public int Multiply(){
        if (num1 > 0 && num2 > 0){
            return super.Multiply();
        }
        else {
            return 0;
        }
    }
    @Override
    public int Divide(){
        if (num1 > 0 && num2 > 0){
            return super.Divide();
        }
        else {
            return 0;
        }
    }
}
