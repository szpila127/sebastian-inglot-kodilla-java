package com.kodilla.patterns2.observer.homework;

public interface ObservableHW {
    void registerObserverHW(ObserverHW observerHW);
    void notifyObserverHW(String string);
    void removeObserverHW(ObserverHW observerHW);
}
