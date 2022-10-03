import java.util.ArrayList;
import java.util.Arrays;
import java.time.*;

public class Lab7_223 {
    public static void main(String[] args) {
        String[] s1 = new String[10];
        ArrayList<String> s2 = new ArrayList<String>();
        int[] i1 = new int[10];
        ArrayList<Integer> i2 = new ArrayList<Integer>();
        s1[1] = "Hello";
        s1[5] = "Index 5";

        s2.add("Hello");
        s2.add("I do not know what the index is");

        i1[1] = 1;
        i1[5] = 2;

        i2.add(1);
        i2.add(2);

        System.out.println(Arrays.toString(s1));
        System.out.println(s2);

        System.out.println(Arrays.toString(i1));
        System.out.println(i2);

        System.out.println(s1.length);
        System.out.println(s2.size());

        s1[3] = "here!";
        s2.add("here too!");

        System.out.println(s1.length);
        System.out.println(s2.size());

        s2.add(0,"first!");
        System.out.println(s2);

        //s2.add(10-,"error for sure!");
        //System.out.println(s2);
        
        System.out.println("--------------");
        
        String s = s1[1];
        System.out.println(s);
        s = s2.get(0);
        System.out.println(s);
        int i = i1[1];
        System.out.println(i);
        i = i2.get(0);
        System.out.println(i);

        s1[1] = "changed!";
        s2.set(1,"changed too!");
        System.out.println(Arrays.toString(s1));
        System.out.println(s2);

        s2.remove(0);
        System.out.println(s2);
        System.out.println("--------------");

        ArrayList movies = new ArrayList();
        ArrayList fav3 = new ArrayList();
        ArrayList theRest = new ArrayList();

        Movie movie1 = new Movie();
        movie1.title = "The Net";
        movie1.rating = 8.5;
        movie1.releaseDate = LocalDate.of(1995,2,28);
        movie1.revenue = 319.0;
        
        Movie movie2 = new Movie();
        movie2.title = "Her";
        movie2.rating = 7.2;
        movie2.releaseDate = LocalDate.of(2013,3,17);
        movie2.revenue = 543.0;
        
        Movie movie3 = new Movie();
        movie3.title = "The Imitation Game";
        movie3.rating = 7.8;
        movie3.releaseDate = LocalDate.of(2014,1,9);
        movie3.revenue = 876.0;

        Movie movie4 = new Movie();
        movie4.title = "The Martian";
        movie4.rating = 9.5;
        movie4.releaseDate = LocalDate.of(2015,2,14);
        movie4.revenue = 999.0;
        
        Movie movie5 = new Movie();
        movie5.title = "PK";
        movie5.rating = 9.2;
        movie5.releaseDate = LocalDate.of(2014,10,22);
        movie5.revenue = 666.0;
        
        
        movies.add(movie1);
        movies.add(movie2);
        movies.add(movie3);
        movies.add(movie4);
        movies.add(movie5);
        
        
        for(int j =0; j<=2;j++){
            fav3.add(movies.get(0));//เป็น0เนื่องจากเมื่อนำค่าออกไปแล้วค่าที่เป็น1จะขยับมาเป็น0แทน
            movies.remove(0);
        }
        
        for(int x =0; x<=1;x++){
            theRest.add(movies.get(0));
            movies.remove(0);
        }
        System.out.println(movies);
        System.out.println(fav3);
        System.out.println(theRest);
    }
    
}
