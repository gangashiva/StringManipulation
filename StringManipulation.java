package com.interview;

public class StringManipulation {

  public static void main(String[] args) {
    //String str1 = "ABC";
    String str1 = "BC";
    //String str2 = "BC";
    String str2 = "BANGALORE";

    StringBuilder sb1 = new StringBuilder();
    StringBuilder sb2 = new StringBuilder();
    for (int i=0; i<str1.length();i++){
      char c = str1.charAt(i);
      String s = ""+c;
      if(!str2.contains(s)){
        sb1.append(s);
      }
    }
    System.out.println("OP1: "+sb1);

    for (int i=0; i<str2.length();i++){
      char c = str2.charAt(i);
      String s2 = ""+c;
      if(!str1.contains(s2)){
        sb2.append(s2);
      }
    }
    System.out.println("OP2: "+sb2);
  }

}
