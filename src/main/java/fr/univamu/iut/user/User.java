package fr.univamu.iut.user;

public class User {

    /**
     * id de l'utilisateur
     */
    protected String id;

    /**
     * nom de l'utilisateur
     */
    protected String name;

    /**
     *mdp
     */
    protected String pwd;

    /**
     * Mail

     */
    protected String mail;

    /**
     * Constructeur par défaut
     */

    /**
     * Constructeur de livre
     * @param id
     * @param name
     * @param pwd
     * @param mail
     */
    public User(String id, String name, String pwd, String mail){
        this.id = id;
        this.name = name;
        this.pwd = pwd;
        this.mail = mail;
    }

    /**
     * Méthode permettant d'accéder à la réference du livre
     * @return un chaîne de caractères avec la référence du livre
     */
    public String getId() {
        return id;
    }

    /**
     * Méthode permettant d'accéder au titre du livre
     * @return un chaîne de caractères avec le titre du livre
     */
    public String getName() {
        return name;
    }

    /**
     * Méthode permettant d'accéder aux auteurs du livre
     * @return un chaîne de caractères avec la liste des auteurs
     */
    public String getPwd() {
        return pwd;
    }

    /**
     * Méthode permettant d'accéder au statut du livre
     * @return
     */
    public String getMail() {
        return mail;
    }

    /**
     * Méthode permettant de modifier la référence du livre
     * @param id une chaîne de caractères avec la référence à utiliser
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Méthode permettant de modifier le titre du livre
     * @param name une chaîne de caractères avec le titre à utiliser
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Méthode permettant de modifier les autheurs du livre
     * @param pwd une chaîne de caractères avec la liste des auteurs
     */
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    /**
     * Méthode permettant de modifier le statut du livre
     * @param mail le caractère 'r' pour réservé, 'e' pour emprunté, ou 'd' pour disponible
     */
    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                ", mail=" + mail +
                '}';
    }
}