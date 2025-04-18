package Semester_2;

public class ggT {
  public static void main(String[] args) {
    System.out.println(rekursivGGT(1029, 1071));
  }
  
  public static int ggT(int zahl1, int zahl2){
    int zahl3;
    while(zahl1 % zahl2!=0 || zahl2 % zahl1!=0){
      if(zahl1 > zahl2){
        zahl3 = zahl1-zahl2;
        zahl1=zahl3;
      }else if(zahl1 < zahl2){
        zahl3 = zahl2-zahl1;
        zahl2=zahl3;
      }
    }
    if(zahl2<zahl1){
      return zahl2;
    }else {
      return zahl1;
    }
  }
  
  public static int rekursivGGT(int zahl1, int zahl2){
    if(zahl2 == 0){
      return zahl1;
    } else {
      return rekursivGGT(zahl2, zahl1 % zahl2);
    }
  }
  
  public static int iterativGGT(int zahl1, int zahl2){
    while(zahl2!=0){
      int temp = zahl2;
      zahl2 = zahl1 % zahl2;
      zahl1 = temp;
    }
    return zahl1;
  }
  
}
