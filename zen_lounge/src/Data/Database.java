package Data;

import Data.Datas.*;

public abstract class Database
{
	////Singleton pattern////
	protected static Database db;

    public static void setAsApplicationSGBD(){}
	public static Database getDatabase() {
		return db;
	}
	
	////Standard Database methods////
    public abstract void open();
    public abstract void close();
    
    ////ZenLounge methods////
    public abstract UserData getUser(String login,String pwd) throws Exception;
}