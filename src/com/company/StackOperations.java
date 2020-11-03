package com.company;

import java.util.List;
import java.util.Optional;

public interface StackOperations {

    /** pobiera wszystkie elementy stosu - pierwszy element listy to szczyt stosu**/
    List<String> get();

    /** metoda pobiera element ze stosu */
    Optional<String> pop();

    /** metoda dodaje element na stos */
    void push(final String item);
}
