package com.SpringWithoutXml;


public class Pizza {
	
	private Pepsi pepsi;
	
		void deliver()
		{
			pepsi.drink();
			System.out.println("Deliver my pizza fast!! i am very hungry");
			
		}

		public Pepsi getPepsi() {
			return pepsi;
		}

		public void setPepsi(Pepsi pepsi) {
			this.pepsi = pepsi;
		}


		public Pizza(Pepsi pepsi) {
			super();
			this.pepsi = pepsi;
		}
	

}
