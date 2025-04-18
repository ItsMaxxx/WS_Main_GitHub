package Semester_2.Modifiers;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class ClassInfo{
  private Package paket = null;
  private Class klasse = null;
  private String klassenname = null;
  private String paketname = null;
  private int modifiers;
  private String modifierNamen = null;
  //----------------------------------------------------------------
  Class superklasse = null;
  String superklassenname = null;
  Class[] interfaces = null;
  String[] interfaceNamen = null;
  //----------------------------------------------------------------
  private Method[] methoden = null;
  private Constructor[] konstruktoren = null;
  private Field[] variablen = null;
  private Annotation[] annotationen = null;

  public ClassInfo(Class klasse){
    this.klasse = klasse;
    this.klassenname = klasse.getSimpleName();
    
    this.paket= klasse.getPackage();
    this.paketname = paket.getName();
    
    this.modifiers = klasse.getModifiers();
    this.modifierNamen = Modifier.toString(modifiers);
    
    this.superklasse = klasse.getSuperclass();
    if(superklasse != null){ this.superklassenname = superklasse.getSimpleName();}
    
    this.interfaces = klasse.getInterfaces();
    if(interfaces != null){
      interfaceNamen = new String[interfaces.length];
      for(int i = 0; i < interfaces.length; i++) {
        interfaceNamen[i] = interfaces[i].getSimpleName();
      }
    }
    
    this.konstruktoren = klasse.getConstructors();
    this.methoden = klasse.getMethods();
    this.variablen = klasse.getFields();
    this.annotationen = klasse.getAnnotations();
  }
  
  @Override
  public String toString() {
    return "ClassInfo{" +
            ", "+ "\n " +"klasse=" + getKlasse() +
            ", "+ "\n " +"klassenname='" + getKlassenname() +
            ", "+ "\n " +"paketname='" + getPaketname() +
            ", "+ "\n " +"modifiers=" + modifiers +
            ", "+ "\n " +"modifierNamen='" + modifierNamen +
            ", "+ "\n " +"superklasse=" + superklasse +
            ", "+ "\n " +"superklassenname='" + superklassenname +
            ", "+ "\n " +"interfaces=" + Arrays.toString(interfaces) +
            ", "+ "\n " +"interfaceNamen=" + Arrays.toString(interfaceNamen) +
            ", "+ "\n " +"methoden=" + Arrays.toString(methoden) +
            ", "+ "\n " +"konstruktoren=" + Arrays.toString(konstruktoren) +
            ", "+ "\n " +"variablen=" + Arrays.toString(variablen) +
            ", "+ "\n " +"annotationen=" + Arrays.toString(annotationen) +
            '}';
  }
  
  public Class getKlasse() {
    return klasse;
  }
  
  public String getKlassenname() {
    return klassenname;
  }
  
  public Package getPaket() {
    return paket;
  }
  
  public String getPaketname() {
    return paketname;
  }
  
  public int getModifiers() {
    return modifiers;
  }
  
  public String getModifierNamen() {
    return modifierNamen;
  }
  
  public Class getSuperklasse() {
    return superklasse;
  }
  
  public String getSuperklassenname() {
    return superklassenname;
  }
  
  public Class[] getInterfaces() {
    return interfaces;
  }
  
  public String[] getInterfaceNamen() {
    return interfaceNamen;
  }
  
  public Method[] getMethoden() {
    return methoden;
  }
  
  public Constructor[] getKonstruktoren() {
    return konstruktoren;
  }
  
  public Field[] getVariablen() {
    return variablen;
  }
  
  public Annotation[] getAnnotationen() {
    return annotationen;
  }
}
