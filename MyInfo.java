package com.Personal;

public interface IProfile {
	public abstract void myBasicInfo();
	public abstract void myHobbies();
	public class GokulProfile implements IProfile {

		@Override
		public void myBasicInfo() {
			System.out.println("myBasicInfo : Gokul");
			System.out.println("myBasicInfo : CSE");
		}
	// TODO Auto-generated method stub
			
	@Override
		public void myHobbies() {
			System.out.println("myBasicInfo : riding bike");
			// TODO Auto-generated method stub
			
		}
	}
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
	

}
