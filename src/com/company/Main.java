package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        StackOperations stacks = new Stack();

        stacks.push("Ogorki");
        stacks.push("Pomidor");
        stacks.push("Papier");
        stacks.push("Czajnik");

        System.out.println("Stos wygląda następująco: "+stacks.get());

        System.out.println(stacks.pop());
        System.out.println(stacks.pop());
        System.out.println(stacks.pop());
       // System.out.println(stacks.pop());

        System.out.println("Stos po usunięciu kolejnych elementów: "+stacks.get());
    }
}
