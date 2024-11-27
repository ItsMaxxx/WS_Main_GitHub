package Lists;

import java.util.ArrayList;

class Something{
    public int size;
    public Something(int i) {
        this.size = i;
    }
    //y
}

public class MergeTwoSortedLists {

    public static void main (String[] args) {

        ArrayList<Integer> besucherListe = new ArrayList<>();
        besucherListe.add(0, 6);
        int x = besucherListe.indexOf(6);
        besucherListe.contains(6);
        int y = 4;
        besucherListe.add(y);
        //besucherListe.remove(y);
        besucherListe.set(0, 69);
        //besucherListe.clear();

        //for(int i=0; i<besucherListe.size(); i++) {
        //System.out.println(besucherListe.get(i));
        //}
        String str = "Hello World";

        System.out.println(str.charAt(0));


        if(str.equals("Hello World")) {
            System.out.println("Yes");
        }

        String[] s = str.split(" ");
        for(int i=0; i<s.length; i++) {
            System.out.println(s[i]);
        }

        System.out.println(str.replace('l', 'X'));

        char[] cha = str.toCharArray();
        for(int i=0; i<cha.length; i++) {
            System.out.println(cha[i]);
        }

    }

}
