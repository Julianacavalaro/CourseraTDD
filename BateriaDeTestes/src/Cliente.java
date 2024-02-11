
public class Cliente {

		private boolean age;
		private boolean sub;
		private boolean notFTime;

		public Cliente(boolean age, boolean sub, boolean notFTime) {
			this.age = age;
			this.sub = sub;
			this.notFTime = notFTime;
		}
		
		public int calculateDiscount() {
			int discount = 0;
			if(!age ) {
				if(!sub) {
					if(!notFTime) {
						discount = 500;
					}else {
						discount = 250;
					}
				}else {
					discount = 250;
				}
			}else {
				discount = 0;
			}
			return discount;
			
		}

}
