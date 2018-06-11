package com.Personal;
public class TestProfile {
static void Profile(IProfile profile){
		profile.myBasicInfo();
		profile.myHobbies();
	}
public static  void main(String[] args){
	IProfile myProfile = new GokulProfile();
	TestProfile.Profile(myProfile);
	
	

	}
}
