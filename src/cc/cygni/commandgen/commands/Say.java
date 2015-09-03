package cc.cygni.commandgen.commands;

import java.util.ArrayList;

public class Say extends Command {
	public String name = "say";
	public ArrayList<String> args = new ArrayList<String>(1);
	
	public Say(String arg) {
		args.add(arg);
	}
	
	public String compile() {
		return super.compile(name, args);
	}
}
