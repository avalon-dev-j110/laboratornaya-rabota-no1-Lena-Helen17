package ru.avalon.java.dev.j10.labs.models;
import ru.avalon.java.dev.j10.labs.commons.Address;

import java.time.LocalDate;

/**
 * Представление о человеке.
 * <p>
 * С точки зрения задания человек представляется как сущность,
 * наделённая:
 * <ol>
 *     <li>именем;
 *     <li>паспортными данными;
 *     <li>пропиской по месту жительства.
 * </ol>
 */
public class Person extends Passport{

    public Person(String adres, int seriaNambre, String name, String surName, LocalDate happyBirsday, LocalDate dataVudachi, String ktoVudal) {
        super(adres, seriaNambre, name, surName, happyBirsday, dataVudachi, ktoVudal);
    }


    /**
     * Возврвщает полное имя человека.
     * <p>
     * Если у человека есть Имя, Фамилия и Отчество, то
     * возвращет Имя, Фимилию и Отчество, разделённые пробелом.
     * <p>
     * Если у человека нет Отчества, но есть второе имя, то
     * возвращает Имя, Первую букву второго имени, и Фамилию,
     * разделённые пробелом. После Инициала второго имени
     * должна стоять точка. Например, "Джером К. Джером".
     * <p>
     * Если у человека нет ни Отчества ни Второго имени, а
     * есть только Имя и Фамилия, то возвращает их, разделённые
     * пробелом.
     *
     * @return имя человека в виде строки.
     */
    public String getFullName() {
        /*
         * TODO(Студент): Закончить определение метода 'getFullName()' класса 'Person'
         */
        if (!getTwoName().isEmpty()) {
           String firstLetter = Character.toString(getTwoName().charAt(0));
            System.out.println(getName() + " " + firstLetter.toUpperCase() + ". " + getSurName());
        } else if (!getFatherName().isEmpty()) {
            System.out.println(getName() + " " + getFatherName() + " " + getSurName());
        } else
            System.out.println(getName() + " " + getSurName());
        return null;
    }

    /**
     * Возвращает адрес, по которому проживает человек.
     * <p>
     * Возвращаемый адрес соответствует месту постоянной
     * регистрации человека, согласно паспортным данным.
     *
     * @return адрес регистрации в виде строки.
     */
    public String getAddress() {
        /*
         * TODO(Студент): Закончить определение метода 'getAddress()' класса 'Person'
         */
             return getAddress();
    }

    @Override
    public String toString() {
        return getName() + "\n" + getFatherName() + "\n" + getTwoName() + "\n" + getSurName() + "\n" +
                getHappyBirsday() + "\n" + getSeriaNambre() + " " + getKtoVudal() + " " + getDataVudachi() + "\n" +
                getAdres();
    }
}