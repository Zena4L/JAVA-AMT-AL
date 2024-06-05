package org.clement;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
//        Path p1 = Paths.get("/a/b/c"); // absoulute
//        Path p2 = Paths.get("d/e"); // relative
//
//
//        System.out.println(p1.getFileName());
//        System.out.println(p1.getRoot());
//        System.out.println(p1.getParent());

        //normalize
//        Path n1 = Paths.get("a/b/c/./././d/../../c"); // contains reference to either the parent ./ dir or current dir ../
//        System.out.println(n1.normalize());

        //concatenation
//        Path p1 = Paths.get("/a/b/c");
//        Path p2 = Paths.get("d/e/f");
//
//        Path p3 = p1.resolve(p2); // p1+p2 : it is not commutative
//        System.out.println(p3);

//        for (int i = 0; i < p1.getNameCount(); i++) {  //doesn't start from the root
//            System.out.println(p1.getName(i));
//        }

        //sub path
//        Path p1 = Paths.get("a/b/c");
//        Path p2 = Paths.get("b/q/w");
//
//        int endIndex = p1.getNameCount() - 1;
//        System.out.println(p1.subpath(0, endIndex));
//
//        System.out.println(p1.relativize(p2)); // how to get from p1 to p2

        // -----------------files --------------------------------------------------------------------------
        Path p1 = Paths.get("demo.txt");

       try{
//           Files.createFile(p1);
           Files.delete(p1);
       }catch (IOException e){
           e.printStackTrace();
       }

    }
}