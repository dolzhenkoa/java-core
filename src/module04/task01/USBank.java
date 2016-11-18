package module04.task01;

import module04.task02.Currency;

public class USBank extends Bank {

	public USBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
		super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
	}
	
	@Override
	public int getLimitOfWithdrawal() {
		if (getCurrency()==Currency.USD) {
			return 1000;
		} else if(getCurrency()==Currency.EUR) {
			return 1200;
		}
		
		return 0;
	}
	
	@Override
	public int getLimitOfFunding() {
		if(getCurrency()==Currency.EUR) {
			return 10000;
		}
		
		return 0;
	}
	
	@Override
	public int getMonthlyRate() {
		if (getCurrency()==Currency.USD) {
			return 1;
		} else if(getCurrency()==Currency.EUR) {
			return 2;
		}
		
		return 0;
	}
	
	@Override
	public int getCommission(int summ) {
		if (getCurrency()==Currency.USD) {
			if(summ<=1000) {
				return 7;
			} else {
				return 6;
			}
		} else if(getCurrency()==Currency.EUR) {
			if(summ<=1000) {
				return 8;
			} else {
				return 5;
			}
		}
		
		return 0;
	}
}
