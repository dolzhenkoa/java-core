package module04.task01;

import module04.task02.Currency;

public class ChinaBank extends Bank {

	public ChinaBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
		super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
	}
	
	@Override
	public int getLimitOfWithdrawal() {
		if (getCurrency()==Currency.USD) {
			return 100;
		} else if(getCurrency()==Currency.EUR) {
			return 150;
		}
		
		return 0;
	}
	
	@Override
	public int getLimitOfFunding() {
		if (getCurrency()==Currency.USD) {
			return 10000;
		} else if(getCurrency()==Currency.EUR) {
			return 5000;
		}
		
		return 0;
	}
	
	@Override
	public int getMonthlyRate() {
		if (getCurrency()==Currency.USD) {
			return 1;
		} else if(getCurrency()==Currency.EUR) {
			return 0;
		}
		
		return 0;
	}
	
	@Override
	public int getCommission(int summ) {
		if (getCurrency()==Currency.USD) {
			if(summ<=1000) {
				return 5;
			} else {
				return 10;
			}
		} else if(getCurrency()==Currency.EUR) {
			if(summ<=1000) {
				return 3;
			} else {
				return 11;
			}
		}
		
		return 0;
	}
}
