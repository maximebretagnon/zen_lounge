package persistance.data.mysql;

import persistance.MySQLDatabase;
import persistance.data.generic.Speaker;

public class MSSpeaker extends Speaker {
	
    public MySQLDatabase mySQLDatabase;

	@Override
	public String save(String login) {
		String request = "insert into Speaker (job,shortDescription,detailedDescription,user) values ("
				+"'"+getJob()+"',"
				+"NULL,"
				+"NULL,"
				+"'"+login+"'"
				+ ")";

		int result = MySQLDatabase.getInstance().insertRequest(request);
		return null;
	}

	@Override
	public void load(String login) {
		// TODO Auto-generated method stub
		
	}
}
