public class Main {
		public static void main(String[] args) {
			Customer c = new RegularCustomer("Mike", 180);
			RegularCustomer rc = new RegularCustomer("Mae", 170);
			SeniorCustomer sc = new SeniorCustomer("bjorn", 300);
			
			// print bill for regular customer
			System.out.println("Bill for regular customer: " + c.calculateBill());
			
			// print bill for regular customer
			System.out.println("Bill for regular customer: " + rc.calculateBill());

			// print bill for senior customer
			System.out.println("Bill for senior customer: " + sc.calculateBill());
		}
		}
