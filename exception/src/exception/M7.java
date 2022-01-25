package exception;

		public class M7{
			void m() throws Exception {
			throw new java.io.IOException("Error");
			}
			void n()
			{
			m();
			}
			void p()
			{
			try {
			n();
			}
			catch (Exception e) {
			System.out.println(e); } }
			public static void main(String args[]){
			M7 obj = new M7();
			obj.p();
			System.out.println("Normal Flow");
			}

}
