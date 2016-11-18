package module04.task01;

import module04.task02.Currency;

public class EUBank extends Bank {

	public EUBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
		super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
	}

	@Override
	public int getLimitOfWithdrawal() {
		if (getCurrency()==Currency.USD) {
			return 2000;
		} else if(getCurrency()==Currency.EUR) {
			return 2200;
		}
		
		return 0;
	}
	
	@Override
	public int getLimitOfFunding() {
		if (getCurrency()==Currency.USD) {
			return 10000;
		} else if(getCurrency()==Currency.EUR) {
			return 20000;
		}
		
		return 0;
	}
	
	@Override
	public int getMonthlyRate() {
		if (getCurrency()==Currency.USD) {
			return 0;
		} else if(getCurrency()==Currency.EUR) {
			return 1;
		}
		
		return 0;
	}
	
	@Override
	public int getCommission(int summ) {
		if (getCurrency()==Currency.USD) {
			if(summ<=1000) {
				return 7;
			} else {
				return 2;
			}
		} else if(getCurrency()==Currency.EUR) {
			if(summ<=1000) {
				return 5;
			} else {
				return 4;
			}
		}
		
		return 0;
	}
}
