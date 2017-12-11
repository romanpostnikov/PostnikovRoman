package univer.epam.java.task3;


import univer.epam.java.task3.figures.Figure;

import static univer.epam.java.task3.service.FigureService.*;

/**
 * 1. создать последовательность из фигур  используя фабрики цветных и нецветных фигур
 * 2. получить масивы цветных и не цветных и сколько каждых фигур в нем присутсвует
 * 3. групируем в масивах фигуры
 * 4. тестируем методы фигур
 */

public class FiguresFabricTesting {
    public static void main(String[] args) {
        Figure[] figures = figureGenerator(30);
        printArray(figures);
        figuresSortByClass(figures);
    }
}