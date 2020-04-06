package ru.avalon.java.dev.j10.labs.models;
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
class Passport {
     private int seriaNambre;
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
public Passport(Person person, int seriaNambre, LocalDate happyBirsday, LocalDate dataVudachi, String ktoVudal) {
        
        this.seriaNambre = seriaNambre;
        this.happyBirsday = happyBirsday;
        this.dataVudachi = dataVudachi;
        this.ktoVudal = ktoVudal;
        
    }
    
    public Passport(Person person, int seriaNambre, LocalDate dataVudachi, String ktoVudal) {
        
        this.seriaNambre = seriaNambre;
        this.dataVudachi = dataVudachi;
        this.ktoVudal = ktoVudal;
        
    }
    
    public Passport(Person person, int seriaNambre, LocalDate happyBirsday) {
        
        this.seriaNambre = seriaNambre;
        this.happyBirsday = happyBirsday;
        
    }
    
     public Passport(Person person) {
     
     }

    

   
    public void setSeriaNambre(int seriaNambre) {
        this.seriaNambre = seriaNambre;
    }

    public void setHappyBirsday(LocalDate happyBirsday) {
        this.happyBirsday = happyBirsday;
    }

    public void setDataVudachi(LocalDate dataVudachi) {
        this.dataVudachi = dataVudachi;
    }

    public void setKtoVudal(String ktoVudal) {
        this.ktoVudal = ktoVudal;
    }

    public int getSeriaNambre() {
        return seriaNambre;
    }

    public LocalDate getHappyBirsday() {
        return happyBirsday;
    }

    public LocalDate getDataVudachi() {
        return dataVudachi;
    }

    public String getKtoVudal() {
        return ktoVudal;
    }
    
     

    
    
    
}

