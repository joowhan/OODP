
public class Client {

	public static void main(String[] args) {

		File file1 = new File("File1");
		File file2 = new File("File2");
		File file3 = new File("File3");
		File file4 = new File("File4");
		File file5 = new File("File5");
		File file6 = new File("File6");

		Directory root = new Directory("root");
		Directory directory1 = new Directory("directory1");
		Directory directory2 = new Directory("directory2");
		Directory directory3 = new Directory("directory3");

		directory1.add(file1);
		directory1.add(file2);
		directory1.add(file3);

		directory2.add(file4);

		directory3.add(file5);
		directory3.add(file6);

		directory2.add(directory3);

		root.add(directory1);
		root.add(directory2);

		root.chmod(100);

		System.out.println(root.getStringTree());

	}
}

