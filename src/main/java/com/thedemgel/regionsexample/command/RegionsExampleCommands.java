package com.thedemgel.regionsexample.command;

import org.spout.api.command.annotated.CommandPermissions;
import org.spout.api.command.CommandContext;
import org.spout.api.command.CommandSource;
import org.spout.api.command.annotated.Command;
import org.spout.api.exception.CommandException;

import com.thedemgel.regionsexample.RegionsExamplePlugin;

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
	@Command(aliases = {"command", "cmd"}, desc = "This is an example of what a command might look like. Try it out with /cmd !", min = 0, max = 0)
	@CommandPermissions("RegionsExample.some.permission")
	public void exampleCommand(CommandContext args, CommandSource source) throws CommandException {
		
		// Calling this command will send whoever issued it the message below.
		source.sendMessage("The RegionsExample plugin command has been successfully issued.");
	}
}
