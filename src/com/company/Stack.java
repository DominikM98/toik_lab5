package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Stack implements StackOperations{

    private final List<String> list = new ArrayList<>();
    @Override
    public List<String> get() {
        return list;
    }

    @Override
    public Optional<String> pop() {
        if(list.isEmpty()) {
            return Optional.empty();
        }

        String head_list = list.get(0);
        list.remove(0);

        return Optional.of(head_list);
    }

    @Override
    public void push(String item) {
        list.add(0,item);
        System.out.println("Do stosu dodano: "+item);
    }
}
