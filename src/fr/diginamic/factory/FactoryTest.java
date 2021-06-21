package fr.diginamic.factory;

public class FactoryTest {
    public static void main(String[] args) {
        try {
            System.out.println(ObjetConnecteFactory.getInstance(ObjetConnecteType.TELEPHONE_PORTABLE, 12));
            System.out.println(ObjetConnecteFactory.getInstance(ObjetConnecteType.TABLETTE, 12));
            System.out.println(ObjetConnecteFactory.getInstance(ObjetConnecteType.ENCEINTE_CONNECTE, 12));
            System.out.println(ObjetConnecteFactory.getInstance(ObjetConnecteType.UNKNOW_TYPE, 12));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
