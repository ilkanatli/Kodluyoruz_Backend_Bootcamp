public class OgrenciBilgiSistemi {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Ferhat Yilmaz", "05551237845", "TRH");
        Teacher t2 = new Teacher("Ahmet Sanlı", "05459876325", "FZK");
        Teacher t3 = new Teacher("Erkan Kutlu", "05334569898", "BIO");

        Course tarih = new Course("Tarih", "101", "TRH");
        tarih.addTeacher(t1);

        Course fizik = new Course("Fizik", "102", "FZK");
        fizik.addTeacher(t2);

        Course biyoloji = new Course("Biyoloji", "103", "BIO");
        biyoloji.addTeacher(t3);


        Student s1 = new Student("Ali Tufan", "123", "4", tarih, fizik, biyoloji);
        s1.addBulkExamNote(100, 70, 50);
        s1.addBulkExamPerformanceNote(70, 60, 50);
        s1.printNote();
        s1.isPass();

        Student s2 = new Student("Hasan Can", "444", "4", tarih, fizik, biyoloji);
        s2.addBulkExamNote(50, 90, 70);
        s2.addBulkExamPerformanceNote(40,50, 60);
        s2.printNote();
        s2.isPass();

        Student s3 = new Student("Basri Kan", "444", "4", tarih, fizik, biyoloji);
        s3.addBulkExamNote(10, 20, 15);
        s3.addBulkExamPerformanceNote(15, 25, 40);
        s3.printNote();
        s3.isPass();

    }
}
