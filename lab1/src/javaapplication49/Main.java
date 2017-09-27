/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication49;

/**
 *
 * @author Алексей
 */
public class Main {
    public static void main(String[] args) {
        SomeClass a = new SomeClass();
        System.out.println( a.someMethod() ); // It works
     //   System.out.println( a.someField ); // ошибка
        System.out.println( ( (Interface1) a).someField ); // 100
        System.out.println( Interface1.someField ); // 100
    }
}