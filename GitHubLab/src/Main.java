class Main {
	public static void main(String arg[]) {
		SoPhuc a = new SoPhuc(2.f, 3.f);
		SoPhuc b = new SoPhuc(4.f, 5.f);
		System.out.println(a.toString());
		System.out.println(b.toString());
		System.out.println(a.cong(b).toString());
	}
}
