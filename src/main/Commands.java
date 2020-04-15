package main;

import java.awt.Color;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Commands extends ListenerAdapter {
	
	// received event method
	public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
		String[] args = event.getMessage().getContentRaw().split(" ");
		
		if(args[0].equalsIgnoreCase(Program.prefix + "egor")) {
			event.getChannel().sendMessage("pidor!").queue();
		}
		else if(args[0].equalsIgnoreCase(Program.prefix + "info")) {
			EmbedBuilder info = new EmbedBuilder();
			info.setTitle("Information");
			info.setDescription("Negative uebok");
			info.setColor(Color.PINK);
			event.getChannel().sendMessage(info.build()).queue();
			info.clear();
		}
	}
}
