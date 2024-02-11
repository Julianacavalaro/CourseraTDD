
public class Cliente {

		private boolean _isSenior;
		private boolean _isAlreadySubsidized;
		private boolean _isPartTime;

		public Cliente(boolean age, boolean sub, boolean notFTime) {
			this._isSenior = age;
			this._isAlreadySubsidized = sub;
			this._isPartTime = notFTime;
		}
		
		public int calculateDiscount() {
			if(_isSenior ) return 0;
			if(_isAlreadySubsidized) return 250;
			if(_isPartTime) return 250;
				return 500;
			//int discount = 0;
		/*	if(_isSenior ) {//	discount = 0;
				return 0;
			}else {
				if(_isAlreadySubsidized) {//	discount = 250;
					return 250;
				}else {
					if(_isPartTime) {// discount = 250;
						return 250;
					}else {
						//discount = 500;
						return 500;
					}
				}
			}
			//	return discount;
			 */
			 
			}
}
		
