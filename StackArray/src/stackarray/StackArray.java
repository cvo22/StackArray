/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackarray;

/**
 *
 * @author Гамаюнов Иван
 */
   // Стек на основе массива
public class StackArray {

    // Массив для хранения элементов стека
    private Object[] elements;

    // Индекс вершины стека
    private int top = -1;

    // Конструктор стека с указанием начального размера
    public StackArray(int initialCapacity) {
        elements = new Object[initialCapacity];
    }

    // Конструктор стека с начальным размером по умолчанию
    public StackArray() {
        this(10);
    }

    // Проверка, пуст ли стек
    public boolean isEmpty() {
        return top == -1;
    }

    // Возвращает размер стека
    public int size() {
        return top + 1;
    }

    // Добавление элемента в стек
    public void push(Object element) {
        // Если стек заполнен, увеличиваем его размер
        if (top == elements.length - 1) {
            Object[] newElements = new Object[elements.length * 2];
            System.arraycopy(elements, 0, newElements, 0, elements.length);
            elements = newElements;
        }

        // Добавляем элемент в стек
        elements[++top] = element;
    }

    // Извлечение элемента из стека
    public Object pop() {
        // Если стек пуст, возвращаем null
        if (isEmpty()) {
            return null;
        }

        // Извлекаем элемент из стека
        Object element = elements[top];
        elements[top--] = null; // Очищаем ссылку на элемент

        // Если стек стал пустым, сбрасываем индекс вершины
        if (isEmpty()) {
            top = -1;
        }

        return element;
    }

    // Возвращает элемент, находящийся на вершине стека, не извлекая его
    public Object peek() {
        // Если стек пуст, возвращаем null
        if (isEmpty()) {
            return null;
        }

        // Возвращаем элемент на вершине стека
        return elements[top];
    }

    // Очистка стека
    public void clear() {
        // Устанавливаем индекс вершины в -1, чтобы стек стал пустым
        top = -1;
    }
}
    

