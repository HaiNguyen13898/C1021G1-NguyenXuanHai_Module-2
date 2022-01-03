package ss23_BehavioralDesignPattern.thuc_hanh.strategy;

import java.util.List;

public interface SortStrategy {

    <T> void sort(List<T> items);
}
