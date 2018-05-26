package main.java.ru.basharin;

import java.util.Objects;

public class NumberData {
    private int numberFirst;
    private int numberSecond;
    private int numberThird;

    public NumberData(int numberFirst, int numberSecond, int numberThird) {
        this.numberFirst = numberFirst;
        this.numberSecond = numberSecond;
        this.numberThird = numberThird;
    }

    public int getNumberFirst() {
        return numberFirst;
    }

    public int getNumberSecond() {
        return numberSecond;
    }

    public int getNumberThird() {
        return numberThird;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NumberData that = (NumberData) o;
        return numberFirst == that.numberFirst &&
                numberSecond == that.numberSecond &&
                numberThird == that.numberThird;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberFirst, numberSecond, numberThird);
    }

    @Override
    public String toString() {
        return "NumberData{" +
                "numberFirst=" + numberFirst +
                ", numberSecond=" + numberSecond +
                ", numberThird=" + numberThird +
                '}';
    }
}
