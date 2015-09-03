package cc.cygni.commandgen.commands;

import java.util.ArrayList;

public abstract class Command {
	public String name;
	public ArrayList<String> args;
	
	protected String compile(String name, ArrayList<String> arg) {
		String ret = "/" + name + " ";
		for (String x: arg) {
			ret += x + " ";
		}
		return ret;
	}
}