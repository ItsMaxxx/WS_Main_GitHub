package Semester_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestAssertions {

    //In den run configurations muss man irgendwo -ea hinschreiben

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        testing(reader.readLine(), reader.readLine());



    }


    public static void testing(String input, String input2){
        assert input.matches("[-]?[0-9]+[.]?[0-9]*"):"Erster Parameter"+ input +" ist kein Double";
        assert input2.matches("[-]?[0-9]+[.]?[0-9]*"):"Erster Parameter"+ input +" ist kein Double";

        Double dinput = Double.parseDouble(input);
        Double dinput2 = Double.parseDouble(input2);

        System.out.println(dinput +" "+ dinput2);


    }









}
