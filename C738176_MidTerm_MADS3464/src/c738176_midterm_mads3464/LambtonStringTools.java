/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c738176_midterm_mads3464;

/**
 *
 * @author macstudent
 */
public class LambtonStringTools { 
    
     static int j=0;
     static int a=0;
     static int reverse;
     static int demi=0;
     static int bin=0;
     static int deci=0;
     static int pwr=0;
     
static void reverse(String s){
    char ch[] = new char[s.length()];
    for(j=0;j<s.length();j++){
        ch[j] = s.charAt(j);
    }
    for (j=s.length()-1;j>=0;j--)
     System.out.print(ch[j]);

     

}

  public int binaryToDecimal(String s){
      bin=Integer.parseInt(s);
    while(true)
    {
     if(bin==0)
         break;
     else
     {
         int demi = bin%10;
          deci+=demi*Math.pow(2,pwr);
          bin = bin/10;
          pwr++;
          
     }
  }
     return deci;
     
  }
  
     public String initials (String s){
       if(s.length() ==0)
           return s;
      System.out.println(Character.toUpperCase(s.charAt(0)));
      for(int j=1;j <s.length()-1;j++)
          if(s.charAt(j) ==' ')
           System.out.print(" "+Character.toUpperCase(s.charAt(j+1)));
           return s;
     }
     
     
           
              
         
     }


             }