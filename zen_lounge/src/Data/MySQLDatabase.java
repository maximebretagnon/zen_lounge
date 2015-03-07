package Data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Data.Datas.*;


public class MySQLDatabase extends Database
{	
	////Connection informations////
	private final String url = "jdbc:mysql://pandacoding.c0iuibsqekzw.us-west-2.rds.amazonaws.com:3306/ZenLounge";
	private final String login = "pandacoding";
    private final String pwd = "pandacoding";
    
    private Connection connexion = null;
    
    ////ZenLounge informations////
    private MySQLUserData userData;
        
    private MySQLDatabase(){
    	
    }
    
    public static void setAsApplicationSGBD(){
    	if(db == null)
    		db = new MySQLDatabase();
    }
    
    
    ////Standard database methods////
    public void open() {
    	/* Si la connexion n'existe pas, on l'ouvre */
    	if (connexion == null) {
	    	/* Chargement du driver */
			try {
			    Class.forName( "com.mysql.jdbc.Driver" );
			} catch ( ClassNotFoundException e ) {
			    /* Gérer les éventuelles erreurs ici. */
			}
			
			/* Ouverture de la connexion */
	    	try {
			    connexion = DriverManager.getConnection( url, login, pwd );
			} catch ( SQLException e ) {
			    /* Gérer les éventuelles erreurs ici */
			}
    	}
    }
    public void close() {
	    if (connexion != null)
	        try {
	            /* Fermeture de la connexion */
	            connexion.close();
	        } catch ( SQLException ignore ) {
	            /* Si une erreur survient lors de la fermeture, il suffit de l'ignorer. */
	        }
    }
    private ResultSet selectRequest(String request) {
    	open();
    	
    	/* Exécution d'une requête de lecture */
    	ResultSet resultat = null;
    	Statement statement = null;
		
    	try {
			statement = connexion.createStatement();
			resultat = statement.executeQuery(request);
		} catch (SQLException e1) {
			/* Gérer les éventuelles erreurs ici */
		}
    	
    	return resultat;
    }
    private int insertRequest(String request) {
    	
    	int status = 0;
    	
    	/* Si la connexion n'existe pas, on l'ouvre */
    	if (connexion == null)
    		open();
    	
    	/* Exécution d'une requête de lecture */
    	Statement statement = null;
		
    	try {
			statement = connexion.createStatement();
			status = statement.executeUpdate(request);
		} catch (SQLException e1) {
			/* Gérer les éventuelles erreurs ici */
		}
    	return status;
    }

    public UserData getUser(String login,String pwd) throws SQLException {
    	if(userData != null && userData.getLogin().equals(login) && userData.getPwd().equals(pwd))
    		return userData;
    	
		String request = "SELECT firstName,lastName,phone,mail,address,login,pwd FROM User where login='"+login+"' and pwd='"+pwd+"'";
    	
    	ResultSet result = selectRequest(request);
    	
    	try
    	{
        	//Empty result => Wrong informations
			if(!result.next())
				return null;
			
	    	//Ouverture de session
	    	userData = new MySQLUserData();
	    	
	    	result.beforeFirst();
	    	while ( result.next() ) {
				userData.setFirstName(result.getString("firstName"));
				userData.setLastName(result.getString("lastName"));
				userData.setPhone(result.getString("phone"));
				userData.setMail(result.getString("mail"));
				userData.setAddress(result.getString("address"));
				userData.setLogin(result.getString("login"));
				userData.setPwd(result.getString("pwd"));
			}
		    /* On ferme le ResultSet */
		    result.close();

	    	return userData;
		} catch (NullPointerException e) {
			System.err.println(e.getMessage());
			return null;
		}
    	
    }
}