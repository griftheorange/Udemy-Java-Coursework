package com.griffin.Series;

public class X {
    private int x;

    public X(int x){
        this.x = x;
    }

    //Could be called "timesTable". Initializes local scope int x as for loop iterator, refers to this.x for calculation
    public void x(){
        for(int x = 1; x < 13; x++){
            System.out.println(this.x * x);
        }
    }

}
