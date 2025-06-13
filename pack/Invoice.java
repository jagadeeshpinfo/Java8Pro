package pack;

 class Invoice {
	public static String formatId(String oldId) {
		return oldId+="_Invoice";
	}

}
class SalesInvoice extends Invoice{
	public static String formatId(String oldId) {
		return oldId+="_SalesInvoice";
	}
	
}

