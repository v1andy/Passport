package umenu;

import controller.MainSystem;
import validator.PassId;

import java.util.Scanner;

public class Menu {

    MainSystem ms = new MainSystem();
    PassId pId = new PassId();

    public void reg() {
        String surname;
        String name;
        String id;
        System.out.println("Введите данные паспорта через пробел по следующему шаблону:(Имя Фамилия ID).");
        Scanner console1 = new Scanner(System.in);
        name = console1.next();
        surname = console1.next();
        id = console1.next();
        ms.regPassport(name, surname, id);
        if (pId.checkRightLength(id)) {
            System.out.println("Паспорт успешно зарегестрирован.");
        } else {
            System.out.println("Ошибка в введенном ID паспорта.");
        }
    }

    public void getPass() {
        String id;
        System.out.println("Введите ID паспорта.");
        Scanner console = new Scanner(System.in);
        id = console.next();
        if (pId.checkRightLength(id)) {
            System.out.println(ms.getInfoPass(id));
        } else {
            System.out.println("Неверный ID.");
        }
    }

    public static void main(String[] args) {

        boolean work = true;

        while (work) {
            Menu menu = new Menu();
            int i;
            System.out.println("Выберите действие: 1 - зарегистрировать новый паспорт; 2 - получить информацию о паспорте; 3 - выйти из программы.");
            Scanner console = new Scanner(System.in);
            i = console.nextInt();
            if (i == 1) {
                menu.reg();
                menu.getPass();
            } else if (i == 2) {
                menu.getPass();
            } else if (i == 3) {
             work = false;
            }
        }
    }

}
