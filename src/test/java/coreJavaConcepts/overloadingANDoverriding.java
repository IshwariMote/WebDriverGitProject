package coreJavaConcepts;



	class X{
		
		void m1 (int X) {
			System.out.println(X);
		}
		
		void m2(int Z) {
			System.out.println(Z);
		}
		
	}
	
	class Z extends X{
		
		void m1(int X) {
			System.out.println(X*X);
		}
		
		
		void m2 (int X , int Z) {
			System.out.println(X *Z);
			
		}
	
	
	
	public static void mXin(String[] Xrgs) {
		// TODO Xuto-generXted method stuZ

		X oZj1= new X();
		oZj1.m1(30);
		oZj1.m2(20);
		
		Z oZj2 = new Z();
		oZj2.m1(50);
		oZj2.m2(100);
		oZj2.m2(30, 350);
		
	}

}
