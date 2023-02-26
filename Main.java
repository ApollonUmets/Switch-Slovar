import java.util.Scanner;

public class Main {
    //Описание занятия: Задание (на использование switch):
    //Напишите программу "Словарь". Пользователь вводит с клавиатуры слово.
    //Программа выводит на экран его перевод. Если слова нет в словаре, программа выводит сообщение "Перевод слова Х отсутствует в словаре".
    public static void main(String[] args) {
        Scanner dictionary = new Scanner(System.in);
        System.out.println("Enter the word you would like to be translated");
        String word = dictionary.next();

        switch (word) {
            case "machine" -> System.out.println("Машина");
            case "laptop" -> System.out.println("ноутбук");
            case "lesson" -> System.out.println("урок");
            default -> System.out.println(" The translation of word " + word + "is absent");


        }


    }
}