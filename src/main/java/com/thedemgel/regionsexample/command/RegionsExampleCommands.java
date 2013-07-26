package com.thedemgel.regionsexample.command;

import org.spout.api.command.CommandSource;
import org.spout.api.exception.CommandException;

import com.thedemgel.regionsexample.RegionsExamplePlugin;
import org.spout.api.command.CommandArguments;
import org.spout.api.command.annotated.CommandDescription;
import org.spout.api.command.annotated.Permissible;

/**
 * Provides an example of a class to hold commands.
 */
public class RegionsExampleCommands {
	private final RegionsExamplePlugin plugin;

	public RegionsExampleCommands(RegionsExamplePlugin instance) {
		this.plugin = instance;
	}

	/**
	 * Provides an example command that can be issued to the Spout server.
	 */
	@CommandDescription(aliases = {"command", "cmd"}, desc = "This is an example of what a command might look like. Try it out with /cmd !")
	@Permissible("RegionsExample.some.permission")
	public void exampleCommand(CommandSource source, CommandArguments args) throws CommandException {
		
		// Calling this command will send whoever issued it the message below.
		source.sendMessage("The RegionsExample plugin command has been successfully issued.");
	}
}
