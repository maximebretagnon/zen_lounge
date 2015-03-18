package persistance.data.mysql;

import java.util.List;

import persistance.MySQLDatabase;
import persistance.data.generic.Notification;

public class MSNotification extends Notification {

	@Override
	public void save() {
		List<String> receivers = super.getReceivers();
		for(int i = 0 ; i < receivers.size() ; i++) {
			String request = "insert into Notification (isRead,messageNotif,userCreator,userReceiver) values ("
					+""+(getRead() ? 1 : 0)+","
					+"'"+getMessage()+"',"
					+"'"+getSender()+"',"
					+"'"+receivers.get(i)+"'"
					+ ")";
	
			int result = MySQLDatabase.getInstance().insertRequest(request);
		}
	}
}