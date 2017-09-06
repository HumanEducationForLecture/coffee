package com.coffee.controller;

import com.coffee.controller.action.*;
import com.coffee.controller.action.PostListAction;

public class ActionFactory {
	private static ActionFactory instance=new ActionFactory();
	
	private ActionFactory(){
		super();
	}
	public static ActionFactory getInstance(){
		return instance;
	}
	public Action getAction(String command){
		Action action=null;
		System.out.println("ActionFactory :"+command);
		if(command.equals("post_list")){
			action=new PostListAction();
		}
		return action;
	}

}
