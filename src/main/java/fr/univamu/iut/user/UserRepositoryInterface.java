package fr.univamu.iut.user;
import java.util.ArrayList;
public interface UserRepositoryInterface {

    public void close();
    public User getUser( String id );

    /**
     * Méthode retournant la liste des users
     * @return une liste d'objets users
     */
    public ArrayList<User> getAllUsers() ;
}