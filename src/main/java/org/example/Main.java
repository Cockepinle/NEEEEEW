package org.example;
import java.io.*;
import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        try {//проверка на правильность ввода данных
        PrintWriter student = new PrintWriter(new FileWriter("studentsInformation.txt", true));
        //Создается объект "PrintWriter" с именем "student", который открывает файл "studentsInformation.txt" для записи данных

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //Создается объект "BufferedReader" с именем "br", который читает данные из стандартного ввода
        System.out.print("Введите имя первого студента:");//строка для вывода текста
        String name1 = br.readLine();
        System.out.print("Введите имя второго студента:");
        String name2 = br.readLine();
        System.out.print("Введите имя третьего студента:");
        String name3 = br.readLine();
        //С помощью метода "readLine()" считываются строки с именами студентов и сохраняются в переменные "name1", "name2" и "name3"

        var sc2 = new Scanner(System.in);//Создается объект "Scanner" с именем "sc2", который читает данные из стандартного ввода
        System.out.print("Введите возраст первого студента:");//строка для вывода текста
        int year1 = sc2.nextInt();
        System.out.print("Введите возраст второго студента:");
        int year2 = sc2.nextInt();
        System.out.print("Введите возраст третьего студента:");
        int year3 = sc2.nextInt();
        //С помощью метода "nextInt()" считываются целочисленные значения с возрастами студентов и сохраняются в переменные "year1", "year2" и "year3"
        var sc1 = new Scanner(System.in);//Создается еще один объект "Scanner" с именем "sc1", который читает данные из стандартного ввода
        System.out.print("Введите средний балл первого студента:");
        double number1 = sc1.nextDouble();
        System.out.print("Введите средний балл второго студента:");
        double number2 = sc1.nextDouble();
        System.out.print("Введите средний балл третьего студента:");
        double number3 = sc1.nextDouble();//С помощью метода "nextDouble()" считываются значения средних баллов студентов и сохраняются в переменные "number1", "number2" и "number3"

        student.println(name1 +" "+ year1 + " " + number1);
        student.println(name2 +" "+ year2 +" "+ number2);
        student.println(name3 +" "+ year3 +" "+ number3);
        //С помощью метода "println()" происходит запись информации о студентах в файл "studentsInformation.txt"
        student.close(); //Закрывается объект "PrintWriter" с помощью метода "close()"
        }
        catch (Exception e){//если код был выполнен некорретно, то будет выводиться описание более точное для ошибки
            System.out.print(e);
        }
    }
}