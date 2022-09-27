public class Mainportal {

	public static void main(String[] args) {
		Email em1=new Email("sam","mathew");
		Email em2=new Email("john","anthony");
		Email em3=new Email("raj","anand");
		Email em4=new Email("jai","prakash");
		System.out.println(em1.showinfo());
		System.out.println(em2.showinfo());
		System.out.println(em3.showinfo());
		System.out.println(em4.showinfo());
	}
}