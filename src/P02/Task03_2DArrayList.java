package P02;

import java.util.ArrayList;

public class Task03_2DArrayList {

    /*
      Task:

    Create 2D ArrayList which can store String ArrayLists
    Create 3 ArrayLists which are Employees, Employers, Companies
    Store this 3 ArrayList in 2D ArrayList
    String data type ArrayList'leri depolayabilen 2D ArrayList create ediniz
    Çalışanlar, İşverenler, Şirketler olmak üzere 3 ArrayListesi oluşturun
    Bu 3 ArrayList'i 2D ArrayList'te saklayın
     */

    public static void main(String[] args) {
        // Çalışanlar, İşverenler, Şirketler için ArrayList'ler oluşturun
        ArrayList<String> employees = new ArrayList<>();
        employees.add("John");
        employees.add("Alice");
        employees.add("Bob");

        ArrayList<String> employers = new ArrayList<>();
        employers.add("Company A");
        employers.add("Company B");
        employers.add("Company C");

        ArrayList<String> companies = new ArrayList<>();
        companies.add("Company X");
        companies.add("Company Y");
        companies.add("Company Z");

        // 2D ArrayList oluşturun ve 3 ArrayList'i içine yerleştirin
        ArrayList<ArrayList<String>> twoDArrayList = new ArrayList<>();
        twoDArrayList.add(employees);
        twoDArrayList.add(employers);
        twoDArrayList.add(companies);

        // 2D ArrayList'in içeriğini yazdırın
        System.out.println("2D ArrayList:");
        for (ArrayList<String> list : twoDArrayList) {
            System.out.println(list);
        }
    }
}
