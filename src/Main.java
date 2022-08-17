import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Задание 1/2/3
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = "";
        String fullName2 = "Иванов Семён Семёнович";

        fullName = lastName + " " + firstName + " " + middleName;


        System.out.println("ФИО сотрудника - " + fullName);
        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + fullName.toUpperCase());
        System.out.println("Данные ФИО сотрудника - " + fullName2.replace("ё", "е"));



        System.out.println();
        //Разбор из видео урока
        String phone = "+604-157 53 52";
        phone = phone.replace("-", "");
        phone = phone.replace(" ", "");
        phone = phone.replace("+", "");

        if (phone.length() == 10) {
            phone = "7" + phone;
        } else if (phone.length() > 11) {
            throw new RuntimeException("Телефон длинный");
        } else if (phone.length() < 10) {
            throw new RuntimeException("Телефон короткий");
        } else if (phone.length() == 11 && phone.charAt(0) != '7') {
            throw new RuntimeException("Первая цифра не 7");
        }

        System.out.println(phone);

        //сравнить строки
        String expectedPhone = "76041575352";
        if (phone.equals(expectedPhone)) {
            System.out.println("Успех");
        } else {
            System.out.println("Неудача");
        }
    }
}