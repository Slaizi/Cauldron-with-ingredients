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

        System.out.println("Добро пожаловать! ");
        System.out.println("Какое зелье хотите создать? " +
                "\n1 -  Эликсир зоркости" +
                "\n2 -  Эликсир стойкости" +
                "\n3 -  Эликсир скрытности" +
                "\n4 -  Запретный эликсир");

        {
            int button = new Scanner(System.in).nextInt(); // Кнопка взаимодействия с пользователем

            if (button == 1) {
                System.out.println("Для эликсира зоркости нужно:\n3 Жабьих глаза + 1 кость ворона ");
                {
                    System.out.println();
                }
                System.out.println("Введите кол-во жабьих глаз: ");
                toadEyesCount = new Scanner(System.in).nextInt();
                System.out.println("Введите кол-во кости ворона: ");
                ravenBonesCount = new Scanner(System.in).nextInt();
                if (toadEyesCount >= 3 && ravenBonesCount >= 1) {
                    System.out.println("Вы приготовили эликсир зоркости! ");
                } else {
                    System.out.println("Недостаточно ингредиентов! ");
                }
            }

            if (button == 2) {
                System.out.println("Для эликсира стойкости нужно:\n2 кости ворона + 4 пельменя ");
                {
                    System.out.println();
                }
                System.out.println("Введите кол-во костей ворона: ");
                toadEyesCount = new Scanner(System.in).nextInt();
                System.out.println("Введите кол-во пелмений: ");
                dumplingsCount = new Scanner(System.in).nextInt();
                if (toadEyesCount >= 2 && dumplingsCount >= 4) {
                    System.out.println("Вы приготовили эликсир стойкости! ");
                }else {
                    System.out.println("Недостаточно ингредиентов! ");
                }
            }

            if (button == 3) {
                System.out.println("Для эликсира скрытности нужно:\n7 слез вурдалака + 1 пельмень + 2 жабьих глаза");
                System.out.println();
                System.out.println("Введите кол-во слез вурдалака: ");
                ghoulTearsCount = new Scanner(System.in).nextInt();
                System.out.println("Введите кол-во пелмений: ");
                dumplingsCount = new Scanner(System.in).nextInt();
                System.out.println("Введите кол-во жабьих глаз: ");
                toadEyesCount = new Scanner(System.in).nextInt();
                if (ghoulTearsCount >= 7 && dumplingsCount >= 1 && toadEyesCount >= 2) {
                    System.out.println("Вы приготовили эликсир скрытности!");
                }else {
                    System.out.println("Недостаточно ингредиентов! ");
                }
            }

            if (button == 4) {
                System.out.println("Для запретного эликсира нужно:\n5 слез вурдалака + 10 пельменей + 4 жабьих глаза + 3 кости ворона");
                System.out.println();
                System.out.println("Введите кол-во слез вурдалака: ");
                ghoulTearsCount = new Scanner(System.in).nextInt();
                System.out.println("Введите кол-во пелмений: ");
                dumplingsCount = new Scanner(System.in).nextInt();
                System.out.println("Введите кол-во жабьих глаз: ");
                toadEyesCount = new Scanner(System.in).nextInt();
                System.out.println("Введите кол-во костей ворона: ");
                ravenBonesCount = new Scanner(System.in).nextInt();
                if (ghoulTearsCount >= 5 && dumplingsCount >= 10 && toadEyesCount >= 4 && ravenBonesCount >= 3) {
                    System.out.println("Вы приготовили запретный эликсир! ");
                }else {
                    System.out.println("Недостаточно ингредиентов! ");
                }
            }
            if (button >= 5) {
                System.out.println("Ошибка");
            }
        }
    }
}





