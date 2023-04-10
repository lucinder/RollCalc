public class RollCalc{
   public static String MaxRollCalc(int target){
      String d4 = "With d4: "; // d4 -> 4
      String d6 = "With d6: "; // d6 -> 6
      String d8 = "With d8: "; // d8 -> 8
      String d10 = "With d10: "; // d10 -> 10
      String d12 = "With d12: "; // d12 -> 12
      int d4Div = 4;
      int d6Div = 6;
      int d8Div = 8;
      int d10Div = 10;
      int d12Div = 12;
      d4 += target/d4Div + "d4 + " + (target % d4Div);
      d6 += target/d6Div + "d6 + " + (target % d6Div);
      d8 += target/d8Div + "d8 + " + (target % d8Div);
      d10 += target/d10Div + "d10 + " + (target % d10Div);
      d12 += target/d12Div + "d12 + " + (target % d12Div);
      return d4 + "\n" + d6 + "\n" + d8 + "\n" + d10 + "\n" + d12;
   }
   public static String AvgRollCalc(int target){
      String d4 = "With d4: "; // d4 -> 3
      String d6 = "With d6: "; // d6 -> 4
      String d8 = "With d8: "; // d8 -> 5
      String d10 = "With d10: "; // d10 -> 6
      String d12 = "With d12: "; // d12 -> 7
      int d4Div = 3;
      int d6Div = 4;
      int d8Div = 5;
      int d10Div = 6;
      int d12Div = 7;
      d4 += target/d4Div + "d4 + " + (target % d4Div);
      d6 += target/d6Div + "d6 + " + (target % d6Div);
      d8 += target/d8Div + "d8 + " + (target % d8Div);
      d10 += target/d10Div + "d10 + " + (target % d10Div);
      d12 += target/d12Div + "d12 + " + (target % d12Div);
      return d4 + "\n" + d6 + "\n" + d8 + "\n" + d10 + "\n" + d12;
   }
   public static void main(String[] args){
      if(args[0].equals("avg")){ System.out.println(AvgRollCalc(Integer.parseInt(args[1]))); }
      else if(args[0].equals("max")){ System.out.println(MaxRollCalc(Integer.parseInt(args[1]))); }
   }
}