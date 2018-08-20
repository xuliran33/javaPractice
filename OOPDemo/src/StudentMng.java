
public class StudentMng {
	String[] names = new String[30];
	
	public void addStudent(String name) {
		for (int i = 0; i < names.length; i++) {
			if (names[i] == null) {
				names[i] = name;
				break;
			}
		}
	}
	
	public void showStudent() {
		for (int i = 0; i < names.length; i++) {
			if (names[i] != null) {
				System.out.println(names[i]);
			}
		}
	}
	
	public boolean findStudent(int start, int end, String name) {
		boolean isFind = false;
		for (int i = start - 1; i < end - 1; i++) {
			String string = names[i];
			if (string.equals(name)) {
				isFind = true;
			}
		}
		
		return isFind;
	}
}
