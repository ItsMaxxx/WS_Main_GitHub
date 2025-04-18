package Semester_2.Modifiers;

import java.lang.reflect.Modifier;

public class CheckMods {

  public static void main(String[] args) {
    /*for(int i = 0; i < Math.pow(2, 10); i++) {
      System.out.println("Mod-Namen: " + Modifier.toString(i));
    }*/
    
    //ClassInfo2 aus Moodle kopieren
    ClassInfo ci = new ClassInfo(new Object().getClass());
    
    System.out.println(ci);
    
  }
  
  //Eigene Modifier.toString()-Methode
  public static String modNames(int modifier){
    switch(modifier){
      case 1: return "public";
      case 2: return "private";
      case 3: return "protected";
      case 4: return "package";
      case 5: return "abstract";
      case 6: return "final";
      case 7: return "static";
      default: return "unknown";
    }
  }

}
