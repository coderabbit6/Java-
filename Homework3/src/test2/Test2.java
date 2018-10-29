package test2;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		//���������շѶ���
//		CinemaTicket c = new CinemaTicket();
//		c.charge();
//		TaxCharge t = new TaxCharge(4.6);
//		t.charge();
		Parking p = new Parking(9,14);
		p.charge();
	}

}
	interface Charge{	//�����շѽӿ�
		void charge();
		
	}
	class CinemaTicket implements Charge{	//��ӰƱ
		public void charge() {		//�շѷ���ʵ��
			Scanner in = new Scanner(System.in);
			System.out.println("please choose your ticket's type:");
			System.out.println(" '1' : '2D' ; '2' : '3D' ;'3':'vip';");
			int t = in.nextInt();
			float price = 0;
			switch (t){
			case 1 : price = 50;break;
			case 2 : price = 60;break;
			case 3 : price = 100;break;
			}
			System.out.println("do you hava vip card? 1/yes; 2/no ");	//ȷ���ǲ��ǻ�Ա
			int s = in.nextInt();
			if(s == 1) {
				price = price/2;
			}
			System.out.println("you should take " + price +" yuan;");
		}
	}
	class TaxCharge implements Charge{	//���⳵��
		private double distance;
		private double price;
		public TaxCharge(double a){
			this.distance = a;
		}
		@Override
		public void charge() {
			if(this.getDistance()<=3) {
				setPrice(8);
			}
			else setPrice(8+(distance-3)/0.8);
			System.out.println("the distance is " + getDistance() + " km");
			System.out.println("you take " + price + " yuan !");
			
		}
		private void setPrice(double i) {
			this.price = i;
		}
		public double getDistance() {
			// TODO Auto-generated method stub
			return this.distance;
		}
	}
		class Parking implements Charge{	//ͣ���շ�
			private int starttime;
			private int endtime;
			private double price;
			public Parking(int s,int e) {
				this.starttime = s;
				this.endtime = e;
			}
			public void charge() {		//�շѷ���
				if(starttime>8&&endtime<20){		//��˵㵽��˵�
					setprice(4*(endtime-starttime));
				}
				else if(starttime<8&&endtime>20) {
					setprice(10);
				}
				System.out.println("you take " + price + " yuan!");
			}
			private void setprice(double i) {
				this.price = i;
			}
		}