public class Zad3 {
    public static void main(String[] args) {
        System.out.println("" +
                "a) Wyjątki dzielimy na kontrolowane, które trzeba obsłużyć i niekontrolowane, które można, ale nie trzeba obsłużyć.\n" +
                "b) Wyjątki niekontrolowane dziedziczą po klasie RuntimeException\n." +
                "c) Wyjątki rzucamy korzystając z instrukcji throw, jeśli rzucamy wyjątek kontrolowany musimy dodatkowo w sygnaturze metody/konstruktora zadeklarować wyjątek używając słowa throws\n." +
                "d) Do bloku try-catch możemy dodać dodatkowo blok finally,który wykona się zawsze, niezależnie, czy w bloku try wyjątek wystąpił, czy nie.");
    }

}
