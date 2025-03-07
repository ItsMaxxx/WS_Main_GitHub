package Semester_2.Generics;

import java.util.ArrayList;

public class Cache<T> extends ArrayList<T> {

    public Cache() {
    }

    public void typenAusgeben(){
        for(T values : this){
            System.out.println(values.getClass().getName());
        }
    }

}
