package Basics.StoringIntDouble;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Basic2 {

    //Type Casting : Widening and Narrowing
    public static void main(String[] args) {


        int num = 66;
        char ch = (char) num;

        byte b = (byte) num;

        short s = (short) num;

        int n1 = 1;
        int n2 = 2;
        int n3 = 3;

        System.out.println(n1>n2?n1>n2?n1:n2:n2>n3?n2:n3);
    }

}
