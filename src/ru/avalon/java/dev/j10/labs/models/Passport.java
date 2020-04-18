package ru.avalon.java.dev.j10.labs.models;
import ru.avalon.java.dev.j10.labs.commons.Address;

import java.time.LocalDate;
/**
 * Представление о паспортных данных человека.
 * <p>
 * Паспортные данные должны включать:
 * <ol>
 *  <li> серию и номер документа;
 *  <li> имя;
 *  <li> фамилию;
 *  <li> отчество;
 *  <li> второе имя;
 *  <li> день рождения;
 *  <li> дату выдачи;
 *  <li> орган, выдавший документ.
 * </ol>
 */
public class Passport {
    private int seriaNambre;
    private String name;
    private String surName;
    private String fatherName = "";
    private String twoName = "";
    private LocalDate happyBirsday;
    private LocalDate dataVudachi;
    private String ktoVudal;

    /*
     * TODO(Студент): Закончить определение класса.
     *
     * 1. Объявить атрибуты класса.
     *
     * 2. Определить необходимые методы класса. Подумайте о
     *    том, какие методы должны существовать в классе,
     *    чтобы обеспечивать получение всей необходимой
     *    информации о состоянии объектов данного класса.
     *    Все ли поля обязательно будут проинициализированы
     *    при создании экземпляра?
     *
     * 3. Создайте все необходимые конструкторы класса.
     *
     * 4. Помните о возможности существования перегруженных
     *    конструкторов.
     *
     * 5. Обеспечте возможность использования класса за
     *    пределами пакета.
     */

    public Passport(int seriaNambre, String name, String surName, LocalDate happyBirsday, LocalDate dataVudachi, String ktoVudal) {
        this.seriaNambre = seriaNambre;
        this.name = name;
        this.surName = surName;
        this.happyBirsday = happyBirsday;
        this.dataVudachi = dataVudachi;
        this.ktoVudal = ktoVudal;
    }

    public String getFullName() {
        if (!getTwoName().isEmpty()) {
            String firstLetter = Character.toString(getTwoName().charAt(0));
            System.out.println(getName() + " " + firstLetter.toUpperCase() + ". " + getSurName());
        } else if (!getFatherName().isEmpty()) {
            System.out.println(getName() + " " + getFatherName() + " " + getSurName());
        } else
            System.out.println(getName() + " " + getSurName());
        return null;
        }

    public int getSeriaNambre() {
        return seriaNambre;
    }

    public void setSeriaNambre(int seriaNambre) {
        this.seriaNambre = seriaNambre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getTwoName() {
        return twoName;
    }

    public void setTwoName(String twoName) {
        this.twoName = twoName;
    }

    public LocalDate getHappyBirsday() {
        return happyBirsday;
    }

    public void setHappyBirsday(LocalDate happyBirsday) {
        this.happyBirsday = happyBirsday;
    }

    public LocalDate getDataVudachi() {
        return dataVudachi;
    }

    public void setDataVudachi(LocalDate dataVudachi) {
        this.dataVudachi = dataVudachi;
    }

    public String getKtoVudal() {
        return ktoVudal;
    }

    public void setKtoVudal(String ktoVudal) {
        this.ktoVudal = ktoVudal;
    }

    @Override
    public String toString() {
        return  getName () +  " \n "  + getFatherName () +  " \n "  + getTwoName () +  " \n "  + getSurName () +  " \n "  +
                getHappyBirsday () +  " \n "  + getSeriaNambre () +  "  "  + getKtoVudal () +  "  "  + getDataVudachi () +  "\n";
    }
}
