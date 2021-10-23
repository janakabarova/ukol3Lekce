package com.engeto.ifloop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    private static List<Integer> list;

    //region Demo
    /**
     * Ukázka použítí metody {@link Support#safeReadInt()}
     *
     * Tato metoda použije metodu {@link Support#safeReadInt() k načtení
     * jednoho čísla od uživatele a vypsání tohoto čísla na výstup.
     *
     * Podobně můžeš používat metodu {@link Support#safeReadInt()}
     * i v dalších metodách.
     */
    public static void readOneIntFromInputAndPrintIt() {
        int input = Support.safeReadInt();
        System.out.println("You entered: "+input);
    }
    //endregion

    //region Úlohy na cykly - Task 1
    /**
     * Čte čísla, která zadává uživatel a vypisuje je na výstup.
     * Metoda pokračuje ve čtení opakovaně tak dlouho, dokud uživatel zadává kladná čísla či nulu.
     * Jakmile uživatel zadá záporné číslo, metoda skončí.
     */
    public static void readIntsFromInputAndPrintItUntilNegative() {
        int input;
        do {
            input = Support.safeReadInt();
            if (input < 0) {
                System.out.println("You entered negative number: "+input);
                break;
            }
            System.out.println("You entered: " + input);
        } while (input >= 0);
    }

    //Task 2
    /**
     * Čte čísla ze vstupu tak dlouho, dokud uživatel nezadá záporné číslo.
     * Jako návratovou hodnotu vrátí součet zadaných čísel (záporné číslo by nemělo být zahrnuto).
     * 
     * @return Součet všech zadaných čísel (záporné číslo ukončující vstup není zahrnuto).
     */
    public static int sumAllInputUntilNegative() {
        int input;
        int sumAllIntegers = 0;
        do {
            input = Support.safeReadInt();
            if (input < 0) {
                System.out.println("You entered negative number: "+input);
                break;
            }
            System.out.println("You entered: " + input);
            sumAllIntegers = sumAllIntegers + input;
        } while (input >= 0);
        return sumAllIntegers;
    }

    //Task 3
    /**
     * Čte čísla ze vstupu tak dlouho, dokud uživatel nezadá záporné číslo.
     * Všechna načtená čísla uloží do listu, který vrátí jako návratovou hodnotu.
     * 
     * @return List načtených hodnot (záporná hodnota není zahrnuta v listu)
     */
    public static List storeAllInputInArrayListUntilNegative() {
        list = new ArrayList<>();
        int input;
        do {
            input = Support.safeReadInt();
            if (input < 0) {
                System.out.println("You entered negative number: "+input);
                break;
            }
            list.add(input);
            //System.out.println("You entered: " + input);
        } while (input >= 0);
        return list;
    }

    //Task 4
    /**
     * Dostane jako parametr list čísel. Vypíše čísla na obrazovku. Každé číslo vypiš na samostatný řádek.
     * @param list List čísel, která se mají vypsat.
     */
    public static void printAllIntegersFromList(List<Integer> list) {
        list = new ArrayList<>();
        list.add(28);
        list.add(59);
        list.add(0);
        list.add(-5);
        for (Integer number : list) {
            System.out.println(number);
        }
        return;
    }

    //Task 5
    /**
     * Sečte hodnoty z listu a vrátí výsledek jako návratovou hodnotu.
     * @param list List čísel, která chceme sečíst.
     * @return Součet všech čísel v listu.
     */
    public static Integer sumAllIntegersFromList(List<Integer> list) {
        list = new ArrayList<>();
        int sum = 0;
        list.add(28);
        list.add(59);
        list.add(0);
        list.add(-5);
        for (Integer number : list) {
            System.out.println(number);
            sum = sum + number;
        }
        return sum;
    }
    //endregion

    //Task 6
    //region Podmínky
    /**
     * Vypíše čísla ze seznamu, která jsou menší než zadaný limit.
     * @param list Seznam čísel, která máme zkontrolovat.
     * @param limit Limit - vypsána budou pouze čísla z listu, která jsou menší než limit
     */
    public static void printIntegersUnderLimit(List<Integer> list, int limit) {
        list = new ArrayList<>();
        list.add(28);
        list.add(59);
        list.add(0);
        list.add(3);
        list.add(-5);
        for (Integer number : list) {
            if (number < limit) {
                System.out.println(number);
            }
        }
        return;
    }


    //Task 7
    /**
     * Vypíše čísla ze zadaného listu.
     * Při výpisu ale nahradí:
     * - číslo 1 slovem "one", 
     * - číslo 2 slovem "two", 
     * - číslo 3 slovem "three"
     * Ostatní čísla vypíše jako číselnou hodnotu.
     * Například pokud dostane jako parametr seznam [5, 3, 1, 48, 2], 
     * vypíše: 5, three, one, 48, two. 
     * @param //list Seznam čísel, která se mají vypsat.
     */
    public static void printIntegersWithReplace(List<Integer> list) {
        list = Arrays.asList(5, 3, 1, 48, 2);
        System.out.println(list);
        int itemCount = list.size();
        for (int i = 0; i < itemCount; i++) {
            if (list.get(i) == 1) {
                System.out.println("one");
            } else if (list.get(i) == 2 ) {
                System.out.println("two");
            } else if (list.get(i) == 3 ) {
                System.out.println("three");
            } else {
                System.out.println(list.get(i));
            }

        }
    }
    //endregion

    public static void main(String[] args) {
          // Příklad:
//        System.out.println("--- Example - read and print one integer ---");
//        readOneIntFromInputAndPrintIt();
          // ---
        System.out.println("--- Task 1 - read and print integers until negative ---");
        readIntsFromInputAndPrintItUntilNegative();
        // ---
        System.out.println("--- Task 2 - sum all integers until negative ---");
        System.out.println("Total sum: " + sumAllInputUntilNegative());;
        // ---
        System.out.println("--- Task 3 - read integers to list until negative ---");
        List<Integer> list = storeAllInputInArrayListUntilNegative();
        System.out.println(list);
        // ---
        System.out.println("--- Task 4 - print all integers from list ---");
        printAllIntegersFromList(list);
        // ---
        System.out.println("--- Task 5 - sum all integers in list ---");
        System.out.println("Total sum: " + sumAllIntegersFromList(list));
        // ---
        System.out.println("--- Task 6 - print integers under 5 from list ---");
        printIntegersUnderLimit(list, 5);
        // ---
        System.out.println("--- Task 7 - print integers - replace: 1 => \"one\", 2 => \"two\", 3 => \"three\" ---");
        printIntegersWithReplace(list);
    }
}
