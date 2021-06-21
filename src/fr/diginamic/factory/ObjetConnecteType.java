package fr.diginamic.factory;

public enum ObjetConnecteType {

    UNKNOW_TYPE(ObjetConnecte.class),
    TELEPHONE_PORTABLE(TelephonePortable.class),
    TABLETTE(Tablette.class),
    ENCEINTE_CONNECTE(EnceinteConnecte.class);

    private final Class<? extends ObjetConnecte> CLASS;

    ObjetConnecteType(Class<? extends ObjetConnecte> classType) {
        this.CLASS = classType;
    }

    public Class<? extends ObjetConnecte> getClassType() {
        return CLASS;
    }
}
