package com.rough;

import com.base.Page;
import com.pages.actions.SignInPage;

public class SignIn {

	public static void main(String[] args) throws InterruptedException {
		
		Page.initConfig();
		SignInPage signIn=Page.topnavigation.goToSignIn();
		signIn.loginIn("testuseribm@gmail.com", "Isabeljune30");
		Page.quitBrowser();
	}

}
