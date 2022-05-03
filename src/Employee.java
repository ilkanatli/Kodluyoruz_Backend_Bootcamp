public class Employee {
    //Nitelikler
    String name;
    double salary;
    int workHours;
    int hireYear;

    //Constructor(Yapıcı) metot
    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    //Metotlar
    double tax() {
        if (this.salary < 2000) {
            return this.salary;
        } else {
            return this.salary * 0.03;
        }
    }

    double bonus() {
        if (this.workHours > 40) {
            return (this.workHours - 40) * 30;
        } else {
            return 0;
        }
    }

    double raiseSalary() {
        int year = 2021 - this.hireYear;
        if (year < 10) {
            return this.salary * 0.05;
        } else if ((year >= 10) && (year <= 20)) {
            return this.salary * 0.10;
        } else {
            return this.salary * 0.15;
        }
    }
    void employeeInfo() {
        System.out.println("Isim : " + this.name);
        System.out.println("Maasi : " + this.salary);
        System.out.println("Calisma Saati : " + this.workHours);
        System.out.println("Baslangic Yili : " + this.hireYear);
        System.out.println("Vergi : " + tax());
        System.out.println("Bonus : " + bonus());
        System.out.println("Maas Artisi : " + raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maas : " + ((this.salary + bonus()) - tax()));
        System.out.println("Toplam Maas : " + (this.salary + bonus() + raiseSalary() - tax()));
    }
}
