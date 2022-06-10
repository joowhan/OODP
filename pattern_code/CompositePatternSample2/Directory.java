import java.util.ArrayList;
import java.util.List;


public class Directory implements IFileSystem {

	private List<IFileSystem> fileSystems = new ArrayList<IFileSystem>();
	private int chmod = -1;
	private String name = "";

	public Directory(String name) {
		this.name = name;
	}

	@Override
	public void chmod(int mode) {
		this.chmod = mode;
		for (IFileSystem afileSystem : fileSystems) {
			afileSystem.chmod(mode);
		}
	}

	public void add(IFileSystem afileSystem){
		fileSystems.add(afileSystem);
	}

	public void remove(IFileSystem afileSystem){
		fileSystems.remove(afileSystem);
	}


	@Override
	public String toString() {
		return name + "(" + chmod + ")";
	}

	public String getStringTree() {
		if(this instanceof Directory) {
			return "+ " + name + "\n" + getStringTree(1);
		}
		else {
			return getStringTree();
		}
	}

	private String getStringTree(int depth) {
		StringBuffer sb = new StringBuffer();

		for(IFileSystem afilesystem : fileSystems) {
			if(afilesystem instanceof Directory) {
				for (int i = 0; i < depth; i++) {
					sb.append("     ");
				}
				sb.append("+ " + afilesystem.toString() + "\n");
				sb.append(((Directory)(afilesystem)).getStringTree(depth+1));
			}
			else {//file
				for (int i = 0; i < depth; i++) {
					sb.append("     ");
				}
				sb.append("- " + afilesystem.toString() + "\n");
			}
		}

		return sb.toString();
	}
}

