package Seminar3.task2;

public class Counter implements AutoCloseable{
    private int counter;
    // если открыт - работающий объект, false -закрыт
    private boolean isOpen;

    public int getCounter() {
        return counter;
    }

    public int add() throws CloseCounterExxception{
        if (!isOpen)
            throw new CloseCounterExxception("Счетчик закрыт!");
        return ++counter;
    }

    // Установим начальное состояние счетчика
    public Counter(int counter){
        this.counter = counter;
        isOpen = true;
    }

    public Counter() {
        isOpen = true;
    }


    @Override
    public void close(){
        isOpen = false;
    }
}
