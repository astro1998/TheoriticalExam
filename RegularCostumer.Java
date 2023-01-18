public class RegularCostumer extends costumer{
	public RegularCustomer(String name, double amount) {
		super(name, amount);
    }
	@Override
    public double calculateBill() {
		return this.amount;
    }
}
