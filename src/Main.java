import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Рецепты Эликсиров:
        // 1. 3 Жабьих глаза + 1 кость ворона - Эликсир зоркости
        // 2. 2 кости ворона + 4 пельменя - Эликсир стойкости
        // 3. 7 слез вурдалака + 1 пельмень + 2 жабьих глаза - Эликсир скрытности
        // 4. 5 слез вурдалака + 10 пельменей + 4 жабьих глаза + 3 кости ворона - Запретный эликсир

        int toadEyesCount = 0;          //Жабьи глаза
        int ghoulTearsCount = 0;        //Слезы вурдалака
        int ravenBonesCount = 0;        //Кости ворона
        int dumplingsCount = 0;         //Пельмени(а почему, собственно нет? xD )
        while (true) {
            System.out.println();
            System.out.println("Добро пожаловать!\n");
            System.out.println("Какое зелье хотите создать?\n" +
                    "\n1 -  Эликсир зоркости" +
                    "\n2 -  Эликсир стойкости" +
                    "\n3 -  Эликсир скрытности" +
                    "\n4 -  Запретный эликсир" +
                    "\n5 -  Выход");
            {
                int button = inputCommands(); // Кнопка взаимодействия с пользователем

                if (button == 1) {
                    System.out.println("Для эликсира зоркости нужно:\n3 Жабьих глаза + 1 кость ворона\n");
                    {
                        System.out.println();
                    }
                    toadEyesCount = inputEyes();
                    ravenBonesCount = inputCount();
                    if (toadEyesCount >= 3 && ravenBonesCount >= 1) {
                        System.out.println("Вы приготовили эликсир зоркости! ");
                    } else {
                        System.out.println("Недостаточно ингредиентов! ");
                    }

                } else if (button == 2) {
                    System.out.println("Для эликсира стойкости нужно:\n2 кости ворона + 4 пельменя\n");
                    System.out.println();
                    ravenBonesCount = inputCount();
                    dumplingsCount = inputDumpling();
                    if (toadEyesCount >= 2 && dumplingsCount >= 4) {
                        System.out.println("Вы приготовили эликсир стойкости! ");
                    } else {
                        System.out.println("Недостаточно ингредиентов! ");
                    }

                } else if (button == 3) {
                    System.out.println("Для эликсира скрытности нужно:\n7 слез вурдалака + 1 пельмень + 2 жабьих глаза\n");
                    System.out.println();
                    ghoulTearsCount = inputQhoul();
                    dumplingsCount = inputDumpling();
                    toadEyesCount = inputEyes();
                    if (ghoulTearsCount >= 7 && dumplingsCount >= 1 && toadEyesCount >= 2) {
                        System.out.println("Вы приготовили эликсир скрытности!");
                    } else {
                        System.out.println("Недостаточно ингредиентов! ");
                    }

                } else if (button == 4) {
                    System.out.println("Для запретного эликсира нужно:\n5 слез вурдалака + 10 пельменей + 4 жабьих глаза + 3 кости ворона\n");
                    System.out.println();
                    ghoulTearsCount = inputQhoul();
                    dumplingsCount = inputDumpling();
                    toadEyesCount = inputEyes();
                    ravenBonesCount = inputCount();
                    if (ghoulTearsCount >= 5 && dumplingsCount >= 10 && toadEyesCount >= 4 && ravenBonesCount >= 3) {
                        System.out.println("Вы приготовили запретный эликсир! ");
                    } else {
                        System.out.println("Недостаточно ингредиентов! ");
                    }
                } else if (button == 5) {
                    break;
                } else {
                    System.out.println("Error");
                }
            }
        }
    }

    public static int inputEyes() {
        System.out.println("Введите кол-во жабьих глаз: ");
        return new Scanner(System.in).nextInt();
    }

    public static int inputCount() {
        System.out.println("Введите кол-во кости ворона: ");
        return new Scanner(System.in).nextInt();
    }

    public static int inputDumpling() {
        System.out.println("Введите кол-во пелмений: ");
        return new Scanner(System.in).nextInt();
    }

    public static int inputQhoul() {
        System.out.println("Введите кол-во слез вурдалака: ");
        return new Scanner(System.in).nextInt();
    }
    public static int inputCommands(){
       return new Scanner(System.in).nextInt();
    }
}





