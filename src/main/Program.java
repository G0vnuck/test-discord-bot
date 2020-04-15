package main;

import javax.security.auth.login.LoginException;
import net.dv8tion.jda.api.AccountType;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;

public class Program {
	public static JDA builder;
	public static String prefix = ">";
	
	// main method
	public static void main(String[] args) throws LoginException {
		builder = new JDABuilder(AccountType.BOT).setToken("NjYwMTYwODEzNjk2NDE3ODA4.XgY0yw.T81UQz5YwaJkr3fTyJYFg8vWXSo").build();
		builder.getPresence().setStatus(OnlineStatus.IDLE);
		
		builder.addEventListener(new Commands());
	}
}
