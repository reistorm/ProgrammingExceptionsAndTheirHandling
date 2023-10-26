package Seminar3.task1;

public class NullElementArrayException extends NullPointerException{
    // какой индекс искать, который был нулевым
    private int index;

    public int getIndex() {
        return index;
    }

    public NullElementArrayException(String s, int index) {
        super(s);
        this.index = index;
    }
}
