
public class File implements IFileSystem {

	private int chmod = -1;
	private String name = "";

	public File(String name) {
		this.name = name;
	}

	@Override
	public void chmod(int mode) {
		this.chmod = mode;
	}

	@Override
	public String toString() {
		return name + "(" + chmod + ")";
	}

	public String getStringTree() {
		return name + "(" + chmod + ")";
	}

}

