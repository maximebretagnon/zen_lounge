package persistance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLDatabase
{	
	////Connection informations////
	private final String url = "jdbc:mysql://pandacoding.c0iuibsqekzw.us-west-2.rds.amazonaws.com:3306/ZenLounge";
	private final String login = "pandacoding";
    private final String pwd = "pandacoding";
    
    private Connection connexion = null;
    
    ////Singleton pattern////
    private static MySQLDatabase db;
        
    private MySQLDatabase(){
    	
    }
    
    public static MySQLDatabase getInstance(){
    	if(db == null)
    		db = new MySQLDatabase();
    	return db;
    }
    
    ////Standard database methods////
    public void open() {
    	/* Si la connexion n'existe pas, on l'ouvre */
    	if (connexion == null) {
	    	/* Chargement du driver */
			try {
			    Class.forName( "com.mysql.jdbc.Driver" );
			} catch ( ClassNotFoundException e ) {
			    /* G�rer les �ventuelles erreurs ici. */
			}
			
			/* Ouverture de la connexion */
	    	try {
			    connexion = DriverManager.getConnection( url, login, pwd );
			} catch ( SQLException e ) {
			    /* G�rer les �ventuelles erreurs ici */
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
    public ResultSet selectRequest(String request) {
    	open();
    	
    	/* Ex�cution d'une requ�te de lecture */
    	ResultSet resultat = null;
    	Statement statement = null;
		
    	try {
			statement = connexion.createStatement();
			resultat = statement.executeQuery(request);
		} catch (SQLException e1) {
			/* G�rer les �ventuelles erreurs ici */
		}
    	
    	return resultat;
    }
    public int insertRequest(String request) {
    	
    	int status = 0;
    	
    	/* Si la connexion n'existe pas, on l'ouvre */
    	if (connexion == null)
    		open();
    	
    	/* Ex�cution d'une requ�te d'�criture */
    	Statement statement = null;
		
    	try {
			statement = connexion.createStatement();
			status = statement.executeUpdate(request);
		} catch (SQLException e1) {
			System.err.println(e1.getMessage());
			status = -1;
		}
    	return status;
    }
}