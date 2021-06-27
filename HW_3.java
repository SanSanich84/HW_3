package HomeWork_3;
import java.util.Scanner;
import java.util.Random;
/*Написать игру в угадай слово:
        Создать массив из слов (из этих или других)
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear",
        "pepper", "pineapple", "pumpkin", "potato"}.
        При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя, сравнивает его с загаданным словом и сообщает, правильно ли ответил пользователь. Если слово не угадано, компьютер показывает буквы, которые стоят на своих местах.
        apple – загаданное
        apricot - ответ игрока
        ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
        Для сравнения двух слов посимвольно можно пользоваться:
        String str = "apple";
        char a = str.charAt(0); - метод, вернет char, который стоит в слове str на первой позиции
        Играем до тех пор, пока игрок не отгадает слово.
        Используем только маленькие буквы.
*/

public class HW_3 {
    public static void main(String[] args) {
        int counter,counter2 = 0;
        boolean bool=false;
        String[] words = {"яблоко", "груша", "банан", "кекс", "булочка","виноград","бублик","арбуз","бутерброд","вишня","апельсин"};
        Random rand = new Random();
        Scanner in = new Scanner(System.in);
        String choise_ai = words[rand.nextInt(words.length)];
        System.out.println(choise_ai);                            //Выбор компа. Для отладки.
        while (!bool==true){
        System.out.println("Введите ваш вариант: ");
        String choise_human = in.nextLine();
        if (choise_ai.equals(choise_human)) {
            System.out.println("Вы угадали!!!");
            bool = true;
        } else {
            System.out.println("Вы ошиблись!!! Попробуйте еще раз.");
            for (counter = 0;counter < choise_ai.length();counter++){
                char a = ' ';
                char b = ' ';
                a = choise_ai.charAt(counter);
                if (counter<choise_human.length()){
                b = choise_human.charAt(counter);
                }else{
                    b ='#';
                }
                    if (a == b){
                        System.out.print(a);
                    }else{
                        if (a!=b){
                        System.out.print("#");
                    }else{
                            break;
                        }
                    }
                }
            bool= false;
            System.out.println();
            }
        }
    }
}
