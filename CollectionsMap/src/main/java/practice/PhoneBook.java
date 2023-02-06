package practice;

import java.util.*;

public class PhoneBook {

    Scanner scanner = new Scanner(System.in);
    TreeMap<String, String> phone2name = new TreeMap<>();
    TreeSet<String> allContacts = new TreeSet<>();
    TreeSet<String> getName = new TreeSet<>();

    public void addContact(String phone, String name) {
        if (checkName(name) && checkPhone(phone)) {
            if (getContactByName(name).isEmpty()) {
                phone2name.put(phone, name);
                System.out.println("Контакт сохранен!");
            } else {
                for (Map.Entry<String, String> entry : phone2name.entrySet()){
                    String key = entry.getKey(); // получения ключа
                    String value = entry.getValue(); // получения ключа
                    phone2name.put(key + ", " + phone, name);
                    phone2name.remove(key, name);
                }
                System.out.println("Контакт сохранен!");
            }
        } else {
            System.out.println("Неверный формат ввода");
        }

        // проверьте корректность формата имени и телефона
        // (рекомедуется написать отдельные методы для проверки является строка именем/телефоном)
        // если такой номер уже есть в списке, то перезаписать имя абонента
    }

    public String getContactByPhone(String phone) {
        if (phone2name.containsKey(phone)) {
            for (Map.Entry<String, String> entry : phone2name.entrySet()){
                String key = entry.getKey(); // получения ключа
                String value = entry.getValue(); // получения ключа
                return value + " - " + phone;
            }
        } else {
            return "";
        }
        // формат одного контакта "Имя - Телефон"
        // если контакт не найдены - вернуть пустую строку
        return "";
    }

    public Set<String> getContactByName(String name) {
        if (phone2name.containsValue(name)) {
            for (Map.Entry<String, String> entry : phone2name.entrySet()){
                String key = entry.getKey(); // получения ключа
                String value = entry.getValue(); // получения ключа
                if (value.equals(name)) {
                    getName.add(name + " - " + key);
                }
            }
            System.out.println("Контакт обновлен!");
            return new TreeSet<>(getName);
        } else {
            return new TreeSet<>();
        }
        // формат одного контакта "Имя - Телефон"
        // если контакт не найден - вернуть пустой TreeSet
    }

    public Set<String> getAllContacts() {
        for (Map.Entry<String, String> entry : phone2name.entrySet()){
            String key = entry.getKey(); // получения ключа
            String value = entry.getValue(); // получения ключа
            System.out.println(value + " - " + key);
            allContacts.add(value + " - " + key);
        }
        // формат одного контакта "Имя - Телефон"
        // если контактов нет в телефонной книге - вернуть пустой TreeSet
        return new TreeSet<>(allContacts);
    }
    public boolean checkName(String name) {
        String regexName = "[а-яёА-ЯЁ]{" + name.length() + "}";
        if (name.matches(regexName) && !name.equals("")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkPhone(String phone) {
        String regexPhone = "[0-9]{" + phone.length() + "}";
        if (phone.matches(regexPhone) && !phone.equals("")) {
            return true;
        } else {
            return false;
        }
    }

    // для обхода Map используйте получение пары ключ->значение Map.Entry<String,String>
    // это поможет вам найти все ключи (key) по значению (value)
    /*
        for (Map.Entry<String, String> entry : map.entrySet()){
            String key = entry.getKey(); // получения ключа
            String value = entry.getValue(); // получения ключа
        }
    */
}