package fr.diginamic.composite;

public class TestComposite {
    public static void main(String[] args) {
        Service dsin = new Service("DSIN");
        Employe directeur = new Employe("Raspey","Cécile ", 10_000);
        Employe architecte = new Employe("Bechkar","Bilel ", 8_000);
        dsin.getElements().add(directeur);
        dsin.getElements().add(architecte);

        Service bigData = new Service("Big Data");
        Employe chefDeServiceBigData = new Employe("Ranmey","JB ", 7_500);
        Employe concepteur = new Employe("Doe","Jane ", 3_500);
        bigData.getElements().add(chefDeServiceBigData);
        bigData.getElements().add(concepteur);

        Service javaDev = new Service("Java Dev");
        Employe chefDeServiceJavaDev = new Employe("Guineau","Kevin ", 7_500);
        Employe leadDev = new Employe("Martin","Paul ", 3_500.254);
        javaDev.getElements().add(chefDeServiceJavaDev);
        javaDev.getElements().add(leadDev);

        dsin.getElements().add(bigData);
        dsin.getElements().add(javaDev);

        System.out.println(dsin);
        System.out.println(dsin.calculerSalaire());
    }
}
