
package primitivecalc;

import java.util.Scanner;


public class PrimitiveCalc {

   public static void main(String[] args) {
     
     Scanner sc = new Scanner(System.in);  
     try{
         double firstNum;
         double secondNum;
         String operation;
         
         if(args.length == 3){
          firstNum = Double.parseDouble(args[0]);
          secondNum = Double.parseDouble(args[2]);
          operation = args[1];
         } 
         else{
          if(args.length == 1){
          firstNum = Double.parseDouble(args[0]);
          System.out.println("Введите второе число");
          secondNum = Double.parseDouble(sc.nextLine());
          System.out.println("Введите операцию:");
          operation = sc.nextLine();
          } else if(args.length == 2){
          firstNum = Double.parseDouble(args[0]);
          operation = args[1];
          System.out.println("Введите второе число");
          secondNum = Double.parseDouble(sc.nextLine());
         }
          else{
           System.out.println("Введите первое число:");
           firstNum = Double.parseDouble(sc.nextLine());
           System.out.println("Введите второе число");
           secondNum = Double.parseDouble(sc.nextLine());
           System.out.println("Введите операцию");
           operation = sc.nextLine();
           }
        }
      switch(operation){
          
         case "+": System.out.println("Результат:" + " " + firstNum + " + " + secondNum + " = " + sum(firstNum, secondNum));
                   break;
         case "-": System.out.println("Результат:" + " " + firstNum + " - " + secondNum + " = " + deduct(firstNum, secondNum));
                   break;
         case "*": System.out.println("Результат:" + " " + firstNum + " * " + secondNum + " = " + multiply(firstNum, secondNum));;
                   break;
         case "/": System.out.println("Результат:" + " " + firstNum + " / " + secondNum + " = " + divide(firstNum, secondNum));;
                   break;    
         default: System.out.println("Некорректный ввод. Повторите ещё раз.");
                   break; 
       }
     } 
      catch(NumberFormatException nf){
          System.err.println("Число введено не верно");
          nf.printStackTrace();
          nf.getMessage();
     }
     catch(ArrayIndexOutOfBoundsException ie){
      System.err.println("Ошибка связанная с размерностью массива");
      ie.printStackTrace();
      ie.getMessage();
     }
     catch(Exception ex){
       System.out.println("Ошибка");   
       ex.printStackTrace();
       ex.getMessage();
     }
  } 
    public static double sum(double firstNum, double secondNum) {
     return (firstNum + secondNum);
    }
    
    public static double deduct(double firtsNum, double secondNum){
     return (firtsNum - secondNum);
    }
    
    public static double multiply(double firstNum, double secondNum){
      return (firstNum * secondNum);
    }
    
    public static double divide(double firstNum, double secondNum){
     return (firstNum/secondNum);
    }
}
